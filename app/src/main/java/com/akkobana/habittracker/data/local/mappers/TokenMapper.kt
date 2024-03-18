package com.akkobana.habittracker.data.local.mappers

import com.akkobana.habittracker.data.Mapper
import com.akkobana.habittracker.data.local.dto.account.TokenDto
import com.akkobana.habittracker.domain.entities.user.TokenEntity

class TokenMapper: Mapper<TokenEntity, TokenDto> {
    override fun toDomain(data: TokenDto): TokenEntity =
        TokenEntity(
            accessToken = data.accessToken,
            refreshToken = data.refreshToken
        )

    override fun toData(domain: TokenEntity): TokenDto =
        TokenDto(
            accessToken = domain.accessToken
        )
}