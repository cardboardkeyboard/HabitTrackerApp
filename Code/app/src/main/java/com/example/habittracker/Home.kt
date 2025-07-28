package com.example.habittracker

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.habittracker.recyclerview.Adapter.ExampleAdapter
import com.example.habittracker.recyclerview.Models.ExampleItem

class Home : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ExampleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val exampleList = generateList(100)
        adapter = ExampleAdapter(this,exampleList)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }
    private fun generateList(size: Int): MutableList<ExampleItem>{
        val list = mutableListOf<ExampleItem>()
        for (i in 0 until size) {
            list.add(ExampleItem("Title $i", "Description $i"))
        }
        return list
    }
}