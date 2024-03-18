package com.akkobana.habittracker.presentation.screens.splash

import android.animation.Animator.AnimatorListener
import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.addListener
import androidx.core.animation.doOnEnd
import androidx.lifecycle.lifecycleScope
import com.akkobana.habittracker.R
import com.akkobana.habittracker.databinding.ActivitySplashBinding
import com.akkobana.habittracker.presentation.MainActivity
import com.google.android.material.animation.AnimatorSetCompat
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()
        val animatorSet = AnimatorSet()
        val sdf = AnimatorInflater.loadAnimator(this@SplashActivity, R.animator.animator_logo)
        val set = AnimatorInflater.loadAnimator(this@SplashActivity, R.animator.animator_cirlce) as AnimatorSet
        set.setTarget(binding.circle)
        sdf.setTarget(binding.ivLogo)

        animatorSet.addListener { animator ->
            animator.doOnEnd {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }
        }
        animatorSet.play(sdf)
            .before(set)

        animatorSet.start()

    }

    private companion object {
        private const val SPLASH_DURATION = 2000L
    }

}