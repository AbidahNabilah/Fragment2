package com.example.fragmentexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentexample2.BookDescription
import com.example.fragmentexample2.BookTitle
import com.example.fragmentexample2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var fragBookDescription: BookDescription
    lateinit var fragBookTitle: BookTitle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragBookTitle = BookTitle()
        fragBookDescription = BookDescription()
        val fragTransaction = supportFragmentManager.beginTransaction()
        fragTransaction.add(R.id.fragtop, fragBookTitle)
        fragTransaction.add(R.id.fragbottom, fragBookDescription)
        fragTransaction.commit()

    }
     fun onBookChanged(index:Int) {
        fragBookDescription.changeDescription(index)
    }
}