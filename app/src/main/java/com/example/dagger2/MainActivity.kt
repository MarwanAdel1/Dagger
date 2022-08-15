package com.example.dagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG by lazy { "MainActivity" }

    @Inject
    lateinit var coffee: Coffee // field injection

    @Inject
    lateinit var coffee2: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val daggerCoffeeComponent = DaggerCoffeeComponent.create()
//        Log.i(TAG, "onCreate: Constructor Injection: ${daggerCoffeeComponent.getCoffeeInstance()}")  /// constructor injection
//
//        Log.i(TAG, "onCreate: Field Injection: ${daggerCoffeeComponent.getCoffeeInstance().getCustomCoffee()}")  /// field injection
//
//        daggerCoffeeComponent.inject(this)
//        Log.i(TAG, "onCreate: Field Injection: ${coffee.getCustomCoffee()}")  /// field injection

//        val daggerCoffeeComponent =
//            DaggerCoffeeComponent.builder().coffeeModule(CoffeeModule(sugar = 3)).build()

        val appComponent = (application as MainApplication).getDaggerAppComponent()

        val coffeeComponent =
            appComponent.getCoffeeComponentBuilder().sugar(2).milk(4).build()
        coffeeComponent.inject(this)

        Log.i(
            TAG,
            "onCreate: Module: ${coffee.getCustomCoffee()}"
        )

        Log.i(
            TAG,
            "onCreate: \nCoffee 1 : $coffee" +
                    "\nFarm : ${coffee.myCustomFarm}" +
                    "\nRiver : ${coffee.river}"
        )

        Log.i(
            TAG,
            "onCreate: \nCoffee 2 : $coffee2" +
                    "\nFarm : ${coffee2.myCustomFarm}" +
                    "\nRiver : ${coffee2.river}"
        )
    }
}