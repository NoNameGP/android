package com.example.digitalproject_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.navi_start_settting.*

class NaviStartSetActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navi_start_settting)

        voice_btn.setOnClickListener() {
            val intent = Intent(this, NaviStartVoice1Activity::class.java)
            startActivity(intent)
        }
        arrow_back_iv.setOnClickListener() {
            this.finish()
        }
    }
}