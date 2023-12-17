package com.soulanjo.app.modules.stories.ui

import android.view.View
import androidx.activity.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseActivity
import com.soulanjo.app.databinding.ActivityStoriesBinding
import com.soulanjo.app.modules.search.ui.SearchActivity
import com.soulanjo.app.modules.stories.`data`.model.FrameRowModel
import com.soulanjo.app.modules.stories.`data`.model.Stories2RowModel
import com.soulanjo.app.modules.stories.`data`.viewmodel.StoriesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StoriesActivity : BaseActivity<ActivityStoriesBinding>(R.layout.activity_stories) {
  private val viewModel: StoriesVM by viewModels<StoriesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val storiesAdapter = StoriesAdapter(viewModel.storiesList.value?:mutableListOf())
    binding.recyclerStories.adapter = storiesAdapter
    storiesAdapter.setOnItemClickListener(
    object : StoriesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Stories2RowModel) {
        onClickRecyclerStories(view, position, item)
      }
    }
    )
    viewModel.storiesList.observe(this) {
      storiesAdapter.updateData(it)
    }
    val frameAdapter = FrameAdapter(viewModel.frameList.value?:mutableListOf())
    binding.recyclerFrame.adapter = frameAdapter
    frameAdapter.setOnItemClickListener(
    object : FrameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FrameRowModel) {
        onClickRecyclerFrame(view, position, item)
      }
    }
    )
    viewModel.frameList.observe(this) {
      frameAdapter.updateData(it)
    }
    binding.storiesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.searchViewSearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStories(
    view: View,
    position: Int,
    item: Stories2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerFrame(
    view: View,
    position: Int,
    item: FrameRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "STORIES_ACTIVITY"

  }
}
