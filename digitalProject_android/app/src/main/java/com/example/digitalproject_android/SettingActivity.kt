package com.example.digitalproject_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_backgroundcolor.*
import kotlinx.android.synthetic.main.activity_setting.*
import kotlinx.android.synthetic.main.activity_setting.colorSetting
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_backgroundcolor.view.*



class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        colorSetting.setOnClickListener(){
            val intent = Intent(this, BackgroundColorActivity::class.java)
            startActivity(intent)
        }
        videoSetting.setOnClickListener(){
            val intent = Intent(this, AudioActivity::class.java)
            startActivity(intent)
        }
        back_iv.setOnClickListener(){
            this.finish()
        }
    }
}

