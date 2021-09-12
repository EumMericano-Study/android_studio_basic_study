package com.example.example_kotlin_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.example_kotlin_02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.et.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                println("텍스트 변경 전 " + p0)
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                println("텍스트 변경 중 " + p0)
            }

            override fun afterTextChanged(p0: Editable?) {
                println("텍스트 변경 후 " + p0)
            }
        })



    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}