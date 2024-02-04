package com.example.activitylifecycle_ktl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.activitylifecycle_ktl.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        val button = findViewById<View>(R.id.add_button)
    }
}