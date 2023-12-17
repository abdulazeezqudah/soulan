package com.soulanjo.app.modules.dailynew.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowFortyBinding
import com.soulanjo.app.modules.dailynew.`data`.model.FortyRowModel
import kotlin.Int
import kotlin.collections.List

class FortyAdapter(
  var list: List<FortyRowModel>
) : RecyclerView.Adapter<FortyAdapter.RowFortyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFortyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_forty,parent,false)
    return RowFortyVH(view)
  }

  override fun onBindViewHolder(holder: RowFortyVH, position: Int) {
    val fortyRowModel = FortyRowModel()
    // TODO uncomment following line after integration with data source
    // val fortyRowModel = list[position]
    holder.binding.fortyRowModel = fortyRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FortyRowModel>) {
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
      item: FortyRowModel
    ) {
    }
  }

  inner class RowFortyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFortyBinding = RowFortyBinding.bind(itemView)
  }
}
