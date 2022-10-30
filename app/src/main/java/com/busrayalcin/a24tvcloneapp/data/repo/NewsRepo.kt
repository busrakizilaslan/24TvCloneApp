package com.busrayalcin.a24tvcloneapp.data.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.busrayalcin.a24tvcloneapp.data.entity.NewsResponse
import com.busrayalcin.a24tvcloneapp.data.entity.NewsItem
import com.busrayalcin.a24tvcloneapp.retrofit.NewsDao
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class NewsRepo @Inject constructor(var ndao : NewsDao) {
    var newsList : MutableLiveData<List<NewsItem>> = MutableLiveData()
    fun newsToViewModel() : MutableLiveData<List<NewsItem>>{
        return newsList
    }

    fun getAllNews(){
        Log.e("getAllNews", "has been called.")
        ndao.getAllNews().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>?, response: Response<NewsResponse>) {
                Log.e("getAllNews", "onResponse")
                val list = response.body()!!.newsData[0].itemList
                newsList.value = list
            }
            override fun onFailure(call: Call<NewsResponse>?, t: Throwable?) {
                Log.e("getAllNews", "onFailure")
                println("$t.localizedMessage")
            }
        })

    }
}