package com.soulanjo.app.modules.storiesandtweets.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowFrame1Binding
import com.soulanjo.app.modules.storiesandtweets.`data`.model.Frame1RowModel
import kotlin.Int
import kotlin.collections.List

class FrameAdapter(
  var list: List<Frame1RowModel>
) : RecyclerView.Adapter<FrameAdapter.RowFrame1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFrame1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_frame1,parent,false)
    return RowFrame1VH(view)
  }

  override fun onBindViewHolder(holder: RowFrame1VH, position: Int) {
    val frame1RowModel = Frame1RowModel()
    // TODO uncomment following line after integration with data source
    // val frame1RowModel = list[position]
    holder.binding.frame1RowModel = frame1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Frame1RowModel>) {
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
      item: Frame1RowModel
    ) {
    }
  }

  inner class RowFrame1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFrame1Binding = RowFrame1Binding.bind(itemView)
    init {
      binding.btnFollow.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Frame1RowModel())
      }
    }
  }
}
