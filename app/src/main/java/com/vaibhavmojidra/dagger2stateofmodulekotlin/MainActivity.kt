package com.vaibhavmojidra.dagger2stateofmodulekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerSmartPhoneComponent
            .builder()
            .batteryModule(BatteryModule(46))
            .build()
            .getSmartPhone()
            .makeCallRecording()

    }
}