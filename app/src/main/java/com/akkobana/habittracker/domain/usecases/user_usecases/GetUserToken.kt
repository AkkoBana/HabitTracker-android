package com.akkobana.habittracker.domain.usecases.user_usecases

import com.akkobana.habittracker.domain.entities.user.TokenEntity
import com.akkobana.habittracker.domain.repository.LocalRepository

interface GetUserToken {

    fun getUserToken(): TokenEntity?

}