package com.akkobana.habittracker.data.local.dto.account

import kotlinx.serialization.Serializable

@Serializable
data class TokenDto(
    val accessToken: String
)