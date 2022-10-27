package com.busrayalcin.a24tvcloneapp.data.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.busrayalcin.a24tvcloneapp.data.entity.Data
import com.busrayalcin.a24tvcloneapp.data.entity.DataResponse
import com.busrayalcin.a24tvcloneapp.retrofit.NewsDao
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class NewsRepo @Inject constructor(var ndao : NewsDao) {
    var newsList : MutableLiveData<List<Data>> = MutableLiveData()


    fun getAllNews(){
        Log.e("getAllNews", "has been called.")
        ndao.getAllNews().enqueue(object : Callback<DataResponse> {
            override fun onResponse(call: Call<DataResponse>?, response: Response<DataResponse>) {
                Log.e("getAllNews", "onResponse")
                val list = response.body()!!.newsData
                newsList.value = list
            }
            override fun onFailure(call: Call<DataResponse>?, t: Throwable?) {
                Log.e("getAllNews", "onFailure")
                println("$t.localizedMessage")
            }
        })

    }
}