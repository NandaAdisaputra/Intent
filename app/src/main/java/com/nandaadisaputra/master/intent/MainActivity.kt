package com.nandaadisaputra.master.intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goRide(view: View) {
        val intent = Intent(this@MainActivity, GoRideActivity::class.java)
        startActivity(intent)
    }

    fun goFood(view: View) {
        val intent = Intent(this@MainActivity, GoFoodActivity::class.java)
        startActivity(intent)
    }

    fun goMart(view: View) {
        val intent = Intent(this@MainActivity, GoMartActivity::class.java)
        startActivity(intent)
    }

    fun goSend(view: View) {
        val intent = Intent(this@MainActivity, GoSendActivity::class.java)
        startActivity(intent)
    }
}
