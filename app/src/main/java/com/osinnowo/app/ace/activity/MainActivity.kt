package com.osinnowo.app.ace.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.osinnowo.app.ace.R
import com.osinnowo.app.ace.ui.FoodFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, FoodFragment.newInstance())
            .commit()
    }
}


