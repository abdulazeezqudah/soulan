package com.soulanjo.app.modules.friends.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseActivity
import com.soulanjo.app.databinding.ActivityFriendsBinding
import com.soulanjo.app.modules.friends.`data`.model.FollowRowModel
import com.soulanjo.app.modules.friends.`data`.model.TwitterRowModel
import com.soulanjo.app.modules.friends.`data`.viewmodel.FriendsVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FriendsActivity : BaseActivity<ActivityFriendsBinding>(R.layout.activity_friends) {
  private val viewModel: FriendsVM by viewModels<FriendsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val twitterAdapter = TwitterAdapter(viewModel.twitterList.value?:mutableListOf())
    binding.recyclerTwitter.adapter = twitterAdapter
    twitterAdapter.setOnItemClickListener(
    object : TwitterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TwitterRowModel) {
        onClickRecyclerTwitter(view, position, item)
      }
    }
    )
    viewModel.twitterList.observe(this) {
      twitterAdapter.updateData(it)
    }
    val followAdapter = FollowAdapter(viewModel.followList.value?:mutableListOf())
    binding.recyclerFollow.adapter = followAdapter
    followAdapter.setOnItemClickListener(
    object : FollowAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FollowRowModel) {
        onClickRecyclerFollow(view, position, item)
      }
    }
    )
    viewModel.followList.observe(this) {
      followAdapter.updateData(it)
    }
    binding.friendsVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowBack.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerTwitter(
    view: View,
    position: Int,
    item: TwitterRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerFollow(
    view: View,
    position: Int,
    item: FollowRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
      const val TAG: String = "FRIENDS_ACTIVITY"

    }
  }
