package com.soulanjo.app.modules.trendingtabcontainer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowStoriesBinding
import com.soulanjo.app.modules.trendingtabcontainer.`data`.model.StoriesRowModel
import kotlin.Int
import kotlin.collections.List

class StoriesAdapter(
  var list: List<StoriesRowModel>
) : RecyclerView.Adapter<StoriesAdapter.RowStoriesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowStoriesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_stories,parent,false)
    return RowStoriesVH(view)
  }

  override fun onBindViewHolder(holder: RowStoriesVH, position: Int) {
    val storiesRowModel = StoriesRowModel()
    // TODO uncomment following line after integration with data source
    // val storiesRowModel = list[position]
    holder.binding.storiesRowModel = storiesRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<StoriesRowModel>) {
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
      item: StoriesRowModel
    ) {
    }
  }

  inner class RowStoriesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowStoriesBinding = RowStoriesBinding.bind(itemView)
  }
}
