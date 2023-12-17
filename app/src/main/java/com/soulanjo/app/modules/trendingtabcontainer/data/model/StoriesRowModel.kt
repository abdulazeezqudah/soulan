package com.soulanjo.app.modules.trendingtabcontainer.`data`.model

import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.di.MyApp
import kotlin.String

data class StoriesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRoy: String? = MyApp.getInstance().resources.getString(R.string.lbl_roy)

)
