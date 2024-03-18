package com.akkobana.habittracker.presentation.screens.habits.ui_states

sealed class SettingsUiState {
    data object Loading: AuthUiState()
    data object NoNetwork: AuthUiState()
//    data class HabitResults(): AuthUiState()

}