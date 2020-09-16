package com.example.daggerplayground.model

import javax.inject.Inject

class GasolineEngine :  Engine {

    @Inject
    constructor()

    override fun startEngine() {
        println("DEBUG, Gasoline Engine started!")
    }
}