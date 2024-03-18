package com.akkobana.habittracker.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class UserRequest(
    val userId: Int,
    val body: String,
    val title: String
)
