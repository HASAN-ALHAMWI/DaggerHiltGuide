package com.hasan.daggerhiltguide.di

import com.hasan.daggerhiltguide.data.repository.MyRepositoryImpl
import com.hasan.daggerhiltguide.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(
        repository: MyRepositoryImpl
    ): MyRepository

}