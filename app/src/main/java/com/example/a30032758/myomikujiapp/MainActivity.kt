package com.example.a30032758.myomikujiapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getOmikujiButton.setOnClickListener {
//            Log.v("MainActivity", "Button Clicked")
            val results = arrayOf("大吉")
//            val results = arrayOf("大吉", "吉", "中吉", "小吉", "凶")

//            val n = Random().nextInt( 3)
            val n = Random().nextInt( results.count())

            if(n == 0) {
//                resultTextView.setTextColor(Color.RED)
//                resultTextView.setTextColor(Color.parseColor("#ff0000"))
                resultTextView.setTextColor(Color.argb(255,255,0,0))
            } else {
                resultTextView.setTextColor(Color.parseColor("#808080"))
            }

            resultTextView.text = results.get(n)
        }

    }
}
