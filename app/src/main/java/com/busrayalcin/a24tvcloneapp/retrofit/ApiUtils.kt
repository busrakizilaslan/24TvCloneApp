package com.busrayalcin.a24tvcloneapp.retrofit

class ApiUtils {
    companion object{
        val BASE_URL = " https://turkmedya.com.tr/"
        fun getNewsDao() : NewsDao{
            return RetrofitClient
                .getClient(BASE_URL)
                .create(NewsDao::class.java)
        }
    }
}