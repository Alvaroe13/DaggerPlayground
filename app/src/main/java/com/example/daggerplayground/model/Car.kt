package com.example.daggerplayground.model

import javax.inject.Inject


class Car {

    private val rueda: Wheel
    private val  motor : Engine

    @Inject
    constructor(wheel : Wheel , engine : Engine) {
        rueda = wheel
        motor = engine
    }


    fun drive(){
        println("Car, drive, called! ")
    }

}