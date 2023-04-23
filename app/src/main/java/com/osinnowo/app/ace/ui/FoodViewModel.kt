package com.osinnowo.app.ace.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.osinnowo.app.ace.model.entity.FoodEntity
import com.osinnowo.app.ace.repository.FoodRepository
import com.osinnowo.app.ace.util.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class FoodViewModel
@Inject
constructor(
    private val repository: FoodRepository
): ViewModel() {
    private var _dataState = MutableLiveData<DataState<List<FoodEntity>>>()
    val dataState: LiveData<DataState<List<FoodEntity>>>
        get() = _dataState

    fun getFoodItems() {
        viewModelScope.launch {
            repository.getListOfFoodItems()
                .onEach { _dataState.value = it  }
                .launchIn(viewModelScope)
        }
    }
}