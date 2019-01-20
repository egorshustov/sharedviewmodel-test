package com.egorshustov.sharedviewmodeltest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val text : MutableLiveData<CharSequence> = MutableLiveData()

    fun setText(input: CharSequence) {
        text.value = input
    }

    fun getText() : LiveData<CharSequence> {
        return text
    }
}