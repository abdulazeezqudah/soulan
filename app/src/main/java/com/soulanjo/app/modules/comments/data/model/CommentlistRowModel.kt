package com.soulanjo.app.modules.comments.`data`.model

import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.di.MyApp
import kotlin.String

data class CommentlistRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRizalReynaldhi: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_rizal_reynaldhi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_minutes_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMostPeopleNever: String? =
      MyApp.getInstance().resources.getString(R.string.msg_most_people_never)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReply: String? = MyApp.getInstance().resources.getString(R.string.lbl_reply)

)
