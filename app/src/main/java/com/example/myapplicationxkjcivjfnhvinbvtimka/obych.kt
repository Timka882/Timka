package com.example.myapplicationxkjcivjfnhvinbvtimka

import android.content.Intent
import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_obych.*

class obych : AppCompatActivity() {

    private var soundPool: SoundPool? = null
    private var soundId1 = 0
    private var soundId2 = 0
    private var soundId3 = 0
    private var soundId4 = 0
    private var soundId5 = 0
    private var soundId6 = 0
    private var soundId7 = 0

    fun playSound(sound: Int) {
        var soundId = 0
        when (sound) {
            1 -> soundId = soundId1
            2 -> soundId = soundId2
            3 -> soundId = soundId3
            4 -> soundId = soundId4
            5 -> soundId = soundId5
            6 -> soundId = soundId6
            7 -> soundId = soundId7
        }
        soundPool?.play(soundId, 1F, 1F, 0, 0, 1F)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obych)

        soundPool = SoundPool(25, AudioManager.STREAM_MUSIC, 0)
        soundId1 = soundPool!!.load(baseContext, R.raw.one, 1)
        soundId2 = soundPool!!.load(baseContext, R.raw.two, 1)
        soundId3 = soundPool!!.load(baseContext, R.raw.three, 1)
        soundId4 = soundPool!!.load(baseContext, R.raw.four, 1)
        soundId5 = soundPool!!.load(baseContext, R.raw.fife, 1)
        soundId6 = soundPool!!.load(baseContext, R.raw.six, 1)
        soundId7 = soundPool!!.load(baseContext, R.raw.obuch, 1)

        ob_8.setOnClickListener { playSound(1) }
        ob_2.setOnClickListener { playSound(2) }
        ob_3.setOnClickListener { playSound(3) }
        ob_4.setOnClickListener { playSound(4) }
        ob_5.setOnClickListener { playSound(5) }
        ob_6.setOnClickListener { playSound(6) }
        ob_7.setOnClickListener { playSound(7) }




        val button = findViewById<Button>(R.id.ret)
        button.setOnClickListener {
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.rety)
        button2.setOnClickListener {
            val intent = Intent (this, obnawlenie::class.java)
            startActivity(intent)
        }


    }
}

