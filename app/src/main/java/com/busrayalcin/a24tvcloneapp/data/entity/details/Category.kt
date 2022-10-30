package com.busrayalcin.a24tvcloneapp.data.entity.details

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Category(
    @SerializedName("categoryId") val categoryId: String,
    @SerializedName("color") val color: String,
    @SerializedName("slug") val slug: String,
    @SerializedName("title") val title: String
) : Serializable {

}