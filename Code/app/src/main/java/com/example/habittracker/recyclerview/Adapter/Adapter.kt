package com.example.habittracker.recyclerview.Adapter

import android.content.Context
import android.sax.Element
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.habittracker.R
import com.example.habittracker.recyclerview.Models.ExampleItem

class ExampleAdapter(val context: Context,val elements: MutableList<ExampleItem>):
    RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.file_explorer_view,parent,false)
        return ExampleViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ExampleViewHolder,
        position: Int
    ) {
        val  currentItem = elements[position]
        holder.title.text = currentItem.title
        holder.description.text = currentItem.description
    }

    override fun getItemCount(): Int {
        return elements.size
    }

    inner class ExampleViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.title)
        val description: TextView = view.findViewById(R.id.description)
    }

}