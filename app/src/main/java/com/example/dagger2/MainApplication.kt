package com.example.dagger2

import android.app.Application
import com.example.dagger2.dagger_component.AppComponent
import com.example.dagger2.dagger_component.DaggerAppComponent

class MainApplication : Application() {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }

    fun getDaggerAppComponent(): AppComponent {
        return appComponent
    }
}