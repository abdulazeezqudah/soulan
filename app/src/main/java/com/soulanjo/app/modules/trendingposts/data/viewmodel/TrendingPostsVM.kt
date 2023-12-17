package com.soulanjo.app.modules.trendingposts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.trendingposts.`data`.model.PostRowModel
import com.soulanjo.app.modules.trendingposts.`data`.model.TrendingPostsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TrendingPostsVM : ViewModel(), KoinComponent {
  val trendingPostsModel: MutableLiveData<TrendingPostsModel> =
      MutableLiveData(TrendingPostsModel())

  var navArguments: Bundle? = null

  val postList: MutableLiveData<MutableList<PostRowModel>> = MutableLiveData(mutableListOf())
}
