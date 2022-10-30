package com.busrayalcin.a24tvcloneapp.retrofit

import com.busrayalcin.a24tvcloneapp.data.entity.details.DetailsResponse
import com.busrayalcin.a24tvcloneapp.data.entity.news.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface NewsDao {
    //https://turkmedya.com.tr/anasayfa.json
    @GET("anasayfa.json")
    fun getAllNews() : Call<NewsResponse>

    //https://turkmedya.com.tr/detay.json
    @GET("detay.json")
    fun getDetails() : Call<DetailsResponse>
}
