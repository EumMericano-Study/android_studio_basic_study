package com.example.example_kotlin_02

import android.content.Intent
import android.graphics.Matrix
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.ImageView
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

//        binding.ivBasic.setScaleType(ImageView.ScaleType.MATRIX)
//
//        val matrix = Matrix()
//        matrix.postRotate(5f)
//        binding.ivBasic.setImageMatrix(matrix)

    }

    fun LoadImage(v: View) {
        startActivityForResult(Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI), 0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (data != null) binding.ivBasic.setImageURI(data?.data)
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}