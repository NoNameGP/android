package com.example.digitalproject_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_backgroundcolor.*
import kotlinx.android.synthetic.main.activity_home.*
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_backgroundcolor.view.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        first_btn.setOnClickListener(){
            val intent = Intent(this, NaviStartSetActivity::class.java)
            startActivity(intent)
        }

        sixth_btn.setOnClickListener(){
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

    }
}

