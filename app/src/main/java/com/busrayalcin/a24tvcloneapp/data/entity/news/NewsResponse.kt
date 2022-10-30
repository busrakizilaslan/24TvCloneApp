package com.busrayalcin.a24tvcloneapp.data.entity.news

import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("data") val newsData: List<NewsData>,
    @SerializedName("errorCode") val errorCode: Int, // 0
    @SerializedName("errorMessage") val errorMessage: Any? // null
)