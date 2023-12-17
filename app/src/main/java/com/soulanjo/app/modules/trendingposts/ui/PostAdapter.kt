package com.soulanjo.app.modules.trendingposts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowPostBinding
import com.soulanjo.app.modules.trendingposts.`data`.model.PostRowModel
import kotlin.Int
import kotlin.collections.List

class PostAdapter(
  var list: List<PostRowModel>
) : RecyclerView.Adapter<PostAdapter.RowPostVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPostVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_post,parent,false)
    return RowPostVH(view)
  }

  override fun onBindViewHolder(holder: RowPostVH, position: Int) {
    val postRowModel = PostRowModel()
    // TODO uncomment following line after integration with data source
    // val postRowModel = list[position]
    holder.binding.postRowModel = postRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PostRowModel>) {
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
      item: PostRowModel
    ) {
    }
  }

  inner class RowPostVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPostBinding = RowPostBinding.bind(itemView)
  }
}
