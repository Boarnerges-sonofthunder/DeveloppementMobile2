package com.example.stationnement

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.lstStationnement)
        val arraylist = mutableListOf<Statio>()
        val alertDialogBuilder = AlertDialog.Builder(this)

        arraylist.add(Statio("disponible"))
        arraylist.add(Statio("disponible"))
        arraylist.add(Statio("disponible"))
        arraylist.add(Statio("disponible"))
        arraylist.add(Statio("disponible"))

        listview.adapter = MyAdapter(this,R.layout.contenu_list,arraylist)

        listview.setOnItemClickListener{ parent:AdapterView<*>, view: View, position:Int, id:Long ->
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            builder.setTitle("Enregistrement")
            val dialogLayout = inflater.inflate(R.layout.form_alert, null)
            val editText  = dialogLayout.findViewById<EditText>(R.id.editText)
            builder.setView(dialogLayout)
            builder.setPositiveButton("OK") { dialogInterface, i -> Toast.makeText(applicationContext, "EditText est " + editText.text.toString(), Toast.LENGTH_SHORT).show() }
            builder.show()
        }
    }
}