package com.farid.riaurental.UI.tenant.wishlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WishlistViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is wishlist Fragment"
    }
    val text: LiveData<String> = _text
}