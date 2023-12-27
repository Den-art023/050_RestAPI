package com.den.consumeapi.ui.kontak.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.den.consumeapi.repository.KontakRepository

class insertViewModel(private val kontakRepository: KontakRepository): ViewModel(){

    var insertKontakState by mutableStateOf(InsertUiState())
        private set




}

