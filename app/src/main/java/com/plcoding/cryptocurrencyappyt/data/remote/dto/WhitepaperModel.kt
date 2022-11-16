package com.plcoding.cryptocurrencyappyt.data.remote.dto


import com.google.gson.annotations.SerializedName

data class WhitepaperModel(
    @SerializedName("link")
    val link: String = "",
    @SerializedName("thumbnail")
    val thumbnail: String = ""
)