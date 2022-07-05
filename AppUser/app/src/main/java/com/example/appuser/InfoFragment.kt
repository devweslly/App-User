package com.example.appuser

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appuser.adapter.ProdutoAdapter
import com.example.appuser.databinding.FragmentInfoBinding
import com.example.appuser.model.Produto

class InfoFragment : Fragment() {

    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment - Inflater object
        binding = FragmentInfoBinding.inflate(layoutInflater, container, false)

        // listProduto guarda uma Listagem de produtos por meio do listOf
        val listProduto = listOf(
            // Objetos do tipo Produto
            Produto(
                titulo = "Comércio 1",
                descricao = "É um comércio de categoria",
                descricaoDetalhada = "É um comércio de categoria",
                endereco = "rua 1, 00 - Bairro X",
                avaliacao = "4 estrelas"
            ),
            Produto(
                titulo = "Comércio 2",
                descricao = "É um comércio de categoria",
                descricaoDetalhada = "É um comércio de categoria",
                endereco = "rua 2, 02 - Bairro P",
                avaliacao = "4 estrelas"
            ),
            Produto(
                titulo = "Comércio 3",
                descricao = "É um comércio de categoria",
                descricaoDetalhada = "É um comércio de categoria",
                endereco = "rua 3, 03 - Bairro T",
                avaliacao = "4 estrelas"
            ),
            Produto(
                titulo = "Comércio 4",
                descricao = "É um comércio de categoria",
                descricaoDetalhada = "É um comércio de categoria",
                endereco = "rua 4, 04 - Bairro O",
                avaliacao = "4 estrelas"
            ),
        )

        //Configurando o RecyclerView
        val adapter = ProdutoAdapter()

        binding.recyclerProduto.layoutManager = LinearLayoutManager(context)
        binding.recyclerProduto.adapter = adapter
        binding.recyclerProduto.setHasFixedSize(true)

        adapter.setList(listProduto)

        /*
        // Ação de click para o CardInfoProd do CardView1
        binding.CardInfoProdInfFragment.setOnClickListener {
            //Achando o Nav Controller e navegando para o próximo Fragment
            findNavController().navigate(R.id.action_infoFragment_to_infoProdFragment)
        }
        */

        return binding.root
    }
}