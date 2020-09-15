package com.example.daggerplayground.model

class Rim() {
    // in this example(branch) we don't have access to this class, we pretend it's from a third party library

    init {
        println("DEBUG, Rim called!")
    }

    fun assembleRim(){
        println("DEBUG, Rim is been assemble")
    }
}