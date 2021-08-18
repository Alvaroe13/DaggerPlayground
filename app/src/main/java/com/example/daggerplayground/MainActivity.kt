package com.example.daggerplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerplayground.di.DaggerCarComponent
import com.example.daggerplayground.model.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

<<<<<<< HEAD
    @Inject
    lateinit var car: Car
=======
     @Inject lateinit var car: Car
>>>>>>> Binds-4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< HEAD
        //init car using Dagger
       DaggerCarComponent.create().inject(this)
=======
        //this init is by construction injection
       // car = DaggerCarComponent.create().getCar()

        //this init is using field injection
        DaggerCarComponent.create().inject(this)
>>>>>>> Binds-4

        car.drive()
    }


}