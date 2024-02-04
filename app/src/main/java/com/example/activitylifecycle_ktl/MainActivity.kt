package com.example.activitylifecycle_ktl

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity(), View.OnClickListener {

    private val TL = Toast.LENGTH_LONG
    private val AC = "Main Activity"
    private var message = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message = " onCreate() called"
        Toast.makeText(this, AC + message, TL).show()

        val button1 = findViewById<View>(R.id.button)
        val button2 = findViewById<View>(R.id.button2)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
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

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button -> {
                val j = Intent(this, NewActivity::class.java)
                startActivity(j)
            }

            R.id.button2 -> {
                message = AC + " Calling finish()"
                Toast.makeText(this, message, TL).show()
                finish()
            }
        }
    }

}
