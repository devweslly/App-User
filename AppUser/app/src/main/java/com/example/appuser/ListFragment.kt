package com.example.appuser

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.appuser.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment - Inflater object
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        // Ação de click para o CardView1
        binding.cardView1.setOnClickListener {
            //Achando o Nav Controller e navegando para o próximo Fragment
            findNavController().navigate(R.id.action_listFragment_to_infoFragment)
        }

        return binding.root
    }
}