package com.example.dagger2

import javax.inject.Inject

class River @Inject constructor() {
    fun getCustomRiver(): String {
        return "Water"
    }
}