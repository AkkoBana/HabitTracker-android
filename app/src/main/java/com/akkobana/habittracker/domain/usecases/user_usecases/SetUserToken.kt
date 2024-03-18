package com.akkobana.habittracker.domain.usecases.user_usecases

import com.akkobana.habittracker.domain.entities.user.TokenEntity

interface SetUserToken {
    fun setJwtToken(token: TokenEntity)
}