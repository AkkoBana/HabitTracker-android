package com.akkobana.habittracker.data.repository

import com.akkobana.habittracker.data.local.mappers.TokenMapper
import com.akkobana.habittracker.data.local.sharedpref.account.AccountPref
import com.akkobana.habittracker.domain.entities.user.TokenEntity
import com.akkobana.habittracker.domain.repository.LocalRepository

class LocalRepositoryImpl(
    private val accountPref: AccountPref,
    private val tokenMapper: TokenMapper
): LocalRepository {

    override fun getJwtToken(): TokenEntity? =
        accountPref.jwtToken?.let { tokenDto ->
            tokenMapper.toDomain(tokenDto)
        }

    override fun setJwtToken(token: TokenEntity) {
        accountPref.jwtToken = tokenMapper.toData(token)
    }

}