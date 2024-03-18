package com.akkobana.habittracker.presentation.screens.habits.ui_states

sealed class AnalyticsUiState {
    data object Loading: AuthUiState()
    data object NoNetwork: AuthUiState()
//    data class AnalyticsResult(): AuthUiState()
}