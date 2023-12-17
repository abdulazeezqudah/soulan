package com.soulanjo.app.modules.pageview.ui

import android.view.View
import androidx.activity.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseActivity
import com.soulanjo.app.databinding.ActivityPageViewBinding
import com.soulanjo.app.modules.pageview.`data`.model.PageviewRowModel
import com.soulanjo.app.modules.pageview.`data`.viewmodel.PageViewVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PageViewActivity : BaseActivity<ActivityPageViewBinding>(R.layout.activity_page_view) {
  private val viewModel: PageViewVM by viewModels<PageViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val pageViewAdapter = PageViewAdapter(viewModel.pageViewList.value?:mutableListOf())
    binding.recyclerPageView.adapter = pageViewAdapter
    pageViewAdapter.setOnItemClickListener(
    object : PageViewAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PageviewRowModel) {
        onClickRecyclerPageView(view, position, item)
      }
    }
    )
    viewModel.pageViewList.observe(this) {
      pageViewAdapter.updateData(it)
    }
    binding.pageViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowBack.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerPageView(
    view: View,
    position: Int,
    item: PageviewRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PAGE_VIEW_ACTIVITY"

  }
}
