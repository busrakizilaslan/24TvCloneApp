package com.busrayalcin.a24tvcloneapp.data.entity.details

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class HeaderAd(
     @SerializedName("adUnit") val adUnit: String,
     @SerializedName("itemHeight") val itemHeight: Int,
     @SerializedName("itemType") val itemType: String,
     @SerializedName("itemWidth") val itemWidth: Int
) : Serializable {

}