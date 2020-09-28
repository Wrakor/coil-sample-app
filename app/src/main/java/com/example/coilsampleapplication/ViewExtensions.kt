package com.example.coilsampleapplication

import android.net.Uri
import android.widget.ImageView
import coil.Coil
import coil.request.ImageRequest

fun ImageView.loadWithCoil(url: String, placeholderDrawableResId: Int = R.mipmap.ic_launcher) {
    val requestBuilder = ImageRequest.Builder(context)
        .data(Uri.parse(url))
        .placeholder(placeholderDrawableResId)
        .error(placeholderDrawableResId)
        .fallback(placeholderDrawableResId)
        .crossfade(500)
        // .target(this) //Works fine
        .target { setImageDrawable(it) }

    Coil.enqueue(requestBuilder.build())
}