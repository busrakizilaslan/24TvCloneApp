package com.busrayalcin.a24tvcloneapp.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Data(
    @SerializedName("itemCountInRow") val itemCountInRow: Int, // 1
    @SerializedName("itemList") val itemList: List<Item>,
    @SerializedName("lazyLoadingEnabled") val lazyLoadingEnabled: Boolean, // false
    @SerializedName("repeatType") val repeatType: String, // NO_REPEAT
    @SerializedName("sectionBgColor") val sectionBgColor: String, // #e7e7e7
    @SerializedName("sectionType") val sectionType: String, // SWIPE
    @SerializedName("title") val title: String?, // OFFSET
    @SerializedName("titleBgColor") val titleBgColor: String, // #e7e7e7
    @SerializedName("titleColor") val titleColor: Any?, // null
    @SerializedName("titleVisible") val titleVisible: Boolean, // false
    @SerializedName("totalRecords") val totalRecords: Int? // 0
) : Serializable{

}