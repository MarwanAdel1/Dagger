package com.example.dagger2

import javax.inject.Inject

class Farm @Inject() constructor() {
    fun getCustomFarm(): String {
        return "Beans"
    }
}