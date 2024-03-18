package com.akkobana.habittracker.domain.repository

import com.akkobana.habittracker.domain.entities.user.AuthEntity
import com.akkobana.habittracker.domain.entities.user.RegisterEntity

interface NetworkRepository {
    suspend fun authUser(authEntity: AuthEntity):
    suspend fun registerUser(registerEntity: RegisterEntity):
}