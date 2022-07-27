package com.hasan.daggerhiltguide.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()

}