package com.soulanjo.app.modules.pageview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowPageviewBinding
import com.soulanjo.app.modules.pageview.`data`.model.PageviewRowModel
import kotlin.Int
import kotlin.collections.List

class PageViewAdapter(
  var list: List<PageviewRowModel>
) : RecyclerView.Adapter<PageViewAdapter.RowPageviewVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPageviewVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pageview,parent,false)
    return RowPageviewVH(view)
  }

  override fun onBindViewHolder(holder: RowPageviewVH, position: Int) {
    val pageviewRowModel = PageviewRowModel()
    // TODO uncomment following line after integration with data source
    // val pageviewRowModel = list[position]
    holder.binding.pageviewRowModel = pageviewRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PageviewRowModel>) {
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
      item: PageviewRowModel
    ) {
    }
  }

  inner class RowPageviewVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPageviewBinding = RowPageviewBinding.bind(itemView)
  }
}
