package com.busrayalcin.a24tvcloneapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.busrayalcin.a24tvcloneapp.data.repo.NewsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailFragmentViewModel @Inject constructor(var nrepo : NewsRepo) : ViewModel() {
}