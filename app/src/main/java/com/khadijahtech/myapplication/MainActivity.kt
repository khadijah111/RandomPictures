package com.khadijahtech.myapplication

import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var helloText:TextView
    lateinit var pictureImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloText = findViewById<TextView>(R.id.text_view)
        pictureImage = findViewById(R.id.imageView)

        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            //helloText.setText("Button clicked!!")
            produceRandom()
        }
    }

    private fun produceRandom()
    {
        var random = Random.nextInt(10)+1
        helloText.setText(random.toString())

        var imageRes = when(random)
        {
            1 -> R.drawable.ic_red
            2 -> R.drawable.ic_blue
            3 -> R.drawable.ic_yellow
            4-> R.drawable.ic_green
            else ->  R.drawable.ic_pink
        }

        pictureImage.setImageResource(imageRes)
    }
}