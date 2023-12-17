package com.soulanjo.app.modules.accountdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.accountdetails.`data`.model.AccountDetailsModel
import com.soulanjo.app.modules.accountdetails.`data`.model.FortysixRowModel
import com.soulanjo.app.modules.accountdetails.`data`.model.WidgetRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AccountDetailsVM : ViewModel(), KoinComponent {
  val accountDetailsModel: MutableLiveData<AccountDetailsModel> =
      MutableLiveData(AccountDetailsModel())

  var navArguments: Bundle? = null

  val fortySixList: MutableLiveData<MutableList<FortysixRowModel>> =
      MutableLiveData(mutableListOf())

  val widgetList: MutableLiveData<MutableList<WidgetRowModel>> = MutableLiveData(mutableListOf())
}
