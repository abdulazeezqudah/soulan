package com.soulanjo.app.modules.storiesandtweets.`data`.model

import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.di.MyApp
import kotlin.String

data class Frame1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbertOConnor: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_albert_o_connor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_hours_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIntroduceIAmA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_introduce_i_am_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_800)

)
