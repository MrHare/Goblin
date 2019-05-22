package com.example.hare.goblin.viewmodels

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hare.goblin.Bill

class HomeFragmentViewModel : ViewModel() {

    val bills = MutableLiveData<List<Bill>>()

    init {
        val billList = ArrayList<Bill>()
        bills.postValue(ArrayList<Bill>().apply {
            add(Bill(1, 100.00F, "test1"))
            add(Bill(2, 200.00F, "test2"))
            add(Bill(3, 300.00F, "test3"))
            add(Bill(1, 100.00F, "test1"))
            add(Bill(2, 200.00F, "test2"))
            add(Bill(3, 300.00F, "test3"))
            add(Bill(1, 100.00F, "test1"))
            add(Bill(2, 200.00F, "test2"))
            add(Bill(3, 300.00F, "test3"))
            add(Bill(1, 100.00F, "test1"))
            add(Bill(2, 200.00F, "test2"))
            add(Bill(3, 300.00F, "test3"))
            add(Bill(1, 100.00F, "test1"))
            add(Bill(2, 200.00F, "test2"))
            add(Bill(3, 300.00F, "test3"))
            add(Bill(1, 100.00F, "test1"))
            add(Bill(2, 200.00F, "test2"))
            add(Bill(3, 300.00F, "test3"))
        })
    }
}
