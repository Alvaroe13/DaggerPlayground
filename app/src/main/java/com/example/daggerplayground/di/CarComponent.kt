package com.example.daggerplayground.di

import com.example.daggerplayground.MainActivity
import com.example.daggerplayground.model.Car
import dagger.Component

@Component(
    modules = [
    WheelModule::class
    ]
)
interface CarComponent {

    //by using this we can get access to the objects instance
    fun getCar(): Car

    //field injection
    fun inject(mainActivity: MainActivity)
}