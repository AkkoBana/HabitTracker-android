package com.akkobana.habittracker.presentation.screens.auth


import com.akkobana.habittracker.databinding.ActivityAuthBinding
import com.akkobana.habittracker.presentation.base.BaseActivity
import com.akkobana.habittracker.presentation.screens.habits.viewmodel.AuthViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class AuthActivity : BaseActivity<ActivityAuthBinding>() {

    private val viewModel by viewModel<AuthViewModel>()

    override fun initializeBinding(): ActivityAuthBinding =
        ActivityAuthBinding.inflate(layoutInflater)


}