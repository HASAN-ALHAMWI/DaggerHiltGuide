package com.hasan.daggerhiltguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.hasan.daggerhiltguide.ui.theme.DaggerHiltGuideTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltGuideTheme {
                val viewModel = hiltViewModel<MainViewModel>()
            }
        }
    }
}
