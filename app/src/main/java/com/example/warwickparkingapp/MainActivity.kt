package com.example.warwickparkingapp

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        goToPark.setOnClickListener {
         startActivity(Intent(this, AddParkSection::class.java))
        }

        goToSessions.setOnClickListener {
            startActivity(Intent(this, AddSessionSection::class.java))
        }

        goToMap.setOnClickListener {
            startActivity(Intent(this, AddMapSection::class.java))
        }

        goToAccount.setOnClickListener {
            startActivity(Intent(this, AddAccountSection::class.java))
        }

        goToInfo.setOnClickListener {
            startActivity(Intent(this, AddInfoSection::class.java))
        }
    }
}
