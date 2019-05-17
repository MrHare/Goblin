package com.example.hare.goblin.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hare.goblin.Bill

class BillListViewModel : ViewModel() {

    val bills = MutableLiveData<List<Bill>>()

    init {
        val billList = ArrayList<Bill>()
        bills.postValue(ArrayList<Bill>().apply {
            add(Bill(1, "test1"))
            add(Bill(2, "test2"))
            add(Bill(3, "test3"))
        })
    }
}
