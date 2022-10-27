package com.busrayalcin.a24tvcloneapp.retrofit

import com.busrayalcin.a24tvcloneapp.data.entity.DataResponse
import retrofit2.Call
import retrofit2.http.GET

interface NewsDao {
//https://turkmedya.com.tr/anasayfa.json
    @GET("anasayfa.json")
    fun getAllNews() : Call<DataResponse>
}