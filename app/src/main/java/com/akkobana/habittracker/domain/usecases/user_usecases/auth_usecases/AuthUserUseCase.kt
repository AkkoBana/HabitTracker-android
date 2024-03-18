package com.akkobana.habittracker.domain.usecases.user_usecases.auth_usecases

import com.akkobana.habittracker.domain.entities.user.AuthEntity

interface AuthUserUseCase {
    suspend fun authUser(authEntity: AuthEntity)
}