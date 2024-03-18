package com.akkobana.habittracker.di

import com.akkobana.habittracker.presentation.screens.habits.viewmodel.AuthViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::AuthViewModel)
}