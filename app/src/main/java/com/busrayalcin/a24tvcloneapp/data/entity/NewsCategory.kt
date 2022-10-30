package com.busrayalcin.a24tvcloneapp.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class NewsCategory(
     @SerializedName("categoryId") val categoryId: String, // 7
     @SerializedName("slug") val slug: String, // guncel
     @SerializedName("title") val title: String // GÜNCEL
) :Serializable{

}