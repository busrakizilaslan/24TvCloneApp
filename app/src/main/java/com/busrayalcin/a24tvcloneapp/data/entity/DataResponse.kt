package com.busrayalcin.a24tvcloneapp.data.entity

import com.google.gson.annotations.SerializedName

data class DataResponse(
    @SerializedName("data") val newsData: List<Data>,
    @SerializedName("errorCode") val errorCode: Int, // 0
    @SerializedName("errorMessage") val errorMessage: Any? // null
)