package com.hasan.daggerhiltguide.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET("testUrl")
    suspend fun doNetworkCall()
}