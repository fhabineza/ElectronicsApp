package com.example.electronicsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private  lateinit var prodAdapter: ProductRecycleViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycleView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        prodAdapter.submitList(data)
    }

    private  fun initRecycleView(){
        recyId.layoutManager = LinearLayoutManager(this)
        prodAdapter  = ProductRecycleViewAdapter()
        recyId.adapter = prodAdapter
    }
}

