package com.kakapo.coast.features.dashboard.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(): ViewModel() {

    private val _state = MutableLiveData<DashboardViewState>()
    val state: LiveData<DashboardViewState> = _state

    init {
        _state.value = DashboardViewState()
    }


}