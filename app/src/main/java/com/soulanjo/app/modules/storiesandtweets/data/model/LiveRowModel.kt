package com.soulanjo.app.modules.storiesandtweets.`data`.model

import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.di.MyApp
import kotlin.String

data class LiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPost: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_post)

)
