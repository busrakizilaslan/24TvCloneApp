package com.busrayalcin.a24tvcloneapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.busrayalcin.a24tvcloneapp.data.entity.news.NewsItem
import com.busrayalcin.a24tvcloneapp.data.repo.NewsRepo
import com.busrayalcin.a24tvcloneapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class HomeFragmentViewModel @Inject constructor(var nrepo : NewsRepo) : ViewModel(){
    var newsList : MutableLiveData<List<NewsItem>> = MutableLiveData()

    init {
        getAllNews()
        newsList = nrepo.newsToViewModel()
    }

    fun getAllNews() = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        try {
            emit(Resource.success(data = nrepo.getAllNews()))
        } catch (exception: Exception) {
            emit(Resource.error(exception.message ?: "Error !!!", data = null))
        }
    }
}