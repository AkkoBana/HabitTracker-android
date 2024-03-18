package com.akkobana.habittracker.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<out VB: ViewBinding>: AppCompatActivity() {

    private lateinit var _binding: VB
    protected val binding: VB = _binding


    abstract fun initializeBinding(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = initializeBinding()
        setContentView(binding.root)
    }

}