package com.example.hare.goblin.viewmodels

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.hare.goblin.Bill
import com.example.hare.goblin.R

class BillViewModel(
    context: Context,
    var bill : Bill
) : ViewModel(){

    var icon = ObservableField<Drawable>(
        context.resources.getDrawable(getIconId())
    )

    var cost = ObservableField<String>(
        bill.cost.toString()
    )

    var info = ObservableField<String>(
        bill.info
    )

    private fun getIconId() : Int {
        when(bill.type) {
            1 -> return R.mipmap.ic_restaurant_round
            2 -> return R.mipmap.ic_shopping_round
            else -> return R.mipmap.ic_launcher
        }
    }
}