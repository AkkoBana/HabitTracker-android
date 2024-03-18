package com.akkobana.habittracker.data.network.api

import com.akkobana.habittracker.data.network.dto.UserRequest
import com.akkobana.habittracker.data.network.dto.UserResponse

interface PostService {

    suspend fun getPosts(): List<UserResponse>

    suspend fun createPost(userRequest: UserRequest): UserResponse?
}