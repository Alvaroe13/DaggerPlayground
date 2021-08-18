package com.example.daggerplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerplayground.di.DaggerCarComponent
import com.example.daggerplayground.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init car using Dagger
       DaggerCarComponent.create().inject(this)

        car.drive()
    }


}