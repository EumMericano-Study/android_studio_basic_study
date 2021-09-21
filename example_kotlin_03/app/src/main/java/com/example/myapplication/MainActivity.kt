package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)

        Click(binding.btn1)

        setContentView(binding.root)
    }

    fun Click(v: View) {
        binding.iv1.visibility = View.INVISIBLE
        binding.iv2.visibility = View.INVISIBLE
        binding.iv3.visibility = View.INVISIBLE

        binding.btn1.setBackgroundColor(resources.getColor(R.color.design_default_color_primary))
        binding.btn2.setBackgroundColor(resources.getColor(R.color.design_default_color_primary))
        binding.btn3.setBackgroundColor(resources.getColor(R.color.design_default_color_primary))

        when(v) {
            binding.btn1 -> {
                binding.iv1.visibility = View.VISIBLE
                binding.btn1.setBackgroundColor(resources.getColor(R.color.design_default_color_primary_dark))
            }

            binding.btn2 -> {
                binding.iv2.visibility = View.VISIBLE
                binding.btn2.setBackgroundColor(resources.getColor(R.color.design_default_color_primary_dark))
            }
            binding.btn3 -> {
                binding.iv3.visibility = View.VISIBLE
                binding.btn3.setBackgroundColor(resources.getColor(R.color.design_default_color_primary_dark))
            }
        }
    }

}