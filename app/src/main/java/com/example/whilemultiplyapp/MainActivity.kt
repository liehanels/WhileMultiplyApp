package com.example.whilemultiplyapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val edtNumFirstNum = findViewById<EditText>(R.id.edtNumFirstNum)
        val edtNumSecondNum = findViewById<EditText>(R.id.edtNumSecondNum)
        val tvAnswer = findViewById<TextView>(R.id.tvAnswer)

        btnCalculate.setOnClickListener {
            var num1 = edtNumFirstNum.text.toString().toInt()
            var num2 = edtNumSecondNum.text.toString().toInt()
            var answer: Int = 0



            tvAnswer.text = answer.toString()
        }
    }
}