package com.soulanjo.app.modules.messages.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowRichardalvesBinding
import com.soulanjo.app.modules.messages.`data`.model.RichardalvesRowModel
import kotlin.Int
import kotlin.collections.List

class RichardAlvesAdapter(
  var list: List<RichardalvesRowModel>
) : RecyclerView.Adapter<RichardAlvesAdapter.RowRichardalvesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRichardalvesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_richardalves,parent,false)
    return RowRichardalvesVH(view)
  }

  override fun onBindViewHolder(holder: RowRichardalvesVH, position: Int) {
    val richardalvesRowModel = RichardalvesRowModel()
    // TODO uncomment following line after integration with data source
    // val richardalvesRowModel = list[position]
    holder.binding.richardalvesRowModel = richardalvesRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<RichardalvesRowModel>) {
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
      item: RichardalvesRowModel
    ) {
    }
  }

  inner class RowRichardalvesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRichardalvesBinding = RowRichardalvesBinding.bind(itemView)
  }
}
