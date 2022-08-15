package com.example.dagger2

import javax.inject.Inject

class Coffee @Inject constructor(val farm: Farm, val river: River) {
    private val TAG by lazy { "Coffee" }

}