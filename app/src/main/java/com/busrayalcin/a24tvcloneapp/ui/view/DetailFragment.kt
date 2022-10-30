package com.busrayalcin.a24tvcloneapp.ui.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.busrayalcin.a24tvcloneapp.data.entity.news.NewsItem
import com.busrayalcin.a24tvcloneapp.databinding.FragmentDetailBinding
import com.busrayalcin.a24tvcloneapp.ui.viewmodel.DetailFragmentViewModel
import com.busrayalcin.a24tvcloneapp.utils.Status
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

        viewModel.detailsData.observe(viewLifecycleOwner){
//            binding.tvTitle.text = it.newsDetail.title
            Log.d("title:",it.newsDetail.title)
        }

        viewModel.getDetails().observe(viewLifecycleOwner){
            when (it.status) {
                Status.SUCCESS -> {
                    Log.e("STATUS", "SUCCESS")
                }
                Status.ERROR -> {
                    Log.e("STATUS", "ERROR")
                }
                Status.LOADING -> {
                    Log.e("STATUS", "LOADING")
                }
            }
        }


        return binding.root
    }

}