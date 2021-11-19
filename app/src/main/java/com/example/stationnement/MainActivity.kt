package com.example.stationnement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.lstStationnement)
        val arraylist = mutableListOf<Statio>()

        arraylist.add(Statio("disponible"))
        arraylist.add(Statio("disponible"))
        arraylist.add(Statio("disponible"))
        arraylist.add(Statio("disponible"))
        arraylist.add(Statio("disponible"))

        listview.setOnItemClickListener{ parent:AdapterView<*>, view: View, position:Int, id:Long ->
            
        }


    }
}