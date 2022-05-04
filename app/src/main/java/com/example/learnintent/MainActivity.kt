package com.example.learnintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.go_to_second_activity)
        val nameText = findViewById<TextView>(R.id.tv_your_name)

        val name = intent.getStringExtra("Name") ?: ""
        nameText.text = name

        button.setOnClickListener {
            goToSecondActivity()
        }
    }

    private fun goToSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.apply {
            putExtra("Value", "Second Activity")
        }
        startActivity(intent)
    }
}
