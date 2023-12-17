package com.soulanjo.app.modules.trendingtabcontainer.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseFragment
import com.soulanjo.app.databinding.FragmentTrendingTabContainerBinding
import com.soulanjo.app.modules.search.ui.SearchActivity
import com.soulanjo.app.modules.trendingtabcontainer.`data`.model.StoriesRowModel
import com.soulanjo.app.modules.trendingtabcontainer.`data`.viewmodel.TrendingTabContainerVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TrendingTabContainerFragment :
    BaseFragment<FragmentTrendingTabContainerBinding>(R.layout.fragment_trending_tab_container) {
  private val viewModel: TrendingTabContainerVM by viewModels<TrendingTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val storiesAdapter = StoriesAdapter(viewModel.storiesList.value?:mutableListOf())
    binding.recyclerStories.adapter = storiesAdapter
    storiesAdapter.setOnItemClickListener(
    object : StoriesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : StoriesRowModel) {
        onClickRecyclerStories(view, position, item)
      }
    }
    )
    viewModel.storiesList.observe(requireActivity()) {
      storiesAdapter.updateData(it)
    }
    binding.trendingTabContainerVM = viewModel
    val adapter = TrendingTabContainerFragmentPagerAdapter(childFragmentManager,lifecycle)
    binding.viewPagerTabBarView.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerTabBarView) { tab, position ->
      tab.text = TrendingTabContainerFragmentPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.searchViewSearch.setOnClickListener {
        val destIntent = SearchActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }

    fun onClickRecyclerStories(
      view: View,
      position: Int,
      item: StoriesRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "TRENDING_TAB_CONTAINER_FRAGMENT"


      fun getInstance(bundle: Bundle?): TrendingTabContainerFragment {
        val fragment = TrendingTabContainerFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
