package com.busrayalcin.a24tvcloneapp.utils

import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.showUrlImage(pictureUrl : String) {
    Picasso.get().load(pictureUrl).into(this)
}