package com.soulanjo.app.modules.friends.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.friends.`data`.model.FollowRowModel
import com.soulanjo.app.modules.friends.`data`.model.FriendsModel
import com.soulanjo.app.modules.friends.`data`.model.TwitterRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FriendsVM : ViewModel(), KoinComponent {
  val friendsModel: MutableLiveData<FriendsModel> = MutableLiveData(FriendsModel())

  var navArguments: Bundle? = null

  val twitterList: MutableLiveData<MutableList<TwitterRowModel>> = MutableLiveData(mutableListOf())

  val followList: MutableLiveData<MutableList<FollowRowModel>> = MutableLiveData(mutableListOf())
}
