package com.vaibhavmojidra.dagger2stateofmodulekotlin

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor(){

    init {
        Log.i("MyInfo","Service Provider Constructed")
    }
    fun getServiceProvider(){
        Log.i("MyInfo","Service Provider Connected")
    }
}
