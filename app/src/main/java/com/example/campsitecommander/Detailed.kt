/*
Student Number: ST10520899
Name: Baitumetse Botlhale Lekubu
*/
package com.example.campsitecommander

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Detailed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailed_screen)

        val txtDisplayArea = findViewById<TextView>(R.id.txtDisplayArea)
        val btnBackBase = findViewById<Button>(R.id.btnBackBase)

        val builder = StringBuilder()

        // Check if the parallel arrays are empty to display an appropriate notice
        if (MainActivity.itemNames.isEmpty()) {
            builder.append("No items packed yet!\n")
            builder.append("Return to Base and populate your gear inventory.")
        } else {
            builder.append(String.format("%-15s | %-12s | %-5s\n", "ITEM", "CATEGORY", "QTY"))
            builder.append("-------------------------------------------\n")

            // Interfacing arrays iteratively utilizing parallel indexing loops
            for (i in MainActivity.itemNames.indices) {
                val currentItem = MainActivity.itemNames[i]
                val currentCat = MainActivity.itemCategories[i]
                val currentQty = MainActivity.itemQuantities[i]
                val currentNote = MainActivity.itemComments[i]

                // Format layout tabular structure output text
                builder.append(String.format("%-15s | %-12s | %-5d\n", currentItem, currentCat, currentQty))
                builder.append("💡 Note: $currentNote\n")
                builder.append("-------------------------------------------\n")
            }
        }

        // Render string contents to text display view elements
        txtDisplayArea.text = builder.toString()

        // Navigational return routing execution targets back to MainActivity
        btnBackBase.setOnClickListener {
            finish()
        }
    }
}