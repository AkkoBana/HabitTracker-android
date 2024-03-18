package com.akkobana.habittracker.presentation.base

abstract sealed class BaseUiState<out T> {
    abstract class Success<T>(val result: T): BaseUiState<T>()
    abstract class Error(val message: String) : BaseUiState<Nothing>()
    object Loading: BaseUiState<Nothing>()
}