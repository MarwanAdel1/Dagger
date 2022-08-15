package com.example.dagger2

import javax.inject.Singleton

@Singleton
class River {
    fun getCustomRiver(): String {
        return "Water"
    }
}