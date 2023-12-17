package com.soulanjo.app.modules.accountview.ui

import androidx.activity.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseActivity
import com.soulanjo.app.databinding.ActivityAccountViewBinding
import com.soulanjo.app.modules.accountdetails.ui.AccountDetailsActivity
import com.soulanjo.app.modules.accountview.`data`.viewmodel.AccountViewVM
import kotlin.String
import kotlin.Unit

class AccountViewActivity : BaseActivity<ActivityAccountViewBinding>(R.layout.activity_account_view)
    {
  private val viewModel: AccountViewVM by viewModels<AccountViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAccountDetails.setOnClickListener {
      val destIntent = AccountDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowBack.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_VIEW_ACTIVITY"

  }
}
