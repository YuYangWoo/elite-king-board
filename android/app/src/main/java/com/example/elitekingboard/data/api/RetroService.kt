package com.example.elitekingboard.data.api

import com.example.elitekingboard.data.model.request.SignUpRequest
import com.example.elitekingboard.data.model.response.SignUpResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface RetroService {
    @POST("/accounts/sign-up")
    suspend fun requestSignUp(@Body signUpRequest: SignUpRequest): Response<SignUpResponse>
}
