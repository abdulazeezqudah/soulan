package com.soulanjo.app.modules.loginscreen.`data`.model

import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.di.MyApp
import kotlin.String

data class LoginScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindNewFriend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_new_friend_connection)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_with_billions_of)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrLoginWith: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)

)
