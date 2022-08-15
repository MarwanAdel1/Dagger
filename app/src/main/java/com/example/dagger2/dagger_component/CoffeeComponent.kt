package com.example.dagger2.dagger_component

import com.example.dagger2.Coffee
import com.example.dagger2.MainActivity
import com.example.dagger2.dagger_component.named_annotation.Milk
import com.example.dagger2.dagger_component.named_annotation.Sugar
import com.example.dagger2.dagger_component.scope_annotation.ActivityScope
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface CoffeeComponent {
    fun getCoffeeInstance(): Coffee
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun sugar(@Sugar("sugar") sugar: Int): Builder

        @BindsInstance
        fun milk(@Milk("milk") milk: Int): Builder

        fun build(): CoffeeComponent
    }
}