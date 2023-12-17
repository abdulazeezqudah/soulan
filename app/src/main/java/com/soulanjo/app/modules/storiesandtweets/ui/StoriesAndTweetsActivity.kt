package com.soulanjo.app.modules.storiesandtweets.ui

import android.view.View
import androidx.activity.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseActivity
import com.soulanjo.app.databinding.ActivityStoriesAndTweetsBinding
import com.soulanjo.app.modules.search.ui.SearchActivity
import com.soulanjo.app.modules.storiesandtweets.`data`.model.Frame1RowModel
import com.soulanjo.app.modules.storiesandtweets.`data`.model.LiveRowModel
import com.soulanjo.app.modules.storiesandtweets.`data`.viewmodel.StoriesAndTweetsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StoriesAndTweetsActivity :
    BaseActivity<ActivityStoriesAndTweetsBinding>(R.layout.activity_stories_and_tweets) {
  private val viewModel: StoriesAndTweetsVM by viewModels<StoriesAndTweetsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val lIVEAdapter = LIVEAdapter(viewModel.lIVEList.value?:mutableListOf())
    binding.recyclerLIVE.adapter = lIVEAdapter
    lIVEAdapter.setOnItemClickListener(
    object : LIVEAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LiveRowModel) {
        onClickRecyclerLIVE(view, position, item)
      }
    }
    )
    viewModel.lIVEList.observe(this) {
      lIVEAdapter.updateData(it)
    }
    val frameAdapter = FrameAdapter(viewModel.frameList.value?:mutableListOf())
    binding.recyclerFrame.adapter = frameAdapter
    frameAdapter.setOnItemClickListener(
    object : FrameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Frame1RowModel) {
        onClickRecyclerFrame(view, position, item)
      }
    }
    )
    viewModel.frameList.observe(this) {
      frameAdapter.updateData(it)
    }
    binding.storiesAndTweetsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.searchViewSearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerLIVE(
    view: View,
    position: Int,
    item: LiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerFrame(
    view: View,
    position: Int,
    item: Frame1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "STORIES_AND_TWEETS_ACTIVITY"

  }
}
