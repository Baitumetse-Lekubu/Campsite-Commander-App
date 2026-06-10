# Campsite Commander

**Student Number:** ST10520899  
**Name:** Baitumetse Botlhale Lekubu  

---

## App Overview

**Campsite Commander** is your No.1 campsite inventory app. It helps campers organize and manage camping gear and food supplies efficiently. Users can add items, view a detailed packing checklist, and keep track of the total number of items packed.  

**Slogan:** *"Your No.:1 Campsite Inventory App"*  

---

## Features

1. **Splash Screen**
   - Displays the app name at the top.
   - Shows the logo in the center.
   - Fades in the slogan below the logo.
   - Automatically navigates to the Main Screen after 3 seconds.

2. **Main Screen**
   - Add new items to the packing list:
     - Item Name
     - Category
     - Quantity
     - Notes
   - Shows the total number of items packed.
   - Button to navigate to the Detailed View Screen.
   - Handles input errors (empty fields, non-numeric quantity).

3. **Detailed View Screen**
   - Displays a full checklist of items:
     - Item Name
     - Category
     - Quantity
     - Notes
   - “Back To Base” button returns to the Main Screen.
   - Scrollable list for long inventories.

4. **Data Storage**
   - Uses **parallel arrays** for items, categories, quantities, and notes.
   - Initialized with sample data.

5. **Loops and Calculations**
   - Loop calculates total number of items packed.
   - Loops display item details in the Detailed View Screen.

6. **Navigation**
   - Smooth transitions between Splash Screen → Main Screen → Detailed View Screen → Main Screen.

---

## Colour Scheme

| Colour Name   | Hex Code  |
|---------------|-----------|
| Forest Green  | #014421   |
| Grey          | #2F2F2F   |
| Beige         | #D2CBB1   |
| Off White     | #FAF9F6   |

---

## App Structure

**Kotlin Files** 
- `Splash.kt` – Handles splash screen animations and transition.
- `MainActivity.kt` – Main screen with add item form and total items calculation.
- `Detailed.kt` – Detailed checklist view of all packed items.

**Layout Files**
- `splash_screen.xml` – Splash screen layout.
- `activity_main.xml` – Main screen layout.
- `detailed_screen.xml` – Detailed checklist screen layout.

**Logo**
- File: `cclogo2.png`  
- Location: `src/main/res/drawable/cclogo2.png`  
- Colours: Off White background (#FAF9F6) and Grey/Charcoal text (#2F2F2F)

---

## How to Use

1. Open the app. The splash screen with logo and slogan will appear.
2. After 3 seconds, the app navigates to the Main Screen.
3. Add items by filling in all fields and pressing **Add Item**.
4. View the total number of items packed at the top.
5. Press **View Detailed Checklist** to see the full list of items.
6. Press **Back To Base** to return to the Main Screen.

---

## Dependencies

- Android Studio
- Kotlin
- AndroidX libraries:
  - `appcompat`
  - `constraintlayout`
  - `core-ktx`

---

## Notes

- The app uses **parallel arrays** for simplicity and demonstration purposes.
- Input validation ensures quantity is numeric and no field is left empty.
- Colour palette and design elements follow the provided specifications.

---

## Author

**Baitumetse Botlhale Lekubu**  
Student Number: ST10520899  

Campsite Commander – *Your No.:1 Campsite Inventory App*
