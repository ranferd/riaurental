package com.farid.riaurental.UI.owner.rent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RentViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is rent Fragment"
    }
    val text: LiveData<String> = _text
}