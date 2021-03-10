package com.example.warwickparkingapp

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_infosection.*

class AddInfoSection: AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_infosection)

        webViewSetup()
    }

    private fun webViewSetup(){
        parkinginfo.webViewClient = WebViewClient()

        parkinginfo.apply {
            loadUrl("https://warwick.ac.uk/about/visiting/directions/car/parking/")
        }
    }
}