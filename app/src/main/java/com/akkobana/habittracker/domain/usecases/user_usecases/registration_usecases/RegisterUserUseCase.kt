package com.akkobana.habittracker.domain.usecases.user_usecases.registration_usecases

import com.akkobana.habittracker.domain.entities.user.RegisterEntity

interface RegisterUserUseCase {
    suspend fun registerUser(registerEntity: RegisterEntity)
}