package com.soulanjo.app.modules.trendingpoststabcontainer.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.google.android.material.tabs.TabLayoutMediator
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseActivity
import com.soulanjo.app.databinding.ActivityTrendingPostsTabContainerBinding
import com.soulanjo.app.modules.trendingpoststabcontainer.`data`.viewmodel.TrendingPostsTabContainerVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class TrendingPostsTabContainerActivity :
    BaseActivity<ActivityTrendingPostsTabContainerBinding>(R.layout.activity_trending_posts_tab_container)
    {
  private val viewModel: TrendingPostsTabContainerVM by viewModels<TrendingPostsTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.trendingPostsTabContainerVM = viewModel
    val adapter =
    TrendingPostsTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabBarView.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerTabBarView) { tab, position ->
      tab.text = TrendingPostsTabContainerActivityPagerAdapter.title[position]
      }.attach()
      setUpSearchViewSearchListener()
    }

    override fun setUpClicks(): Unit {
    }

    private fun setUpSearchViewSearchListener(): Unit {
      binding.searchViewSearch.setOnQueryTextListener(object :
      SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(p0 : String) : Boolean {
          // Performs search when user hit
          // the search button on the keyboard
          return false
        }
        override fun onQueryTextChange(p0 : String) : Boolean {
          // Start filtering the list as user
          // start entering the characters
          return false
        }
        })
      }

      companion object {
        const val TAG: String = "TRENDING_POSTS_TAB_CONTAINER_ACTIVITY"

      }
    }
