package com.example.dagger2.dagger_component.named_annotation

import javax.inject.Qualifier


@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Sugar(
    val value: String = "sugar"
)
