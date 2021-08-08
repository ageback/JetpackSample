package com.ebookfrenzy.jetpacksample.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val usd_to_eu_rate = 0.74f
    private var dollerText = ""
    private var result: MutableLiveData<Float> = MutableLiveData()

    fun setAmount(value: String) {
        this.dollerText = value
        result.value = value.toFloat() * usd_to_eu_rate
    }

    fun getResult(): MutableLiveData<Float> {
        return result
    }
}