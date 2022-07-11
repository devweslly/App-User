package com.example.appuser.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appuser.databinding.CardLayoutBinding
import com.example.appuser.model.Produto

class ProdutoAdapter() : RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>() {

    private var listProduto = emptyList<Produto>()
    var onItemClick : ((Produto) -> Unit)? = null

    class ProdutoViewHolder(val binding: CardLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        return ProdutoViewHolder(
            binding = CardLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        val produto = listProduto[position]

        holder.binding.tituloProdutoCardView.text = produto.titulo
        holder.binding.descricaoProdutoCardView.text = produto.descricao
        holder.binding.enderecoProdutoCardView.text = produto.endereco

        // Ação de clique no item do RecyclerView
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(produto)
        }

    }

    override fun getItemCount(): Int {
        return listProduto.size
    }

    fun setList(list: List<Produto>){
        listProduto = list
        notifyDataSetChanged()
    }
}