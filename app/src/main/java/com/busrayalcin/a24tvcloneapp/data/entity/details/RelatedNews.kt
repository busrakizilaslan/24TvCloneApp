package com.busrayalcin.a24tvcloneapp.data.entity.details

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class RelatedNews(
     @SerializedName("category") val category: CategoryX,
     @SerializedName("hasPhotoGallery") val hasPhotoGallery: Boolean,
     @SerializedName("hasVideo") val hasVideo: Boolean,
     @SerializedName("imageUrl") val imageUrl: String,
     @SerializedName("itemId") val itemId: String,
     @SerializedName("itemType") val itemType: String,
     @SerializedName("publishDate") val publishDate: String,
     @SerializedName("shortText") val shortText: String,
     @SerializedName("title") val title: String,
     @SerializedName("titleVisible") val titleVisible: Boolean
) : Serializable {

}