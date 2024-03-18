package com.akkobana.habittracker.domain.usecases.user_usecases

import com.akkobana.habittracker.domain.entities.user.TokenEntity
import com.akkobana.habittracker.domain.repository.LocalRepository

class SetUserTokenImpl(
    private val localRepository: LocalRepository
) : SetUserToken {
    override fun setJwtToken(token: TokenEntity) {
        localRepository.setJwtToken(token)
    }
}