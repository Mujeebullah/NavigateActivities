package com.example.navigateactivities.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.navigateactivities.adapters.HobbiesAdpater
import com.example.navigateactivities.models.HobbiesCollection
import com.example.navigateactivities.R
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setupRecyclerView()

    }

    private fun setupRecyclerView() {
        var layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.layoutManager = layoutManager

        var adapter = HobbiesAdpater(
            this,
            HobbiesCollection.hobbies
        )
        recyclerView.adapter = adapter

    }
}
