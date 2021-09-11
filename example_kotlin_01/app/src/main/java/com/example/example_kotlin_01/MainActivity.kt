package com.example.example_kotlin_01

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_age.setOnEditorActionListener{ v, action, event ->
            if (action == EditorInfo.IME_ACTION_DONE) {
                login(v)
                true
            }
            false
        }
    }

    fun login(v: View) {

        var imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(v.windowToken, 0)

        if(et_email.text.toString() == "opwer032@naver.com" && et_password.text.toString() == "password"
            && et_name.text.toString() == "Young" && et_age.text.toString() == "31")
            {
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_LONG).show()
            } else Toast.makeText(this, "로그인 실패", Toast.LENGTH_LONG).show()
    }

}