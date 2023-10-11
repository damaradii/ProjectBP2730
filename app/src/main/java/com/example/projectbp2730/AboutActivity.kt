package com.example.projectbp2730

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //instance
        val imgCall : ImageView = findViewById(R.id.imageViewCall)

        //event
        imgCall.setOnClickListener {
            val callIntent:Intent = Uri.parse("tel:0819293844").let {
                number->
                Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }

        //instance
        val imgweb : ImageView = findViewById(R.id.imageViewglobe)

        //event
        imgweb.setOnClickListener {
            val webIntent:Intent = Uri.parse("https://home.amikom.ac.id/").let { webpage->
                Intent(Intent.ACTION_VIEW,webpage)
            }
            startActivity(webIntent)
        }

        //instance
        val location: ImageView = findViewById(R.id.imageViewloct)

        //event
        location.setOnClickListener {
            val loctIntentUri = Uri.parse("geo:47.6,-122,3?z=11")
            val mapIntent = Intent(Intent.ACTION_VIEW,loctIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.  resolveActivity(packageManager) != null){
                startActivity(mapIntent)
            }
        }
    }

}