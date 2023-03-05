package com.zmei.secondactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.secondactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
            if (requestCode == 100 && resultCode== RESULT_OK && data != null){
                bindingClass.textView1.text = data.getStringExtra("key2")

            }
        }


    fun onClick (view: View){
        val i = Intent(this, SecondActivity::class.java)
        i.putExtra("key", "Proverka")
        startActivityForResult(i, 100)
    }

}