package com.example.coilsampleapplication

import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import coil.Coil
import coil.request.ImageRequest

fun View.loadWithCoil(url: String, placeholderDrawableResId: Int = R.mipmap.ic_launcher, customHeight: Int = 0, customWidth: Int = 0) {
    val requestBuilder = ImageRequest.Builder(context)
        .data(Uri.parse(url))
        .placeholder(placeholderDrawableResId)
        .error(placeholderDrawableResId)
        .fallback(placeholderDrawableResId)
        .crossfade(500)
        /*.apply {
            if (customWidth != 0 && customHeight != 0)
                size(customWidth, customHeight)
        }*/
        .target { setImage(it) }

    Coil.enqueue(requestBuilder.build())
}

private fun View.setImage(drawable: Drawable?) {
    when (this) {
        is ImageView -> setImageDrawable(drawable)
        is TextView -> setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null)
        else -> background = drawable
    }
}