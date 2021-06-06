package com.example.bookdatabase.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bookdatabase.R
import com.example.bookdatabase.fragments.BookFragment
import com.example.bookdatabase.fragments.MainFragment
import com.example.bookdatabase.interfaces.IActivityFragmentCommunication

class MainActivity : AppCompatActivity(), IActivityFragmentCommunication {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(MainFragment::class.java.name)
    }

    override fun openNextActivity() {
    }

    override fun replaceFragment(tag: String) = when (tag) {
        MainFragment::class.java.name -> {
            addMainFragment()
        }
        BookFragment::class.java.name -> {
            addBookFragment()
        }
        else -> println("Invalid tag!")
    }

    private fun addBookFragment() {
        val fragmentManager = this.supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = BookFragment::class.java.name
        val addTransaction = transaction.add(
            R.id.fragment_container, BookFragment.newInstance(), tag
        )
        addTransaction.commit()
    }

    private fun addMainFragment() {
        val fragmentManager = this.supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = MainFragment::class.java.name
        val addTransaction = transaction.add(
            R.id.fragment_container, MainFragment.newInstance(), tag
        )
        addTransaction.commit()
    }
}