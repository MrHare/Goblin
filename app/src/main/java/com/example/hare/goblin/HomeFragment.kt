package com.example.hare.goblin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.hare.goblin.databinding.FragmentHomeBinding
import com.example.hare.goblin.viewmodels.BillListViewModel

class HomeFragment : Fragment() {

    private lateinit var adapter: BillAdapter
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.fab.setOnClickListener{ view ->
            Navigation.findNavController(view!!).navigate(R.id.action_homeFragment_to_billAddFragment)
        }

        setupAdapter()
        return binding.root
    }

    private fun setupAdapter() {
        adapter = BillAdapter()
        binding.recyclerView.adapter = adapter

        val viewModel = ViewModelProviders.of(this).get(BillListViewModel::class.java)

        viewModel.bills.observe(viewLifecycleOwner, Observer { bills ->
            adapter.submitList(bills)
        })
    }
}
