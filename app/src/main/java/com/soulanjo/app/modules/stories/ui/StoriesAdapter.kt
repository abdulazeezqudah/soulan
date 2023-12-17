package com.soulanjo.app.modules.stories.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowStories2Binding
import com.soulanjo.app.modules.stories.`data`.model.Stories2RowModel
import kotlin.Int
import kotlin.collections.List

class StoriesAdapter(
  var list: List<Stories2RowModel>
) : RecyclerView.Adapter<StoriesAdapter.RowStories2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStories2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_stories2,parent,false)
    return RowStories2VH(view)
  }

  override fun onBindViewHolder(holder: RowStories2VH, position: Int) {
    val stories2RowModel = Stories2RowModel()
    // TODO uncomment following line after integration with data source
    // val stories2RowModel = list[position]
    holder.binding.stories2RowModel = stories2RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Stories2RowModel>) {
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
      item: Stories2RowModel
    ) {
    }
  }

  inner class RowStories2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStories2Binding = RowStories2Binding.bind(itemView)
  }
}
