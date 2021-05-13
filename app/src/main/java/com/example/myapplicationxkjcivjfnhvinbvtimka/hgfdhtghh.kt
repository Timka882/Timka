package com.example.myapplicationxkjcivjfnhvinbvtimka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random
import kotlin.random.nextInt

class hgfdhtghh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hgfdhtghh)

        findViewById<ImageView>(R.id.view_1).setOnClickListener {
            MainScope().launch {


                for (i in 1..2) {

                    for (i in 0..29) {
                        it.rotationX = it.rotationX + 3
                        delay(3)
                    }


                    var RandomNumber = Random.nextInt(1..6)
                    findViewById<ImageView>(R.id.view_1).setImageResource(
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
        findViewById<ImageView>(R.id.view_2).setOnClickListener {
            MainScope().launch {


                for (i in 1..2) {

                    for (i in 0..29) {
                        it.rotationX = it.rotationX + 3
                        delay(3)
                    }


                    var RandomNumber = Random.nextInt(1..6)
                    findViewById<ImageView>(R.id.view_2).setImageResource(
                        when (RandomNumber) {
                            1 -> R.drawable.one
                            2 -> R.drawable.two
                            3 -> R.drawable.tree
                            4 -> R.drawable.four
                            5 -> R.drawable.five
                            6 -> R.drawable.six
                            else -> R.drawable.ic_launcher_foreground
                        }
                    )


                    for (i in 30..59) {
                        it.rotationX = it.rotationX + 3
                        delay(3)
                    }
                }
            }
        }
    }

}