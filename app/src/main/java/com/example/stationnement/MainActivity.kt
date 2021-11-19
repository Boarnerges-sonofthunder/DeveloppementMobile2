package com.example.stationnement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.lstStationnement)
        val arraylist = ArrayList<String>(10)
        arraylist.add("1")
        arraylist.add("2")
        arraylist.add("3")
        arraylist.add("4")
        arraylist.add("5")

        for (elem in arraylist)
        {
            
        }
    }
}