package com.nandaadisaputra.master.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class GoFoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_food)
        supportActionBar!!.title = "GO FOOD"
    }
}
