package com.busrayalcin.a24tvcloneapp.data.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.busrayalcin.a24tvcloneapp.data.entity.details.DetailsData
import com.busrayalcin.a24tvcloneapp.data.entity.details.DetailsItem
import com.busrayalcin.a24tvcloneapp.data.entity.details.DetailsResponse
import com.busrayalcin.a24tvcloneapp.data.entity.news.NewsResponse
import com.busrayalcin.a24tvcloneapp.data.entity.news.NewsItem
import com.busrayalcin.a24tvcloneapp.retrofit.NewsDao
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class NewsRepo @Inject constructor(var ndao : NewsDao) {
    var newsList : MutableLiveData<List<NewsItem>> = MutableLiveData()
    var detailsData : MutableLiveData<DetailsData> = MutableLiveData()

    fun newsToViewModel() : MutableLiveData<List<NewsItem>>{
        return newsList
    }

    fun detailsToViewModel() : MutableLiveData<DetailsData>{
        return detailsData
    }

    fun getAllNews(){
        Log.d("getAllNews", "has been called.")
        ndao.getAllNews().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>?, response: Response<NewsResponse>) {
                Log.d("getAllNews", "onResponse")
                val list = response.body()!!.newsData[0].itemList
                newsList.value = list
            }
            override fun onFailure(call: Call<NewsResponse>?, t: Throwable?) {
                Log.e("getAllNews", "onFailure")
                println("$t.localizedMessage")
            }
        })
    }

    fun getDetails(){
        Log.d("getDetails","has been called")
        ndao.getDetails().enqueue(object : Callback<DetailsResponse>{
            override fun onResponse(
                call: Call<DetailsResponse>,
                response: Response<DetailsResponse>
            ) {
                Log.d("getDetails", "onResponse")
                val dData = response.body()

                if (dData != null) {
                    Log.e("dData", dData.toString())
                }
                else Log.e("NULL", "onResponse Null")
//                detailsData.value = dData
            }

            override fun onFailure(call: Call<DetailsResponse>, t: Throwable) {
                Log.e("getDetails", "onFailure")
                println("$t.localizedMessage")
            }
        })
    }
}