package com.example.dagger2

import dagger.Component

@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {
    fun getCoffeeInstance(): Coffee
    fun inject(mainActivity: MainActivity)
}