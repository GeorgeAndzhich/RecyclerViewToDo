package com.example.resourceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var itemList = mutableListOf<ListItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvDo = findViewById<RecyclerView>(R.id.recyclerView)
        var button = findViewById<Button>(R.id.button2)
        var etAdd = findViewById<EditText>(R.id.editTextTextPersonName)


        rvDo.layoutManager = LinearLayoutManager(this)
        var adapter = Adapter(itemList)
        rvDo.adapter = adapter

        button.setOnClickListener{
            val text = etAdd.text.toString()
            val add = itemList.add(ListItem(text, false))
            adapter.notifyItemInserted(itemList.size - 1)
        }

    }


}