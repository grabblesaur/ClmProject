package com.example.clm_project.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.clm_project.R
import com.example.clm_project.data.Currency
import com.example.clm_project.data.Tariff
import kotlinx.android.synthetic.main.tariff_item.view.*

abstract class BaseTariffViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    abstract fun bind(tariff: Tariff)

    fun formatCurrency(currency: Currency): String =
        view.context.getString(R.string.currency, currency.value)

    fun formatCommission(commission: Float): String =
        view.context.getString(R.string.commission, commission)
}

class TariffViewHolder(private val viewGroup: ViewGroup) : BaseTariffViewHolder(
    LayoutInflater.from(viewGroup.context)
        .inflate(R.layout.tariff_item, viewGroup, false)
) {

    override fun bind(tariff: Tariff) {
        itemView.currencyTextView.text = formatCurrency(tariff.currency)
        itemView.commissionTextView.text = formatCommission(tariff.commission)
    }
}