 package com.example.projectbp2730

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

 class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //instace
        val btnmr : Button = findViewById(R.id.buttonmenumore)

        //event
        btnmr.setOnClickListener { val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)}
    }
}