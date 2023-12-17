package com.soulanjo.app.modules.foryou.ui

import androidx.activity.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseActivity
import com.soulanjo.app.databinding.ActivityForYouBinding
import com.soulanjo.app.modules.foryou.`data`.viewmodel.ForYouVM
import kotlin.String
import kotlin.Unit

class ForYouActivity : BaseActivity<ActivityForYouBinding>(R.layout.activity_for_you) {
  private val viewModel: ForYouVM by viewModels<ForYouVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forYouVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FOR_YOU_ACTIVITY"

  }
}
