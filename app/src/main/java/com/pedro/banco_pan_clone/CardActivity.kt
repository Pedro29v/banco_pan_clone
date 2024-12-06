package com.pedro.banco_pan_clone

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_card)

        val btnResume = findViewById<TextView>(R.id.btn_resume)
        val btnInvestments = findViewById<TextView>(R.id.btn_investments)

        btnResume.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btnInvestments.setOnClickListener{
            val intent = Intent(this,InvestmentsActivity::class.java)
            startActivity(intent)
        }

    }
}