package com.example.daggerplayground.di

import com.example.daggerplayground.model.Rim
import com.example.daggerplayground.model.Screw
import com.example.daggerplayground.model.Wheel
import dagger.Module
import dagger.Provides

@Module
class WheelModule {


    @Provides
    fun provideScrews(): Screw{
        return Screw()
    }


    @Provides
    fun provideRims(): Rim {
        val rims = Rim()
        rims.assembleRim()
        return rims
    }


    //now we create the instance of our Wheel object
    @Provides
    fun provideWheel(screws : Screw, rims: Rim): Wheel {
        return Wheel(screws, rims)
    }



}