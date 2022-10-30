package com.busrayalcin.a24tvcloneapp.data.entity.details

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Multimedia(
    @SerializedName("itemCountInRow") val itemCountInRow: Int,
    @SerializedName("lazyLoadingEnabled") val lazyLoadingEnabled: Boolean,
    @SerializedName("repeatType") val repeatType: String,
    @SerializedName("sectionBgColor") val sectionBgColor: Any,
    @SerializedName("sectionType") val sectionType: String,
    @SerializedName("title") val title: Any,
    @SerializedName("titleBgColor") val titleBgColor: Any,
    @SerializedName("titleColor") val titleColor: Any,
    @SerializedName("titleVisible") val titleVisible: Boolean
) : Serializable {

}