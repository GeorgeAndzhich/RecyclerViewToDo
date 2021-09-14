package com.example.resourceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter (var items : List<ListItem>):RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val itemTitle = itemView.findViewById<TextView>(R.id.textView3)
        val itemChecked = itemView.findViewById<Button>(R.id.checkBox)
        val button = itemView.findViewById<Button>(R.id.button2)
        val etAdd  = itemView.findViewById<EditText>(R.id.editTextTextPersonName)

        init {
            itemChecked.setOnClickListener{
                val position = adapterPosition
                Toast.makeText(itemView.context,"Clicked item on position : ${position + 1}" ,Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { // Inflate the layout
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { // Bind the data to our items.
        holder.itemTitle.text = items[position].ItemText

    }

    override fun getItemCount(): Int {
      return items.size
    }
}