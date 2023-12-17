package com.soulanjo.app.modules.dailynew.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.dailynew.`data`.model.DailyNewModel
import com.soulanjo.app.modules.dailynew.`data`.model.FortyRowModel
import com.soulanjo.app.modules.dailynew.`data`.model.Profiles1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DailyNewVM : ViewModel(), KoinComponent {
  val dailyNewModel: MutableLiveData<DailyNewModel> = MutableLiveData(DailyNewModel())

  var navArguments: Bundle? = null

  val profilesList: MutableLiveData<MutableList<Profiles1RowModel>> =
      MutableLiveData(mutableListOf())

  val fortyList: MutableLiveData<MutableList<FortyRowModel>> = MutableLiveData(mutableListOf())
}
