package com.soulanjo.app.modules.notifications.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.soulanjo.app.R
import com.soulanjo.app.appcomponents.base.BaseFragment
import com.soulanjo.app.databinding.FragmentNotificationsBinding
import com.soulanjo.app.modules.notifications.`data`.model.NotificationsRowModel
import com.soulanjo.app.modules.notifications.`data`.viewmodel.NotificationsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsFragment :
    BaseFragment<FragmentNotificationsBinding>(R.layout.fragment_notifications) {
  private val viewModel: NotificationsVM by viewModels<NotificationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val notificationsAdapter =
    NotificationsAdapter(viewModel.notificationsList.value?:mutableListOf())
    binding.recyclerNotifications.adapter = notificationsAdapter
    notificationsAdapter.setOnItemClickListener(
    object : NotificationsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NotificationsRowModel) {
        onClickRecyclerNotifications(view, position, item)
      }
    }
    )
    viewModel.notificationsList.observe(requireActivity()) {
      notificationsAdapter.updateData(it)
    }
    binding.notificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowBack.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerNotifications(
    view: View,
    position: Int,
    item: NotificationsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_FRAGMENT"


    fun getInstance(bundle: Bundle?): NotificationsFragment {
      val fragment = NotificationsFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
