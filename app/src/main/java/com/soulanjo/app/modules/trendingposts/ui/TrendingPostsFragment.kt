package com.soulanjo.app.modules.trendingposts.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseFragment
import com.soulanjo.app.databinding.FragmentTrendingPostsBinding
import com.soulanjo.app.modules.trendingposts.`data`.model.PostRowModel
import com.soulanjo.app.modules.trendingposts.`data`.viewmodel.TrendingPostsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TrendingPostsFragment :
    BaseFragment<FragmentTrendingPostsBinding>(R.layout.fragment_trending_posts) {
  private val viewModel: TrendingPostsVM by viewModels<TrendingPostsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val postAdapter = PostAdapter(viewModel.postList.value?:mutableListOf())
    binding.recyclerPost.adapter = postAdapter
    postAdapter.setOnItemClickListener(
    object : PostAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PostRowModel) {
        onClickRecyclerPost(view, position, item)
      }
    }
    )
    viewModel.postList.observe(requireActivity()) {
      postAdapter.updateData(it)
    }
    binding.trendingPostsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPost(
    view: View,
    position: Int,
    item: PostRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TRENDING_POSTS_FRAGMENT"

  }
}
