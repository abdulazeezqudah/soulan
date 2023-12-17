package com.soulanjo.app.modules.live.ui

import androidx.activity.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseActivity
import com.soulanjo.app.databinding.ActivityLiveBinding
import com.soulanjo.app.modules.live.`data`.viewmodel.LiveVM
import kotlin.String
import kotlin.Unit

class LiveActivity : BaseActivity<ActivityLiveBinding>(R.layout.activity_live) {
  private val viewModel: LiveVM by viewModels<LiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LIVE_ACTIVITY"

  }
}
