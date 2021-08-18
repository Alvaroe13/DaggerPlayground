package com.example.daggerplayground.model

import android.util.Log
import javax.inject.Inject

private const val TAG = "CarTAB"

class Car {

<<<<<<< HEAD
    private var _wheel: Wheel
    private var _engine : Engine
=======
    private val rueda: Wheel
    private val  motor : Engine
>>>>>>> Binds-4

    @Inject
    constructor(wheel : Wheel , engine : Engine) {
        _wheel = wheel
        _engine = engine
    }


    fun drive(){
<<<<<<< HEAD
        Log.d(TAG, "drive: triggered")
=======
        motor.startEngine()
        println(" DEBUG, Car, drive, called! ")
>>>>>>> Binds-4
    }

}