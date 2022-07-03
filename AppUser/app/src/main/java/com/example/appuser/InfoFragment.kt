package com.example.appuser

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.appuser.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment - Inflater object
        binding = FragmentInfoBinding.inflate(layoutInflater, container, false)

        // Ação de click para o CardInfoProd do CardView1
        binding.CardInfoProdInfFragment.setOnClickListener {
            //Achando o Nav Controller e navegando para o próximo Fragment
            findNavController().navigate(R.id.action_infoFragment_to_listFragment)
        }

        return binding.root
    }
}