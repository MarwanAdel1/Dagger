package com.example.dagger2

import dagger.BindsInstance
import dagger.Component

@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {
    fun getCoffeeInstance(): Coffee
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun sugar(@Sugar("sugar") sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk("milk") milk: Int): Builder

        fun build(): CoffeeComponent
    }
}