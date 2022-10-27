package com.busrayalcin.a24tvcloneapp.data.entity

data class İtem(
    val category: Category,
    val columnistName: String, // "
    val externalUrl: String, // "
    val fLike: String,
    val fullPath: String?, // https://www.aksam.com.tr/guncel/27-mayista-darbe-icin-ozel-hutbe-okutmuslar/haber-975486
    val hasPhotoGallery: Boolean, // false
    val hasVideo: Boolean, // false
    val imageUrl: String, // https://img3.aksam.com.tr/imgsdisk/2022/10/21/terorle-mucadele-ele-alin-825.jpg
    val itemId: String, // 975486
    val itemType: String, // NEWS
    val publishDate: String, // 27.05.2019 11:35:00
    val shortText: String, // 27 Mayısçıların pulla, sigarayla, plakla meşrulaştırmaya çalıştığı darbeyi, müftülüklerden “darbenin faziletlerinin” halka âyet ve hadislerle anlatılmasını isteyerek dini nasıl istismar ettikleri ortaya çıktı.
    val title: String, // 27 Mayısçılar darbe için özel hutbe okutmuşlar
    val titleVisible: Boolean, // false
    val videoUrl: String // "
)