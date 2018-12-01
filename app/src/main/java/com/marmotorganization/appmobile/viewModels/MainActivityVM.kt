package com.marmotorganization.appmobile.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.marmotorganization.appmobile.models.User

class MainActivityVM : ViewModel() {
    private lateinit var user: User
    private lateinit var test: String

    public var testLD = MutableLiveData<String>()

    init {
        testLD.value = "TestValSetVM"
    }

}