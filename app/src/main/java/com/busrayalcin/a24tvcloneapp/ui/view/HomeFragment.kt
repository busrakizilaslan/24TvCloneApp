package com.busrayalcin.a24tvcloneapp.ui.view

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.busrayalcin.a24tvcloneapp.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    private lateinit var videoView: VideoView

    var videoUrl = "https://turkmedya-live.ercdn.net/tv24/tv24.m3u8"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        val uri: Uri = Uri.parse(videoUrl)
        videoView = binding.videoView as VideoView
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        val mediaController = MediaController(activity)
        videoView.setOnPreparedListener {
            mediaController.setAnchorView(videoView)
            videoView.start()
            mediaController.show()

        }
        mediaController.setMediaPlayer(videoView)



        videoView.setMediaController(mediaController)
        videoView.start()






        return binding.root
    }

}