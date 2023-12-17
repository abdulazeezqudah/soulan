package com.soulanjo.app.modules.stories.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.stories.`data`.model.FrameRowModel
import com.soulanjo.app.modules.stories.`data`.model.Stories2RowModel
import com.soulanjo.app.modules.stories.`data`.model.StoriesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StoriesVM : ViewModel(), KoinComponent {
  val storiesModel: MutableLiveData<StoriesModel> = MutableLiveData(StoriesModel())

  var navArguments: Bundle? = null

  val storiesList: MutableLiveData<MutableList<Stories2RowModel>> = MutableLiveData(mutableListOf())

  val frameList: MutableLiveData<MutableList<FrameRowModel>> = MutableLiveData(mutableListOf())
}
