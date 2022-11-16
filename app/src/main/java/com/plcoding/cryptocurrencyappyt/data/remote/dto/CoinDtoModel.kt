package com.plcoding.cryptocurrencyappyt.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.plcoding.cryptocurrencyappyt.domain.model.Coin

data class CoinDtoModel(
    @SerializedName("id")
    val id: String = "",
    @SerializedName("is_active")
    val isActive: Boolean = false,
    @SerializedName("is_new")
    val isNew: Boolean = false,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("rank")
    val rank: Int = 0,
    @SerializedName("symbol")
    val symbol: String = "",
    @SerializedName("type")
    val type: String = ""
)
