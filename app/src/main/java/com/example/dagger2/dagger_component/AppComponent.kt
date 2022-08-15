package com.example.dagger2.dagger_component

import com.example.dagger2.Farm
import com.example.dagger2.River
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getRiver(): River
    fun getFarm(): Farm
}