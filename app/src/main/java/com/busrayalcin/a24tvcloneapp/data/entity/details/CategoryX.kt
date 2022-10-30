package com.busrayalcin.a24tvcloneapp.data.entity.details

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CategoryX(
    @SerializedName("categoryId") val categoryId: String,
    @SerializedName("slug") val slug: String,
    @SerializedName("title") val title: String
) : Serializable {

}