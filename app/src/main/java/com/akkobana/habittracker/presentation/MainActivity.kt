package com.akkobana.habittracker.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akkobana.habittracker.R
import com.akkobana.habittracker.databinding.ActivityMainBinding

class HabitTrackerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}