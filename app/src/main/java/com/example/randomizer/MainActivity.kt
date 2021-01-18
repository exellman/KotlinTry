package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll = findViewById<Button>(R.id.btn_roll)
        val seekBar = findViewById<SeekBar>(R.id.sb_num)
        val tvResult = findViewById<TextView>(R.id.tv_result)


        btnRoll.setOnClickListener {
            val random = Random().nextInt(seekBar.progress) + 1

            tvResult.text = random.toString()
        }

    }
}