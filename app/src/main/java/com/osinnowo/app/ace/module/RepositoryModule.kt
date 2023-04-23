package com.osinnowo.app.ace.module

import com.osinnowo.app.ace.mapper.FoodMapper
import com.osinnowo.app.ace.repository.FoodRepository
import com.osinnowo.app.ace.service.NetworkService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @ViewModelScoped
    @Provides
    fun providesFoodRepository(networkService: NetworkService, mapper: FoodMapper): FoodRepository {
        return FoodRepository(networkService, mapper)
    }
}