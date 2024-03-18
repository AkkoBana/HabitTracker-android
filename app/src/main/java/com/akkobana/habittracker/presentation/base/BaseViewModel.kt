package com.akkobana.habittracker.presentation.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

abstract class BaseViewModel<uiState : BaseUiState<*>, vmEvent : BaseViewModelEvent, uiEvent : BaseUiEvent>: ViewModel() {

    abstract val _uiState: MutableStateFlow<uiState>
    abstract val uiState: StateFlow<uiState>

    abstract val _vmEvent: MutableSharedFlow<vmEvent>
    abstract val vmEvent: SharedFlow<vmEvent>

    abstract fun postUiEvent(uiEvent: uiEvent)

}