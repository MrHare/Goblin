package com.example.hare.goblin


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hare.goblin.databinding.FragmentBillAddBinding

class BillAddFragment : Fragment() {

    private lateinit var binding: FragmentBillAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBillAddBinding.inflate(inflater, container, false)
        return binding.root
    }
}
