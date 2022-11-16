package com.plcoding.cryptocurrencyappyt.data.remote.dto


import com.google.gson.annotations.SerializedName

data class TagModel(
    @SerializedName("coin_counter")
    val coinCounter: Int = 0,
    @SerializedName("ico_counter")
    val icoCounter: Int = 0,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("name")
    val name: String = ""
)