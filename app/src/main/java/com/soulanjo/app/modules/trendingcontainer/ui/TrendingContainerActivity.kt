package com.soulanjo.app.modules.trendingcontainer.ui

import androidx.activity.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseActivity
import com.soulanjo.app.databinding.ActivityTrendingContainerBinding
import com.soulanjo.app.extensions.loadFragment
import com.soulanjo.app.modules.messages.ui.MessagesFragment
import com.soulanjo.app.modules.notifications.ui.NotificationsFragment
import com.soulanjo.app.modules.profile.ui.ProfileFragment
import com.soulanjo.app.modules.trendingcontainer.`data`.viewmodel.TrendingContainerVM
import com.soulanjo.app.modules.trendingtabcontainer.ui.TrendingTabContainerFragment
import kotlin.String
import kotlin.Unit

class TrendingContainerActivity :
    BaseActivity<ActivityTrendingContainerBinding>(R.layout.activity_trending_container) {
  private val viewModel: TrendingContainerVM by viewModels<TrendingContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.trendingContainerVM = viewModel
    val destFragment = TrendingTabContainerFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = TrendingTabContainerFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearNotifications.setOnClickListener {
      val destFragment = NotificationsFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = NotificationsFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearMessages.setOnClickListener {
      val destFragment = MessagesFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = MessagesFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearProfile.setOnClickListener {
      val destFragment = ProfileFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = ProfileFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearHome.setOnClickListener {
      val destFragment = TrendingTabContainerFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = TrendingTabContainerFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "TRENDING_CONTAINER_ACTIVITY"

  }
}
