package com.nandaadisaputra.master.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class GoRideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_ride)
        supportActionBar!!.title = "GoRide"
    }
}
