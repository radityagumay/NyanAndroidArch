package moe.feng.arch.demo

import android.Manifest
import android.os.Bundle
import moe.feng.common.arch.BindingActivity
import moe.feng.common.arch.demo.R
import moe.feng.common.arch.demo.databinding.ActivityMainBinding

class MainActivity: BindingActivity<ActivityMainBinding>() {

    override val defaultLayoutId: Int = R.layout.activity_main

    private val viewModel = MainViewModel()

    override fun onViewCreated(savedInstanceState: Bundle?) {
        binding.viewModel = viewModel
        binding.init()
        viewModel.mockData()

        runWithPermission(Manifest.permission.ACCESS_NETWORK_STATE, onSuccess = {

        }, onFailed = {

        })
    }

    private fun ActivityMainBinding.init() {

    }

}