package com.soulanjo.app.modules.messages.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseFragment
import com.soulanjo.app.databinding.FragmentMessagesBinding
import com.soulanjo.app.modules.messages.`data`.model.RichardalvesRowModel
import com.soulanjo.app.modules.messages.`data`.model.Stories1RowModel
import com.soulanjo.app.modules.messages.`data`.viewmodel.MessagesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MessagesFragment : BaseFragment<FragmentMessagesBinding>(R.layout.fragment_messages) {
  private val viewModel: MessagesVM by viewModels<MessagesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val storiesAdapter = StoriesAdapter(viewModel.storiesList.value?:mutableListOf())
    binding.recyclerStories.adapter = storiesAdapter
    storiesAdapter.setOnItemClickListener(
    object : StoriesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Stories1RowModel) {
        onClickRecyclerStories(view, position, item)
      }
    }
    )
    viewModel.storiesList.observe(requireActivity()) {
      storiesAdapter.updateData(it)
    }
    val richardAlvesAdapter =
    RichardAlvesAdapter(viewModel.richardAlvesList.value?:mutableListOf())
    binding.recyclerRichardAlves.adapter = richardAlvesAdapter
    richardAlvesAdapter.setOnItemClickListener(
    object : RichardAlvesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RichardalvesRowModel) {
        onClickRecyclerRichardAlves(view, position, item)
      }
    }
    )
    viewModel.richardAlvesList.observe(requireActivity()) {
      richardAlvesAdapter.updateData(it)
    }
    binding.messagesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowBack.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerStories(
    view: View,
    position: Int,
    item: Stories1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerRichardAlves(
    view: View,
    position: Int,
    item: RichardalvesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MESSAGES_FRAGMENT"


    fun getInstance(bundle: Bundle?): MessagesFragment {
      val fragment = MessagesFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
