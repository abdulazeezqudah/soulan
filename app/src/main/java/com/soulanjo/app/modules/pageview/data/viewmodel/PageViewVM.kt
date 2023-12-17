package com.soulanjo.app.modules.pageview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.pageview.`data`.model.PageViewModel
import com.soulanjo.app.modules.pageview.`data`.model.PageviewRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PageViewVM : ViewModel(), KoinComponent {
  val pageViewModel: MutableLiveData<PageViewModel> = MutableLiveData(PageViewModel())

  var navArguments: Bundle? = null

  val pageViewList: MutableLiveData<MutableList<PageviewRowModel>> =
      MutableLiveData(mutableListOf())
}
