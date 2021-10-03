package com.example.easygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0 = findViewById<ImageView>(R.id.img0)
        val btn1 = findViewById<ImageView>(R.id.img1)
        val btn2 = findViewById<ImageView>(R.id.img2)
        val btn3 = findViewById<ImageView>(R.id.img3)
        val btn4 = findViewById<ImageView>(R.id.img4)
        val btn5 = findViewById<ImageView>(R.id.img5)


        btn0.setOnClickListener {
            val intent = Intent(this, DynamicContentActivity::class.java)
            intent.putExtra("data", "0")
            startActivity(intent)
        }

        btn1.setOnClickListener {
            val intent = Intent(this, DynamicContentActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, DynamicContentActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, DynamicContentActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)
        }

        btn4.setOnClickListener {
            val intent = Intent(this, DynamicContentActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)
        }

        btn5.setOnClickListener {
            val intent = Intent(this, DynamicContentActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)
        }


        /*
        //1. 화면이 클릭되었다는 것을 알아야 함
        val image0 = findViewById<ImageView>(R.id.img0)
        image0.setOnClickListener {
            Toast.makeText(this, "0번 클릭", Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여줌
            val intent = Intent(this, Content_Img0::class.java)
            startActivity(intent)
        }

        val image1 = findViewById<ImageView>(R.id.img1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Content_Img1::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.img2)
        image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Content_Img2::class.java)
            startActivity(intent)
        }
        */

    }
}