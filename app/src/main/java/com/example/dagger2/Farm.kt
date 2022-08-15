package com.example.dagger2

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Farm @Inject() constructor() {
    fun getCustomFarm(): String {
        return "Beans"
    }
}