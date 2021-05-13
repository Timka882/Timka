package com.example.myapplicationxkjcivjfnhvinbvtimka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)




        val button = findViewById<Button>(R.id.ob_8)
        button.setOnClickListener {
            val intent = Intent (this,hgfdhtghh::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.ob_9)
        button2.setOnClickListener {
            val intent = Intent (this,`three player` ::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.ob_10)
        button3.setOnClickListener {
            val intent = Intent (this,`three player` ::class.java)
            startActivity(intent)
        }
    }
}
