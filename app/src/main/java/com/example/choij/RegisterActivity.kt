package com.example.choij.a1

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.choij.R

@SuppressLint("Registered")
class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val postechButton =findViewById<TextView>(R.id.postechButton)
        postechButton.setOnClickListener{
            val registerIntent = Intent(this, InnerRegisterActivity::class.java)
            startActivity(registerIntent)
        }
        val nonpostechButton =findViewById<TextView>(R.id.nonpostechButton)
        nonpostechButton.setOnClickListener {
            val registerIntent = Intent(this, OuterRegisterActivity::class.java)
            startActivity(registerIntent)
        }
    }
}
