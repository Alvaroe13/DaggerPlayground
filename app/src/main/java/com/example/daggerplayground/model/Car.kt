package com.example.daggerplayground.model

import android.util.Log
import javax.inject.Inject

private const val TAG = "CarTAB"

class Car {

    private var _wheel: Wheel
    private var _engine : Engine

    @Inject
    constructor(wheel : Wheel , engine : Engine) {
        _wheel = wheel
        _engine = engine
    }


    fun drive(){
        Log.d(TAG, "drive: triggered")
    }

}