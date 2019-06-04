package com.example.simpleplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ScrollView
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    val MEDIA_RES_ID = R.raw.jazz_in_paris

    private lateinit var mTextDebug : TextView
    private lateinit var mSeekBarAudio : SeekBar
    private lateinit var mScrollContainer : ScrollView
    private var mUserIsSeeking = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeUI()
        Log.d(TAG, "onCreate: finished")
    }

    fun initializeUI() {
        mTextDebug = findViewById(R.id.text_debug)
        val mPlayButton  : Button = findViewById(R.id.button_play)
        val mPauseButton : Button = findViewById(R.id.button_pause)
        val mResetButton : Button = findViewById(R.id.button_reset)
        mSeekBarAudio = findViewById(R.id.seekbar_audio)
        mScrollContainer = findViewById(R.id.scroll_container)
    }
}
