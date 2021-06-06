package com.example.bookdatabase.database

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class Operations {


    companion object {
        @JvmField
        val database =
            Firebase.database("https://bookdb-a54f6-default-rtdb.europe-west1.firebasedatabase.app/").reference
//https://book-database-6d27b-default-rtdb.europe-west1.firebasedatabase.app/
        const val TAG: String = "Operations"
    }
}