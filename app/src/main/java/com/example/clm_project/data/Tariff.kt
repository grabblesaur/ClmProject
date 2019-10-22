package com.example.clm_project.data

data class Tariff (
    val currency: Currency,
    val commission: Float
)

enum class Currency(val value: String) {
    RUB("RUB"),
    USD("USD"),
    EUR("EUR")
}
