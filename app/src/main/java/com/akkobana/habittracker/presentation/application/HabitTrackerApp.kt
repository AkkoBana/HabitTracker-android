package com.akkobana.habittracker.presentation.application

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.akkobana.habittracker.di.apiModule
import com.akkobana.habittracker.di.appModule
import com.akkobana.habittracker.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class HabitTrackerApp: Application() {

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        startKoin()
    }

    private fun startKoin() {
        startKoin {
            // Log Koin into Android logger
            androidLogger()
            // Reference Android context
            androidContext(this@HabitTrackerApp)
            // Load modules
            modules(networkModule, apiModule, appModule)
        }
    }


}