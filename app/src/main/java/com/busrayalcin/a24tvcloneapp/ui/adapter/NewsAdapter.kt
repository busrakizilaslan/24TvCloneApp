package com.busrayalcin.a24tvcloneapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.busrayalcin.a24tvcloneapp.R
import com.busrayalcin.a24tvcloneapp.data.entity.news.NewsItem
import com.busrayalcin.a24tvcloneapp.databinding.NewsRowBinding
import com.busrayalcin.a24tvcloneapp.ui.view.HomeFragmentDirections
import com.busrayalcin.a24tvcloneapp.ui.viewmodel.HomeFragmentViewModel
import com.busrayalcin.a24tvcloneapp.utils.doNavigate
import com.busrayalcin.a24tvcloneapp.utils.showUrlImage

class NewsAdapter(var mContext : Context,
                  var newsList : List<NewsItem>,
                  var viewModel : HomeFragmentViewModel) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

                      inner class NewsViewHolder(binding: NewsRowBinding ) : RecyclerView.ViewHolder(binding.root){
                           var binding : NewsRowBinding
                           init {
                               this.binding = binding
                           }
                      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding : NewsRowBinding = DataBindingUtil.inflate(layoutInflater, R.layout.news_row,parent,false)
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val newsItem = newsList[position]
        val hb = holder.binding
        hb.newsObject = newsItem
        hb.ivNewsImage.showUrlImage(newsItem.imageUrl)
        hb.cvNews.setOnClickListener {
            Navigation.doNavigate(it,HomeFragmentDirections.actionHomeFragmentToDetailFragment(news = newsItem))
        }
    }

    override fun getItemCount(): Int {
        return newsList.size
    }
}