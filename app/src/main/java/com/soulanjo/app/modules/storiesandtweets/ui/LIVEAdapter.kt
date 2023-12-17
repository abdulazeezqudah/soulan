package com.soulanjo.app.modules.storiesandtweets.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowLiveBinding
import com.soulanjo.app.modules.storiesandtweets.`data`.model.LiveRowModel
import kotlin.Int
import kotlin.collections.List

class LIVEAdapter(
  var list: List<LiveRowModel>
) : RecyclerView.Adapter<LIVEAdapter.RowLiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_live,parent,false)
    return RowLiveVH(view)
  }

  override fun onBindViewHolder(holder: RowLiveVH, position: Int) {
    val liveRowModel = LiveRowModel()
    // TODO uncomment following line after integration with data source
    // val liveRowModel = list[position]
    holder.binding.liveRowModel = liveRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LiveRowModel>) {
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
      item: LiveRowModel
    ) {
    }
  }

  inner class RowLiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLiveBinding = RowLiveBinding.bind(itemView)
  }
}
