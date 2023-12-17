package com.soulanjo.app.modules.trendingpoststabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.trendingpoststabcontainer.`data`.model.TrendingPostsTabContainerModel
import org.koin.core.KoinComponent

class TrendingPostsTabContainerVM : ViewModel(), KoinComponent {
  val trendingPostsTabContainerModel: MutableLiveData<TrendingPostsTabContainerModel> =
      MutableLiveData(TrendingPostsTabContainerModel())

  var navArguments: Bundle? = null
}
