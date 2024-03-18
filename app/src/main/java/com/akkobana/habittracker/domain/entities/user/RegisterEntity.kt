package com.akkobana.habittracker.domain.entities.user

data class RegisterEntity(
    val login: String,
    val email: String,
    val password: String,
    val username: String,
)