package com.soulanjo.app.modules.discover.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soulanjo.app.R
import com.soulanjo.app.databinding.RowProfilesBinding
import com.soulanjo.app.modules.discover.`data`.model.ProfilesRowModel
import kotlin.Int
import kotlin.collections.List

class ProfilesAdapter(
  var list: List<ProfilesRowModel>
) : RecyclerView.Adapter<ProfilesAdapter.RowProfilesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProfilesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_profiles,parent,false)
    return RowProfilesVH(view)
  }

  override fun onBindViewHolder(holder: RowProfilesVH, position: Int) {
    val profilesRowModel = ProfilesRowModel()
    // TODO uncomment following line after integration with data source
    // val profilesRowModel = list[position]
    holder.binding.profilesRowModel = profilesRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProfilesRowModel>) {
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
      item: ProfilesRowModel
    ) {
    }
  }

  inner class RowProfilesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowProfilesBinding = RowProfilesBinding.bind(itemView)
  }
}
