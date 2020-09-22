package com.example.coilsampleapplication

import android.app.Application
import coil.Coil
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.SvgDecoder

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Coil.setImageLoader(
            ImageLoader.Builder(this)
                .componentRegistry {
                    add(SvgDecoder(this@MyApplication))
                    add(GifDecoder())
                }
                .build()
        )
    }
}