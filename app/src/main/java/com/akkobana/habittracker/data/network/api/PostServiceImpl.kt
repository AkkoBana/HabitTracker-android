package com.akkobana.habittracker.data.network.api

import com.akkobana.habittracker.data.network.dto.UserRequest
import com.akkobana.habittracker.data.network.dto.UserResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import okhttp3.Response

class  PostServiceImpl(
    private val client: HttpClient
): PostService {
    override suspend fun getPosts(): List<UserResponse> {
        return client.get {
            url
        }.body()
    }

    override suspend fun createPost(userRequest: UserRequest): UserResponse? {
        TODO("Not yet implemented")
    }


}