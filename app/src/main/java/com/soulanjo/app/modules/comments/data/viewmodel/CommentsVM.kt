package com.soulanjo.app.modules.comments.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soulanjo.app.modules.comments.`data`.model.CommentlistRowModel
import com.soulanjo.app.modules.comments.`data`.model.CommentsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CommentsVM : ViewModel(), KoinComponent {
  val commentsModel: MutableLiveData<CommentsModel> = MutableLiveData(CommentsModel())

  var navArguments: Bundle? = null

  val commentListList: MutableLiveData<MutableList<CommentlistRowModel>> =
      MutableLiveData(mutableListOf())
}
