package com.example.dagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG by lazy { "MainActivity" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerCoffeeComponent = DaggerCoffeeComponent.create()
        Log.i(TAG, "onCreate: ${daggerCoffeeComponent.getCoffeeInstance()}")  /// constructor injection

    }
}