package com.example.hare.goblin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.hare.goblin.databinding.ItemBillBinding
import com.example.hare.goblin.viewmodels.BillViewModel

class BillAdapter : ListAdapter<Bill, BillAdapter.ViewHolder>(BillDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_bill,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position).let { bill ->
            with(holder) {
                itemView.tag = bill
                bind(bill)
            }
        }
    }

    class ViewHolder(
        private val binding : ItemBillBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(bill : Bill) {
            binding.let {
                it.itemModel = BillViewModel(bill)
                it.executePendingBindings()
            }
        }
    }
}