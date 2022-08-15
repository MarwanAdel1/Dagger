package com.example.dagger2

import android.app.Application
import com.example.dagger2.dagger_component.CoffeeComponent
import com.example.dagger2.dagger_component.DaggerCoffeeComponent

class MainApplication : Application() {
    private lateinit var daggerCoffeeComponent: CoffeeComponent

    override fun onCreate() {
        super.onCreate()
        daggerCoffeeComponent =
            DaggerCoffeeComponent.builder().sugar(2).milk(4).build()
    }

    fun getDaggerCoffeeComponent(): CoffeeComponent {
        return daggerCoffeeComponent
    }
}