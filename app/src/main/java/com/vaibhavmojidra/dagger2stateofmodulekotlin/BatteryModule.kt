package com.vaibhavmojidra.dagger2stateofmodulekotlin

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class BatteryModule(val batteryLife:Int) {
    @Provides
    fun provideBattery():Battery{
        Log.i("MyInfo","Battery Life available: $batteryLife")
       return Battery()
    }
}