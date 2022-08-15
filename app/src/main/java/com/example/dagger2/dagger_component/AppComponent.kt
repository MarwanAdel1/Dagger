package com.example.dagger2.dagger_component

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getCoffeeComponentBuilder(): CoffeeComponent.Builder
}