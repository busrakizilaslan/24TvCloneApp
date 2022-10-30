package com.busrayalcin.a24tvcloneapp.data.entity.details

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class NewsDetail(
    @SerializedName("bodyText") val bodyText: String,
    @SerializedName("category") val category: Category,
    @SerializedName("fullPath") val fullPath: String,
    @SerializedName("hasPhotoGallery") val hasPhotoGallery: Boolean,
    @SerializedName("hasVideo") val hasVideo: Boolean,
    @SerializedName("imageUrl") val imageUrl: String,
    @SerializedName("itemId") val itemId: String,
    @SerializedName("itemType") val itemType: String,
    @SerializedName("publishDate") val publishDate: String,
    @SerializedName("resource") val resource: String,
    @SerializedName("shortText") val shortText: String,
    @SerializedName("title") val title: String,
    @SerializedName("video") val video: String
) : Serializable {

}