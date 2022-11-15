package com.example.game

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ToggleButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //przyciski
        val bt1 = findViewById<ToggleButton>(R.id.tg1)
        val bt2 = findViewById<ToggleButton>(R.id.tg2)
        val bt3 = findViewById<ToggleButton>(R.id.tg3)
        val bt4 = findViewById<ToggleButton>(R.id.tg4)
        val bt5 = findViewById<ToggleButton>(R.id.tg5)
        val bt6 = findViewById<ToggleButton>(R.id.tg6)
        val bt7 = findViewById<ToggleButton>(R.id.tg7)
        val bt8 = findViewById<ToggleButton>(R.id.tg8)
        val bt9 = findViewById<ToggleButton>(R.id.tg9)
        val bt = findViewById<Button>(R.id.bt1)
        val btt = findViewById<Button>(R.id.bt)

        val lista = listOf<ToggleButton>(
            bt1,
            bt2,
            bt3,
            bt4,
            bt5,
            bt6,
            bt7,
            bt8,
            bt9
        )
        bt.setOnClickListener {
            bt1.textOn = "1"
            bt2.textOn = "2"
            bt3.textOn = "3"
            bt4.textOn = "4"
            bt5.textOn = "5"
            bt6.textOn = "6"
            bt7.textOn = "7"
            bt8.textOn = "8"
            bt9.textOn = "9"
        }

        btt.setOnClickListener {
            for(lista.)
        }



    }
}