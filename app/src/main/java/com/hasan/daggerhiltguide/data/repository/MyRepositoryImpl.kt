package com.hasan.daggerhiltguide.data.repository

import android.app.Application
import com.hasan.daggerhiltguide.R
import com.hasan.daggerhiltguide.data.remote.MyApi
import com.hasan.daggerhiltguide.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val context: Application
) : MyRepository {

    init {
        val appName = context.getString(R.string.app_name)
        println("App Name: $appName")
    }

    override suspend fun doNetworkCall() {

    }
}