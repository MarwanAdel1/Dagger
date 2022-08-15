package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Coffee @Inject constructor(val farm: Farm, val river: River) {
    private val TAG by lazy { "Coffee" }
    
    init {
        Log.i(TAG, "Coffee constructor is called")
    }

    @Inject
    lateinit var myCustomFarm: Farm

    @Inject
    lateinit var myCustomRiver: River

    @Inject
    fun getCoffeeOrder() {
        Log.i(TAG, "getCoffeeOrder")
    }

    fun getCustomCoffee(): String {
        return myCustomFarm.getCustomFarm() + "+" + myCustomRiver.getCustomRiver()
    }
}