package com.siapknow.projectbasket

import androidx.lifecycle.ViewModel
import com.siapknow.projectbasket.domain.usecase.uc_main.GetList
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    getList: GetList
) : ViewModel() {

    val showList = getList()
}