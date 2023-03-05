package com.zmei.secondactivity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.zmei.secondactivity.databinding.LayoutSecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var bindingClass : LayoutSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bindingClass = LayoutSecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key")
        bindingClass.textView2.text = message
    }



    fun onClickBack (view: View){

        intent.putExtra("key2", bindingClass.edText2.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}