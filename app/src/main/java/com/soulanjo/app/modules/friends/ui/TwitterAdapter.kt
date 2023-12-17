package com.soulanjo.app.modules.friends.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowTwitterBinding
import com.soulanjo.app.modules.friends.`data`.model.TwitterRowModel
import kotlin.Int
import kotlin.collections.List

class TwitterAdapter(
  var list: List<TwitterRowModel>
) : RecyclerView.Adapter<TwitterAdapter.RowTwitterVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTwitterVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_twitter,parent,false)
    return RowTwitterVH(view)
  }

  override fun onBindViewHolder(holder: RowTwitterVH, position: Int) {
    val twitterRowModel = TwitterRowModel()
    // TODO uncomment following line after integration with data source
    // val twitterRowModel = list[position]
    holder.binding.twitterRowModel = twitterRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TwitterRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: TwitterRowModel
    ) {
    }
  }

  inner class RowTwitterVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTwitterBinding = RowTwitterBinding.bind(itemView)
  }
}
