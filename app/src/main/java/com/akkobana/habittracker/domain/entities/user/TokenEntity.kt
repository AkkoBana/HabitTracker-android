package com.akkobana.habittracker.domain.entities.user

data class TokenEntity (
    val accessToken: String,
    val refreshToken: String,
)