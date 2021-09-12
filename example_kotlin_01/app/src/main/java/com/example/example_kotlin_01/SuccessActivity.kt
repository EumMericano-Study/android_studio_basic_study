package com.example.example_kotlin_01

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.success_layout.*

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.success_layout)

        if (intent.hasExtra("name")) {
            val name= intent.getStringExtra("name")
            tv_result.text = "${name}님 환영합니다"
        }
    }
}