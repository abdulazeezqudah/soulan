package com.soulanjo.app.modules.dailynew.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseFragment
import com.soulanjo.app.databinding.FragmentDailyNewBinding
import com.soulanjo.app.modules.dailynew.`data`.model.FortyRowModel
import com.soulanjo.app.modules.dailynew.`data`.model.Profiles1RowModel
import com.soulanjo.app.modules.dailynew.`data`.viewmodel.DailyNewVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DailyNewFragment : BaseFragment<FragmentDailyNewBinding>(R.layout.fragment_daily_new) {
  private val viewModel: DailyNewVM by viewModels<DailyNewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val profilesAdapter = ProfilesAdapter(viewModel.profilesList.value?:mutableListOf())
    binding.recyclerProfiles.adapter = profilesAdapter
    profilesAdapter.setOnItemClickListener(
    object : ProfilesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Profiles1RowModel) {
        onClickRecyclerProfiles(view, position, item)
      }
    }
    )
    viewModel.profilesList.observe(requireActivity()) {
      profilesAdapter.updateData(it)
    }
    val fortyAdapter = FortyAdapter(viewModel.fortyList.value?:mutableListOf())
    binding.recyclerForty.adapter = fortyAdapter
    fortyAdapter.setOnItemClickListener(
    object : FortyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FortyRowModel) {
        onClickRecyclerForty(view, position, item)
      }
    }
    )
    viewModel.fortyList.observe(requireActivity()) {
      fortyAdapter.updateData(it)
    }
    binding.dailyNewVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerProfiles(
    view: View,
    position: Int,
    item: Profiles1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerForty(
    view: View,
    position: Int,
    item: FortyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DAILY_NEW_FRAGMENT"

  }
}
