package com.soulanjo.app.modules.trending.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseFragment
import com.soulanjo.app.databinding.FragmentTrendingBinding
import com.soulanjo.app.modules.trending.`data`.model.TrendingpostsRowModel
import com.soulanjo.app.modules.trending.`data`.viewmodel.TrendingVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TrendingFragment : BaseFragment<FragmentTrendingBinding>(R.layout.fragment_trending) {
  private val viewModel: TrendingVM by viewModels<TrendingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val trendingPostsAdapter =
    TrendingPostsAdapter(viewModel.trendingPostsList.value?:mutableListOf())
    binding.recyclerTrendingPosts.adapter = trendingPostsAdapter
    trendingPostsAdapter.setOnItemClickListener(
    object : TrendingPostsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TrendingpostsRowModel) {
        onClickRecyclerTrendingPosts(view, position, item)
      }
    }
    )
    viewModel.trendingPostsList.observe(requireActivity()) {
      trendingPostsAdapter.updateData(it)
    }
    binding.trendingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerTrendingPosts(
    view: View,
    position: Int,
    item: TrendingpostsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TRENDING_FRAGMENT"

  }
}
