package com.busrayalcin.a24tvcloneapp.data.entity.details

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DetailsData(
    @SerializedName("footerAd") val footerAd: FooterAd,
    @SerializedName("headerAd") val headerAd: HeaderAd,
    @SerializedName("itemList") val itemList: List<DetailsItem>,
    @SerializedName("multimedia") val multimedia: Multimedia,
    @SerializedName("newsDetail") val newsDetail: NewsDetail,
    @SerializedName("photoGallery") val photoGallery: PhotoGallery,
    @SerializedName("relatedNews") val relatedNews: RelatedNews,
    @SerializedName("video") val video: Video
) : Serializable {

}