package com.example.dagger2

import javax.inject.Inject

class Coffee @Inject constructor(val farm: Farm, val river: River) {
    private val TAG by lazy { "Coffee" }

    @Inject
    lateinit var myCustomFarm: Farm

    @Inject
    lateinit var myCustomRiver: River


    fun getCustomCoffee(): String {
        return myCustomFarm.getCustomFarm() + "+" + myCustomRiver.getCustomRiver()
    }

}