package com.example.daggerplayground.di

import com.example.daggerplayground.model.Engine
import com.example.daggerplayground.model.GasolineEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class GasolineEngineModule {

    //Here we use Provides and in DieselEngineModule we use @Binds, they're a bit different but here they both work
    @Binds
    abstract fun provideGasolineEngine(gasEngine : GasolineEngine) : Engine

}