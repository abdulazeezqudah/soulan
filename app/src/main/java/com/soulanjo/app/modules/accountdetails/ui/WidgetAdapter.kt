package com.soulanjo.app.modules.accountdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowWidgetBinding
import com.soulanjo.app.modules.accountdetails.`data`.model.WidgetRowModel
import kotlin.Int
import kotlin.collections.List

class WidgetAdapter(
  var list: List<WidgetRowModel>
) : RecyclerView.Adapter<WidgetAdapter.RowWidgetVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowWidgetVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_widget,parent,false)
    return RowWidgetVH(view)
  }

  override fun onBindViewHolder(holder: RowWidgetVH, position: Int) {
    val widgetRowModel = WidgetRowModel()
    // TODO uncomment following line after integration with data source
    // val widgetRowModel = list[position]
    holder.binding.widgetRowModel = widgetRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<WidgetRowModel>) {
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
      item: WidgetRowModel
    ) {
    }
  }

  inner class RowWidgetVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowWidgetBinding = RowWidgetBinding.bind(itemView)
  }
}
