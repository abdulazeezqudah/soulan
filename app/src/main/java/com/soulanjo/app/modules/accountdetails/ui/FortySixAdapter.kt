package com.soulanjo.app.modules.accountdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowFortysixBinding
import com.soulanjo.app.modules.accountdetails.`data`.model.FortysixRowModel
import kotlin.Int
import kotlin.collections.List

class FortySixAdapter(
  var list: List<FortysixRowModel>
) : RecyclerView.Adapter<FortySixAdapter.RowFortysixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFortysixVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_fortysix,parent,false)
    return RowFortysixVH(view)
  }

  override fun onBindViewHolder(holder: RowFortysixVH, position: Int) {
    val fortysixRowModel = FortysixRowModel()
    // TODO uncomment following line after integration with data source
    // val fortysixRowModel = list[position]
    holder.binding.fortysixRowModel = fortysixRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FortysixRowModel>) {
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
      item: FortysixRowModel
    ) {
    }
  }

  inner class RowFortysixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFortysixBinding = RowFortysixBinding.bind(itemView)
  }
}
