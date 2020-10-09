package com.example.ulis_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var times_clicked = 0

        clickCounterButton.setOnClickListener{
            clickCounterText.text = "Clicked ${(++times_clicked).toString()} times"
            Toast.makeText(this@MainActivity, "Do It Again!", Toast.LENGTH_SHORT).show()
        }
    }
}