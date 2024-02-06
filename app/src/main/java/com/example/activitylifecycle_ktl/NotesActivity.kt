package com.example.activitylifecycle_ktl

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.floor

class NotesActivity : AppCompatActivity() {
    lateinit var notes: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)


        val recyclerView = findViewById<View>(R.id.notesView) as RecyclerView

        notes = resources.getStringArray(R.array.Notes)

        val button = findViewById<View>(R.id.add_button)
        button.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                val intent = Intent(this@NotesActivity, AddActivity::class.java)
                startActivity(intent)
            }

        })

        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, span())

        recyclerView.itemAnimator = DefaultItemAnimator()

        recyclerView.layoutManager = layoutManager

        val adapter: RecyclerView.Adapter<*> =
            CardAdapter(this, notes)

        recyclerView.adapter = adapter
    }

    private fun span(): Int {
        val screenWidth = Resources.getSystem().displayMetrics.widthPixels
        val cardWidth = resources.getDimension(R.dimen.cardview)
        return floor((screenWidth / cardWidth)).toInt()
    }

}