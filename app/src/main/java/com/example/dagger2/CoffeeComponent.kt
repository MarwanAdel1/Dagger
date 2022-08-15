package com.example.dagger2

import dagger.Component

@Component
interface CoffeeComponent {
    fun getCoffeeInstance(): Coffee
}