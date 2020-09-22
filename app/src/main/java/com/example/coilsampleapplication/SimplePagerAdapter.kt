package com.example.coilsampleapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import coil.load
import kotlinx.android.synthetic.main.view_pager_item.view.*

class SimplePagerAdapter(private val items: List<Item>) : PagerAdapter() {

    override fun getCount(): Int = getItems().size

    private fun getItems() = items

    override fun instantiateItem(container: ViewGroup, position: Int): Any =
        LayoutInflater.from(container.context).inflate(R.layout.view_pager_item, container, false).apply {
            val item = items[position]
            imageView.load(item.url) //loadWithCoil(item.url)
            textView.text = item.text

            container.addView(this)
        }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`
}
