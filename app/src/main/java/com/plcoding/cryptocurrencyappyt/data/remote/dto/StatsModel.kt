package com.plcoding.cryptocurrencyappyt.data.remote.dto


import com.google.gson.annotations.SerializedName

data class StatsModel(
    @SerializedName("contributors")
    val contributors: Int = 0,
    @SerializedName("followers")
    val followers: Int = 0,
    @SerializedName("stars")
    val stars: Int = 0,
    @SerializedName("subscribers")
    val subscribers: Int = 0
)