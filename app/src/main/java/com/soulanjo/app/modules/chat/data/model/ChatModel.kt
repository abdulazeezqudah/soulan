package com.soulanjo.app.modules.chat.`data`.model

import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.di.MyApp
import kotlin.String

data class ChatModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGarryWiller: String? = MyApp.getInstance().resources.getString(R.string.lbl_garry_willer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiLarryHowAre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hi_larry_how_are)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivered: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivered)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloGerryIM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hello_gerry_i_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivered1: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivered)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCommentValue: String? = null
)
