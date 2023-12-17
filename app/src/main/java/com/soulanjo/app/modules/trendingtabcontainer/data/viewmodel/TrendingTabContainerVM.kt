package com.soulanjo.app.modules.trendingtabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.trendingtabcontainer.`data`.model.StoriesRowModel
import com.soulanjo.app.modules.trendingtabcontainer.`data`.model.TrendingTabContainerModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TrendingTabContainerVM : ViewModel(), KoinComponent {
  val trendingTabContainerModel: MutableLiveData<TrendingTabContainerModel> =
      MutableLiveData(TrendingTabContainerModel())

  var navArguments: Bundle? = null

  val storiesList: MutableLiveData<MutableList<StoriesRowModel>> = MutableLiveData(mutableListOf())
}
