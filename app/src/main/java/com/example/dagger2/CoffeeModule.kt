package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class CoffeeModule(private val sugar: Int) {

    @Provides
    fun getRiver(): River {
        return River()
    }

    @Provides
    fun getSugar(): Int {
        return sugar
    }
}