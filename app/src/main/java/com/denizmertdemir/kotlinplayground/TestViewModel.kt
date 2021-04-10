package com.denizmertdemir.kotlinplayground

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class TestViewModel @ViewModelInject constructor(
    @Named("TestString") testString: String
): ViewModel() {

    init {
        Log.d("ViewModelTrackLog", "TestString : $testString ")
    }
}