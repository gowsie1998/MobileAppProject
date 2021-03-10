package com.example.warwickparkingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class AddMapSection: AppCompatActivity () {

    lateinit var mapFragment: SupportMapFragment
    lateinit var googleMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_mapsection)

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(OnMapReadyCallback {
            googleMap = it
            googleMap.isMyLocationEnabled = true

            val location1 = LatLng (52.380858, -1.559377)
                googleMap.addMarker(MarkerOptions().position(location1).title("Central Campus"))
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location1,14.5f))

            val location2 = LatLng (52.384169, -1.556037)
            googleMap.addMarker(MarkerOptions().position(location2).title("Lynchgate"))

            val location3 = LatLng (52.376489, -1.563200)
            googleMap.addMarker(MarkerOptions().position(location3).title("Cryfield Village"))

            val location4 = LatLng (52.384518, -1.567179)
            googleMap.addMarker(MarkerOptions().position(location4).title("Kirby Corner"))

            val location5 = LatLng (52.389205, -1.564427)
            googleMap.addMarker(MarkerOptions().position(location5).title("Westwood Campus"))

            val location6 = LatLng (52.374878, -1.552718)
            googleMap.addMarker(MarkerOptions().position(location6).title("Gibbet Hill"))
        })
    }
}