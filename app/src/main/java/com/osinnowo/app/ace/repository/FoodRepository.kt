package com.osinnowo.app.ace.repository

import com.osinnowo.app.ace.mapper.FoodMapper
import com.osinnowo.app.ace.service.NetworkService
import com.osinnowo.app.ace.util.DataState
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FoodRepository
@Inject
constructor(
    private val networkService: NetworkService,
    private val mapper: FoodMapper
) {
    suspend fun getListOfFoodItems() = flow {
        emit(DataState.Loading)
        try {
            val response = networkService.searchFood()
            val items = response.searchResults.first().results.map { mapper.mapToEntity(it) }
            emit(DataState.Success(items))
        } catch (e: Exception) {
            emit(DataState.Error(e));
        }
    }
}