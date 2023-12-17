package com.soulanjo.app.modules.foryou.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.foryou.`data`.model.ForYouModel
import org.koin.core.KoinComponent

class ForYouVM : ViewModel(), KoinComponent {
  val forYouModel: MutableLiveData<ForYouModel> = MutableLiveData(ForYouModel())

  var navArguments: Bundle? = null
}
