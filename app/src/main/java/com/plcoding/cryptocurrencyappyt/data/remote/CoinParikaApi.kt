package com.plcoding.cryptocurrencyappyt.data.remote

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDtoModel
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinParikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDtoModel
}