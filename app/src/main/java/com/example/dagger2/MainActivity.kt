package com.example.dagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG by lazy { "MainActivity" }

    @Inject
    lateinit var coffee: Coffee // field injection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerCoffeeComponent = DaggerCoffeeComponent.create()
        Log.i(TAG, "onCreate: Constructor Injection: ${daggerCoffeeComponent.getCoffeeInstance()}")  /// constructor injection

        Log.i(TAG, "onCreate: Field Injection: ${daggerCoffeeComponent.getCoffeeInstance().getCustomCoffee()}")  /// field injection

        daggerCoffeeComponent.inject(this)
        Log.i(TAG, "onCreate: Field Injection: ${coffee.getCustomCoffee()}")  /// field injection



    }
}