package com.example.easygallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class DynamicContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_content)


        val getData = intent.getStringExtra("data")
        val Content_img = findViewById<ImageView>(R.id.content_img)

        Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        if (getData == "0") {
            Content_img.setImageResource(R.drawable.jyorudi0)
        }
        else if (getData == "1") {
            Content_img.setImageResource(R.drawable.jyorudi1)
        }
        else if (getData == "2") {
            Content_img.setImageResource(R.drawable.jyorudi3)
        }
        else if (getData == "3") {
            Content_img.setImageResource(R.drawable.jyorudi4)
        }
        else if (getData == "4") {
            Content_img.setImageResource(R.drawable.jyorudi5)
        }
        else if (getData == "5") {
            Content_img.setImageResource(R.drawable.jyorudi0)
        }

    }
}