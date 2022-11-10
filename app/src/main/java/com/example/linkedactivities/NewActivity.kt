package com.example.linkedactivities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class NewActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "KotlinApp"
        val button: Button = findViewById(R.id.btnOpenMain)
        button.setOnClickListener {
            val i = Intent(this@NewActivity, MainActivity::class.java)
            startActivity(i)
        }
    }
}