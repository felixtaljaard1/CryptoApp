package com.plcoding.cryptocurrencyappyt.data.remote.dto


import com.google.gson.annotations.SerializedName

data class LinksModel(
    @SerializedName("explorer")
    val explorer: List<String> = listOf(),
    @SerializedName("facebook")
    val facebook: List<String> = listOf(),
    @SerializedName("reddit")
    val reddit: List<String> = listOf(),
    @SerializedName("source_code")
    val sourceCode: List<String> = listOf(),
    @SerializedName("website")
    val website: List<String> = listOf(),
    @SerializedName("youtube")
    val youtube: List<String> = listOf()
)