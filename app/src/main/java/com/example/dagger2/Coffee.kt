package com.example.dagger2

import android.util.Log
import com.example.dagger2.dagger_component.named_annotation.Milk
import com.example.dagger2.dagger_component.named_annotation.Sugar
import com.example.dagger2.dagger_component.scope_annotation.ActivityScope
import javax.inject.Inject

@ActivityScope
class Coffee @Inject constructor(
    val river: River,
    @Sugar private val sugar: Int,
    @Milk("milk") private val milk: Int
) {
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
        return "${myCustomFarm.getCustomFarm()} + ${river.getCustomRiver()} + $sugar sugar + $milk milk"
    }
}