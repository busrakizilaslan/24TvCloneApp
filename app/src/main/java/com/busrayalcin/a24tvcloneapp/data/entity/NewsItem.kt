package com.busrayalcin.a24tvcloneapp.data.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class NewsItem(
     @SerializedName("category") val category: NewsCategory,
     @SerializedName("columnistName") val columnistName: String, // "
     @SerializedName("externalUrl") val externalUrl: String, // "
     @SerializedName("fLike") val fLike: String,
     @SerializedName("fullPath") val fullPath: String?, // https://www.aksam.com.tr/guncel/27-mayista-darbe-icin-ozel-hutbe-okutmuslar/haber-975486
     @SerializedName("hasPhotoGallery") val hasPhotoGallery: Boolean, // false
     @SerializedName("hasVideo") val hasVideo: Boolean, // false
     @SerializedName("imageUrl") val imageUrl: String, // https://img3.aksam.com.tr/imgsdisk/2022/10/21/terorle-mucadele-ele-alin-825.jpg
     @SerializedName("itemId") val itemId: String, // 975486
     @SerializedName("itemType") val itemType: String, // NEWS
     @SerializedName("publishDate") val publishDate: String, // 27.05.2019 11:35:00
     @SerializedName("shortText") val shortText: String, // 27 Mayısçıların pulla, sigarayla, plakla meşrulaştırmaya çalıştığı darbeyi, müftülüklerden “darbenin faziletlerinin” halka âyet ve hadislerle anlatılmasını isteyerek dini nasıl istismar ettikleri ortaya çıktı.
     @SerializedName("title") val title: String, // 27 Mayısçılar darbe için özel hutbe okutmuşlar
     @SerializedName("titleVisible") val titleVisible: Boolean, // false
     @SerializedName("videoUrl") val videoUrl: String // "
) : Serializable{

}