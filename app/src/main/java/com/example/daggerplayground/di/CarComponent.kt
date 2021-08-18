package com.example.daggerplayground.di

import com.example.daggerplayground.MainActivity
import com.example.daggerplayground.model.Car
import dagger.Component

@Component(
    modules = [
    WheelModule::class,
        GasolineEngineModule::class
    ]
)
interface CarComponent {

    //by using this we can get access to the objects instance
    fun getCar(): Car

<<<<<<< HEAD
    fun inject( mainActivity : MainActivity)
=======
    //field injection
    fun inject(mainActivity: MainActivity)
>>>>>>> Binds-4
}