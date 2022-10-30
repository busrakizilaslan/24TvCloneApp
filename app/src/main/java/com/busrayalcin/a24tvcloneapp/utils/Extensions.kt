package com.busrayalcin.a24tvcloneapp.utils

import android.view.View
import android.widget.ImageView
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.busrayalcin.a24tvcloneapp.R
import com.squareup.picasso.Picasso

fun Navigation.doNavigate(v : View, id : NavDirections){
    findNavController(v).navigate(id)
}

fun ImageView.showUrlImage(pictureUrl : String) {
    Picasso.get().load(pictureUrl).placeholder(R.drawable.tv24).into(this)
}