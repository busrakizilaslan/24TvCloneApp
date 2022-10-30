package com.busrayalcin.a24tvcloneapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.busrayalcin.a24tvcloneapp.R
import com.busrayalcin.a24tvcloneapp.data.entity.NewsItem
import com.busrayalcin.a24tvcloneapp.databinding.FragmentDetailBinding
import com.busrayalcin.a24tvcloneapp.ui.viewmodel.DetailFragmentViewModel
import com.busrayalcin.a24tvcloneapp.ui.viewmodel.HomeFragmentViewModel
import com.busrayalcin.a24tvcloneapp.utils.showUrlImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : Fragment() {
    private lateinit var binding : FragmentDetailBinding
    private lateinit var viewModel : DetailFragmentViewModel
    private lateinit var takenNews : NewsItem


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: DetailFragmentViewModel by viewModels()
        viewModel = tempViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater,container,false)

        val bundle : DetailFragmentArgs by navArgs()
        takenNews = bundle.news
        binding.ivImage.showUrlImage(takenNews.imageUrl)
        println(takenNews)
        

        return binding.root
    }

}