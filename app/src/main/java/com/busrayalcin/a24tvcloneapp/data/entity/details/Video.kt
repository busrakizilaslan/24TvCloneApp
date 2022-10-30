package com.busrayalcin.a24tvcloneapp.data.entity.details

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Video(
    @SerializedName("bodyText") val bodyText: String,
    @SerializedName("imageUrl") val imageUrl: String,
    @SerializedName("itemId") val itemId: String,
    @SerializedName("itemType") val itemType: String,
    @SerializedName("shortText") val shortText: String,
    @SerializedName("title") val title: String,
    @SerializedName("titleVisible") val titleVisible: Boolean,
    @SerializedName("videoUrl") val videoUrl: String
) : Serializable {

}