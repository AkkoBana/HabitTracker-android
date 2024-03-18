package com.akkobana.habittracker.data.network.api.auth

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.post

class AuthApiImpl(
    private val client: HttpClient
): AuthApi {
    override fun authUser() = client.post(

    )
}