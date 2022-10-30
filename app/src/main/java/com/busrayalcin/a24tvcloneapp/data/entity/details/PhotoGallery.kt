package com.busrayalcin.a24tvcloneapp.data.entity.details

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PhotoGallery(
    @SerializedName("imageUrl") val imageUrl: String,
    @SerializedName("itemId") val itemId: String,
    @SerializedName("itemList") val itemList: Any,
    @SerializedName("itemType") val itemType: String,
    @SerializedName("title") val title: String,
    @SerializedName("titleVisible") val titleVisible: Boolean
) : Serializable {

}