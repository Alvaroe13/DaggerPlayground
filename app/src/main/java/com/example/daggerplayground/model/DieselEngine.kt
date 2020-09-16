package com.example.daggerplayground.model

import javax.inject.Inject

class DieselEngine : Engine{

    @Inject
    constructor()

    override fun startEngine() {
        println("DEBUG, Diesel Engine started!!")
    }

}