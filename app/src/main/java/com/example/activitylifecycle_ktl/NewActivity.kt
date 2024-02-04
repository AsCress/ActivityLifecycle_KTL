package com.example.activitylifecycle_ktl

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {
    private val TL = Toast.LENGTH_LONG
    private val AC = "New Activity"
    private var message = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        message = " onCreate() called"
        Toast.makeText(this, AC + message, TL).show()
    }

    override fun onStart() {
        super.onStart()
        message = " onStart() called"
        Toast.makeText(this, AC + message, TL).show()
    }

    override fun onResume() {
        super.onResume()
        message = " onResume() called"
        Toast.makeText(this, AC + message, TL).show()
    }

    override fun onPause() {
        super.onPause()
        message = " onPause() called"
        Toast.makeText(this, AC + message, TL).show()
    }

    override fun onRestart() {
        super.onRestart()
        message = " onRestart() called"
        Toast.makeText(this, AC + message, TL).show()
    }

    override fun onStop() {
        super.onStop()
        message = " onStop() called"
        Toast.makeText(this, AC + message, TL).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        message = " onDestroy() called"
        Toast.makeText(this, AC + message, TL).show()
    }
}