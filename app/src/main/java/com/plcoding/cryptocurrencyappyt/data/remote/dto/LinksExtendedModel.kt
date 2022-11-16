package com.plcoding.cryptocurrencyappyt.data.remote.dto


import com.google.gson.annotations.SerializedName

data class LinksExtendedModel(
    @SerializedName("stats")
    val stats: StatsModel = StatsModel(),
    @SerializedName("type")
    val type: String = "",
    @SerializedName("url")
    val url: String = ""
)