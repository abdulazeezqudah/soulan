package com.soulanjo.app.modules.notification.`data`.model

import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTurnOnNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.msg_turn_on_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTurnOnNotifications1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_turn_on_notifications2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)

)
