package com.example.clm_project.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.clm_project.data.Tariff

class TariffAdapter : RecyclerView.Adapter<BaseTariffViewHolder>() {

    private var items: List<Tariff> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseTariffViewHolder {
        return TariffViewHolder(parent)
    }

    override fun getItemCount(): Int =
        items.size

    override fun onBindViewHolder(holder: BaseTariffViewHolder, position: Int) {
        (holder as TariffViewHolder).bind(items[position])
    }

    fun setItems(tariffList: List<Tariff>) {
        items = tariffList
        notifyDataSetChanged()
    }
}