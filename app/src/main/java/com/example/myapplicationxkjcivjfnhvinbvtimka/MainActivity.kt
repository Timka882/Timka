package com.example.myapplicationxkjcivjfnhvinbvtimka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val button = findViewById<Button>(R.id.re)
        button.setOnClickListener {
            val intent = Intent (this,obych::class.java)
            startActivity(intent)
        }




        findViewById<ImageView>(R.id.one_id).setOnClickListener {
            MainScope().launch {


                for (i in 1..2) {

                    for (i in 0..29) {
                        it.rotationX = it.rotationX + 3
                        delay(3)
                    }


                    var RandomNumber = Random.nextInt(1..6)
                    findViewById<ImageView>(R.id.one_id).setImageResource(
                            when (RandomNumber) {
                                1 -> R.drawable.one
                                2 -> R.drawable.two
                                3 -> R.drawable.tree
                                4 -> R.drawable.four
                                5 -> R.drawable.five
                                6 -> R.drawable.six
                                else -> R.drawable.ic_launcher_foreground
                            })


                    for (i in 30..59) {
                        it.rotationX = it.rotationX + 3
                        delay(3)
                    }
                }
            }
        }
        val button4 = findViewById<Button>(R.id.ob_10)
        button4.setOnClickListener {
            val intent = Intent (this,menu ::class.java)
            startActivity(intent)
        }
    }
}

