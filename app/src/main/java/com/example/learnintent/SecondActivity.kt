package com.example.learnintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val button = findViewById<Button>(R.id.go_to_first_activity)
        val editText = findViewById<EditText>(R.id.et_name)

        val string = intent.getStringExtra("Value") ?: ""

        Toast.makeText(this, string, Toast.LENGTH_LONG).show()

        button.setOnClickListener {
            gotoFirstActivity()
        }
    }

    private fun gotoFirstActivity() {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("Name", "Shiva")
        startActivity(intent)
    }
}
