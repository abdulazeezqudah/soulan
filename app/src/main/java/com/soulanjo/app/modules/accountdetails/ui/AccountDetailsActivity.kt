package com.soulanjo.app.modules.accountdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseActivity
import com.soulanjo.app.databinding.ActivityAccountDetailsBinding
import com.soulanjo.app.modules.accountdetails.`data`.model.FortysixRowModel
import com.soulanjo.app.modules.accountdetails.`data`.model.WidgetRowModel
import com.soulanjo.app.modules.accountdetails.`data`.viewmodel.AccountDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AccountDetailsActivity :
    BaseActivity<ActivityAccountDetailsBinding>(R.layout.activity_account_details) {
  private val viewModel: AccountDetailsVM by viewModels<AccountDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val fortySixAdapter = FortySixAdapter(viewModel.fortySixList.value?:mutableListOf())
    binding.recyclerFortySix.adapter = fortySixAdapter
    fortySixAdapter.setOnItemClickListener(
    object : FortySixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FortysixRowModel) {
        onClickRecyclerFortySix(view, position, item)
      }
    }
    )
    viewModel.fortySixList.observe(this) {
      fortySixAdapter.updateData(it)
    }
    val widgetAdapter = WidgetAdapter(viewModel.widgetList.value?:mutableListOf())
    binding.recyclerWidget.adapter = widgetAdapter
    widgetAdapter.setOnItemClickListener(
    object : WidgetAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : WidgetRowModel) {
        onClickRecyclerWidget(view, position, item)
      }
    }
    )
    viewModel.widgetList.observe(this) {
      widgetAdapter.updateData(it)
    }
    binding.accountDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowBack.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerFortySix(
    view: View,
    position: Int,
    item: FortysixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerWidget(
    view: View,
    position: Int,
    item: WidgetRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
