package com.zmei.secondactivity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_second)
    }


    fun onClickMai3 (view : View) {

        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
    fun onClickClose (view : View) {

        finish()
    }

}