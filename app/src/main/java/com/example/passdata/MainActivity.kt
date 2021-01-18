package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGo = findViewById<Button>(R.id.btn_go)
        val edText = findViewById<EditText>(R.id.et_text)



        btnGo.setOnClickListener {
            val inputData: String = edText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key1", inputData)
            
            startActivity(intent)
        }
    }
}