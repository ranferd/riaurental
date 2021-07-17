package com.farid.riaurental.UI.chatlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChatlistViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is chatlist Fragment"
    }
    val text: LiveData<String> = _text
}