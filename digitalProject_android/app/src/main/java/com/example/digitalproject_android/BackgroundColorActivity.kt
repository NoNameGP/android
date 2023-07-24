package com.example.digitalproject_android

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_backgroundcolor.*
import kotlinx.android.synthetic.main.activity_backgroundcolor.banner_v
import kotlinx.android.synthetic.main.activity_backgroundcolor.colorSetting
import kotlinx.android.synthetic.main.activity_backgroundcolor.*
import kotlinx.android.synthetic.main.activity_backgroundcolor.view.*


class BackgroundColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backgroundcolor)
        back.setOnClickListener() {
            this.finish()
        }

        light.setOnClickListener() {
            banner_v.setBackgroundColor(Color.parseColor("#F8F8F8"))
            backgroundcolor_text.setTextColor(Color.parseColor("#191919"))
            background.setTextColor(Color.parseColor("#191919"))
            dark_button.setBackgroundColor(Color.parseColor("#d0d0d0"))
            light_button.setBackgroundColor(Color.parseColor("#74fbcf"))
            out.setBackgroundColor(Color.parseColor("#ffffff"))
        }

        dark.setOnClickListener() {
            banner_v.setBackgroundColor(Color.parseColor("#191919"))
            backgroundcolor_text.setTextColor(Color.parseColor("#F3F3FC"))
            background.setTextColor(Color.parseColor("#f3f3fc"))
            dark_button.setBackgroundColor(Color.parseColor("#74fbcf"))
            light_button.setBackgroundColor(Color.parseColor("#d0d0d0"))
            out.setBackgroundColor(Color.parseColor("#0d0d0d"))
        }
    }
}