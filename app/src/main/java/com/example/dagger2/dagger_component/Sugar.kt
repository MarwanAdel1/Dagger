package com.example.dagger2.dagger_component

import javax.inject.Qualifier


@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Sugar(
    val value: String = "sugar"
)
