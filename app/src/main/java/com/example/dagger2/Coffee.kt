package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Coffee @Inject constructor(private val river: River, private val sugar: Int) {
    private val TAG by lazy { "Coffee" }

    init {
        Log.i(TAG, "Coffee constructor is called")
    }

    @Inject
    lateinit var myCustomFarm: Farm

//    lateinit var myCustomRiver: River

    @Inject
    fun getCoffeeOrder() {
        Log.i(TAG, "getCoffeeOrder")
    }

    fun getCustomCoffee(): String {
        return myCustomFarm.getCustomFarm() + " + " + river.getCustomRiver()+
                " + " + sugar + " sugar"
    }
}