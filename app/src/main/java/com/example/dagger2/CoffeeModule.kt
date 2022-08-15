package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class CoffeeModule {

    @Provides
    fun getRiver(): River {
        return River()
    }
}