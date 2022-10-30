package com.busrayalcin.a24tvcloneapp.ui.view

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.busrayalcin.a24tvcloneapp.databinding.FragmentHomeBinding
import com.busrayalcin.a24tvcloneapp.ui.adapter.NewsAdapter
import com.busrayalcin.a24tvcloneapp.ui.viewmodel.HomeFragmentViewModel
import com.busrayalcin.a24tvcloneapp.utils.Status
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    private lateinit var viewModel: HomeFragmentViewModel
    private lateinit var videoView: VideoView
    private lateinit var mediaController : MediaController
    var videoUrl = "https://turkmedya-live.ercdn.net/tv24/tv24.m3u8"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: HomeFragmentViewModel by viewModels()
        viewModel = tempViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        showVideo()

        viewModel.newsList.observe(viewLifecycleOwner){
            val adapter = NewsAdapter(requireContext(), it,viewModel)
            binding.newsAdapter = adapter
        }

        viewModel.getAllNews().observe(viewLifecycleOwner){
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


    @SuppressLint("ClickableViewAccessibility")
    private fun showVideo() {
        val uri: Uri = Uri.parse(videoUrl)
        videoView = binding.videoView as VideoView
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        //mediaController = MediaController(activity)
        videoView.setOnPreparedListener {
            //mediaController.setAnchorView(videoView)
            //videoView.requestFocus()
            //videoView.start()
            //mediaController.show()
        }
        //mediaController.setMediaPlayer(videoView)
        //videoView.setMediaController(mediaController)
        videoView.start()

        videoView.setOnTouchListener(OnTouchListener { v, event ->
            if (videoView.isPlaying === false) {
                videoView.start()
            } else if (videoView.isPlaying === true) {
                videoView.pause()
            }
            Log.e("TAP", "from video ")
            false
        })
    }
}