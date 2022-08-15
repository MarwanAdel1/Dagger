package com.example.dagger2.dagger_component

import com.example.dagger2.River
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun getRiver(): River {
        return River()
    }
}