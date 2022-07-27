package com.hasan.daggerhiltguide

import androidx.lifecycle.ViewModel
import com.hasan.daggerhiltguide.domain.repository.MyRepository
import dagger.Lazy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Lazy<MyRepository>
) : ViewModel() {

    init {
        repository.get()
    }

}