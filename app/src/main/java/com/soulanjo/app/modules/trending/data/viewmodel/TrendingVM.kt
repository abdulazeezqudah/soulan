package com.soulanjo.app.modules.trending.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.trending.`data`.model.TrendingModel
import com.soulanjo.app.modules.trending.`data`.model.TrendingpostsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TrendingVM : ViewModel(), KoinComponent {
  val trendingModel: MutableLiveData<TrendingModel> = MutableLiveData(TrendingModel())

  var navArguments: Bundle? = null

  val trendingPostsList: MutableLiveData<MutableList<TrendingpostsRowModel>> =
      MutableLiveData(mutableListOf())
}
