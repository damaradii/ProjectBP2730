package com.example.projectbp2730

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnlogin:Button = findViewById(R.id.buttonlog)

        //event
        btnlogin.setOnClickListener {
            //call home activity
            val intenhome = Intent (this, HomeActivity::class.java)
            startActivity(intenhome)
        }
    }
}