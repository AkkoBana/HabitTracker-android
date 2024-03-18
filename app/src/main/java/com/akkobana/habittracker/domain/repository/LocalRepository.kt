package com.akkobana.habittracker.domain.repository

import com.akkobana.habittracker.domain.entities.user.TokenEntity

interface LocalRepository {

    fun getJwtToken(): TokenEntity?

    fun setJwtToken(token: TokenEntity)

}