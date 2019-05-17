package com.example.hare.goblin.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hare.goblin.Bill

class BillViewModel(
   val bill : Bill
) : ViewModel()