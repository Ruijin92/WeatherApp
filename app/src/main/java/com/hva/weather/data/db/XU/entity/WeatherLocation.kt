package com.hva.weather.data.db.XU.apixu.entity

import com.google.gson.annotations.SerializedName

data class WeatherLocation(
    val country: String,
    val lat: Double,
    val localtime: String,
    @SerializedName("localtime_epoch")
    val localtimeEpoch: Int,
    val lon: Double,
    val name: String,
    val region: String,
    @SerializedName("tz_id")
    val tzId: String
)