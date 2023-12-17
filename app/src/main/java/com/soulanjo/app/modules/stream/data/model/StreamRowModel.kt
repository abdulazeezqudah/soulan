package com.soulanjo.app.modules.stream.`data`.model

import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.di.MyApp
import kotlin.String

data class StreamRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRosalia1: String? = MyApp.getInstance().resources.getString(R.string.lbl_rosalia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration1: String? = MyApp.getInstance().resources.getString(R.string.lbl_45_minutes_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRosalia2: String? = MyApp.getInstance().resources.getString(R.string.lbl_rosalia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration2: String? = MyApp.getInstance().resources.getString(R.string.lbl_45_minutes_ago)

)
