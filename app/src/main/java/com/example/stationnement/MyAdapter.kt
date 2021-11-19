package com.example.stationnement

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MyAdapter(var myContext: Context, var resource:Int,var items: List<Statio>): ArrayAdapter<Statio>(myContext,resource,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(myContext)
        val view:View = layoutInflater.inflate(resource,null)

        val txtDispo:TextView = view.findViewById(R.id.txtDispobilite)

        var myItem:Statio = items[position]
        txtDispo.text = myItem.status
        return view
    }
}