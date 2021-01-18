package com.example.passdata

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val extras: Bundle? = intent.extras

        if(extras != null){
            val data = extras.getString("key1")
            Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
        }
    }

}