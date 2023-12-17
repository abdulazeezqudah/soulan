package com.soulanjo.app.modules.stories.`data`.model

import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.di.MyApp
import kotlin.String

data class FrameRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLIVEWeTheFest: String? =
      MyApp.getInstance().resources.getString(R.string.msg_live_we_the_fest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_19_00_forg_stadium)

)
