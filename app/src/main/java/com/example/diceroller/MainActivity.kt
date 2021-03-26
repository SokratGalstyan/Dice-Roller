package com.example.diceroller

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll = findViewById<Button>(R.id.roll)
        val dice = findViewById<ImageView>(R.id.dice)

        roll.setOnClickListener {
            val randomNumber = (Math.random() * 6 + 1).toInt()
            when(randomNumber){
                1 -> dice.setImageResource(R.drawable.dice_one)
                2 -> dice.setImageResource(R.drawable.dice_two)
                3 -> dice.setImageResource(R.drawable.dice_three)
                4 -> dice.setImageResource(R.drawable.dice_four)
                5 -> dice.setImageResource(R.drawable.dice_five)
                6 -> dice.setImageResource(R.drawable.dice_six)
            }
        }
    }
}