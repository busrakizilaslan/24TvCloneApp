package com.busrayalcin.a24tvcloneapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.busrayalcin.a24tvcloneapp.data.entity.details.DetailsData
import com.busrayalcin.a24tvcloneapp.data.entity.news.NewsItem
import com.busrayalcin.a24tvcloneapp.data.repo.NewsRepo
import com.busrayalcin.a24tvcloneapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class DetailFragmentViewModel @Inject constructor(var nrepo : NewsRepo) : ViewModel() {
    var detailsData : MutableLiveData<DetailsData> = MutableLiveData()

    init {
        getDetails()
        detailsData = nrepo.detailsToViewModel()
    }

    fun getDetails() = liveData(Dispatchers.IO) {
        emit(Resource.loading(null))
        try {
            emit(Resource.success(data = nrepo.getDetails()))
        } catch (exception: Exception) {
            emit(Resource.error(exception.message ?: "Error !!!", data = null))
        }
    }
}