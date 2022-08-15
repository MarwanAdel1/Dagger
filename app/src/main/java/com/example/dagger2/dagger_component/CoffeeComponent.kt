package com.example.dagger2.dagger_component

import com.example.dagger2.Coffee
import com.example.dagger2.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
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