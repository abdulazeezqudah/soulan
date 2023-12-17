package com.soulanjo.app.modules.forgotpassword.`data`.model

import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_your2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null
)
