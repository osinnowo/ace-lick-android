package com.osinnowo.app.ace.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.osinnowo.app.ace.databinding.FragmentFoodBinding
import com.osinnowo.app.ace.util.DataState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FoodFragment : Fragment() {

    companion object {
        fun newInstance() = FoodFragment()
    }

    private val viewModel: FoodViewModel by viewModels()
    private lateinit var binding: FragmentFoodBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = FragmentFoodBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    fun init() {
        viewModel.dataState.observe(viewLifecycleOwner) { state ->
            when(state) {
                is DataState.Loading -> { Log.d("FoodFragment", "isLoading") }
                is DataState.Success -> {
                    state.data.forEach {
                        it.content?.let { it1 -> Log.d("FoodFragment", it1) };
                    }
                }
                is DataState.Error -> {
                    Log.d("FoodFragment", "Error: ${state.exception.message}")
                }
            }
        }
        viewModel.getFoodItems()
    }
}