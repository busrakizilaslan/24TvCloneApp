package com.busrayalcin.a24tvcloneapp.data.entity.details

import com.google.gson.annotations.SerializedName

data class DetailsResponse(
    @SerializedName("data") val detailsData: DetailsData,
    @SerializedName("errorCode") val errorCode: Int,
    @SerializedName("errorMessage") val errorMessage: Any
)