/*
Student Number: ST10520899
Name: Baitumetse Botlhale Lekubu
*/
package com.example.campsitecommander

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Initialized as empty lists so the dashboard starts at zero
    companion object {
        var itemNames = arrayListOf<String>()
        var itemCategories = arrayListOf<String>()
        var itemQuantities = arrayListOf<Int>()
        var itemComments = arrayListOf<String>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // View Binding Declarations
        val txtTotalCount = findViewById<TextView>(R.id.txtTotalCount)
        val edtItemName = findViewById<EditText>(R.id.edtItemName)
        val edtCategory = findViewById<EditText>(R.id.edtCategory)
        val edtQuantity = findViewById<EditText>(R.id.edtQuantity)
        val edtComments = findViewById<EditText>(R.id.edtComments)
        val btnAddItem = findViewById<Button>(R.id.btnAddItem)
        val btnViewList = findViewById<Button>(R.id.btnViewList)

        // Calculate and refresh totals dynamically via loop logic
        fun updateCounter() {
            var grandTotal = 0
            // Loop functionality calculating cumulative packed list values
            for (qty in itemQuantities) {
                grandTotal += qty
            }
            txtTotalCount.text = grandTotal.toString()
        }

        // Run counting loop to display 0 at launch
        updateCounter()

        // Validation logic handling explicit user item additions
        btnAddItem.setOnClickListener {
            val name = edtItemName.text.toString().trim()
            val category = edtCategory.text.toString().trim()
            val qtyString = edtQuantity.text.toString().trim()
            val notes = edtComments.text.toString().trim()

            // Error handling for empty user inputs
            if (name.isEmpty() || category.isEmpty() || qtyString.isEmpty() || notes.isEmpty()) {
                Toast.makeText(this, "Please fill out all missing fields!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val qty = qtyString.toIntOrNull()
            if (qty == null || qty <= 0) {
                Toast.makeText(this, "Please insert a valid item quantity greater than 0", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Append input data dynamically into the running parallel arrays
            itemNames.add(name)
            itemCategories.add(category)
            itemQuantities.add(qty)
            itemComments.add(notes)

            // Dynamic UI counter update
            updateCounter()
            Toast.makeText(this, "$name added to campsite manifest!", Toast.LENGTH_SHORT).show()

            // Clear text entry boxes for subsequent additions
            edtItemName.text.clear()
            edtCategory.text.clear()
            edtQuantity.text.clear()
            edtComments.text.clear()
        }

        // Move to detailed view screen
        btnViewList.setOnClickListener {
            val intent = Intent(this, Detailed::class.java)
            startActivity(intent)
        }
    }
}