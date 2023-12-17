package com.soulanjo.app.modules.dailynew.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowProfiles1Binding
import com.soulanjo.app.modules.dailynew.`data`.model.Profiles1RowModel
import kotlin.Int
import kotlin.collections.List

class ProfilesAdapter(
  var list: List<Profiles1RowModel>
) : RecyclerView.Adapter<ProfilesAdapter.RowProfiles1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfiles1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profiles1,parent,false)
    return RowProfiles1VH(view)
  }

  override fun onBindViewHolder(holder: RowProfiles1VH, position: Int) {
    val profiles1RowModel = Profiles1RowModel()
    // TODO uncomment following line after integration with data source
    // val profiles1RowModel = list[position]
    holder.binding.profiles1RowModel = profiles1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Profiles1RowModel>) {
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
      item: Profiles1RowModel
    ) {
    }
  }

  inner class RowProfiles1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowProfiles1Binding = RowProfiles1Binding.bind(itemView)
  }
}
