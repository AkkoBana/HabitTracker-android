package com.akkobana.habittracker.domain.usecases.user_usecases.auth_usecases

import com.akkobana.habittracker.domain.entities.user.AuthEntity
import com.akkobana.habittracker.domain.repository.NetworkRepository

class AuthUserUseCaseImpl (
    private val networkRepository: NetworkRepository
): AuthUserUseCase {
    override suspend fun authUser(authEntity: AuthEntity) {
        TODO("Not yet implemented")
    }
}