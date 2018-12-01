package com.marmotorganization.appmobile.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.marmotorganization.appmobile.R
import com.marmotorganization.appmobile.viewModels.MainActivityVM
import androidx.databinding.DataBindingUtil
import com.marmotorganization.appmobile.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainActivityVM: MainActivityVM = ViewModelProviders.of(this).get(MainActivityVM::class.java)
        val binding: ActivityMainBinding  = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewmodel = mainActivityVM
//        mainActivityVM.testLD.value = ""
        mainActivityVM.testLD.value = "TestValSetVM"
    }
}
