package com.soulanjo.app.modules.trending.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowTrendingpostsBinding
import com.soulanjo.app.modules.trending.`data`.model.TrendingpostsRowModel
import kotlin.Int
import kotlin.collections.List

class TrendingPostsAdapter(
  var list: List<TrendingpostsRowModel>
) : RecyclerView.Adapter<TrendingPostsAdapter.RowTrendingpostsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTrendingpostsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_trendingposts,parent,false)
    return RowTrendingpostsVH(view)
  }

  override fun onBindViewHolder(holder: RowTrendingpostsVH, position: Int) {
    val trendingpostsRowModel = TrendingpostsRowModel()
    // TODO uncomment following line after integration with data source
    // val trendingpostsRowModel = list[position]
    holder.binding.trendingpostsRowModel = trendingpostsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TrendingpostsRowModel>) {
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
      item: TrendingpostsRowModel
    ) {
    }
  }

  inner class RowTrendingpostsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTrendingpostsBinding = RowTrendingpostsBinding.bind(itemView)
  }
}
