package com.vaibhavmojidra.dagger2stateofmodulekotlin

import dagger.Component

@Component(modules = [BatteryModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone():SmartPhone
}