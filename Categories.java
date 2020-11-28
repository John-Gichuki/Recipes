package com.visione.cuisine.data

import android.content.Context
import androidx.core.content.ContextCompat
import com.visione.cuisine.R

class Categories(private val context: Context) {
    val categories: MutableList<Category>
        get() = mutableListOf(
            Category("Luhya", ContextCompat.getDrawable(context, R.drawable.luhya)),
            Category("Kikuyu", ContextCompat.getDrawable(context, R.drawable.kikuyu)),
            Category("Luo", ContextCompat.getDrawable(context, R.drawable.luo)),
            Category("Kalenjin", ContextCompat.getDrawable(context, R.drawable.kalenjin)),
            Category("Kisii", ContextCompat.getDrawable(context, R.drawable.kisii)),
            Category("Marakwet", ContextCompat.getDrawable(context, R.drawable.marakwet)),
            Category("Maasai", ContextCompat.getDrawable(context, R.drawable.maasai)),
            Category("Turkana", ContextCompat.getDrawable(context, R.drawable.turkana)),
            Category("Mijikenda", ContextCompat.getDrawable(context, R.drawable.mijikenda)),
            Category("Meru", ContextCompat.getDrawable(context, R.drawable.meru)),
            Category("Kamba", ContextCompat.getDrawable(context, R.drawable.kamba)),
            Category("Taita", ContextCompat.getDrawable(context, R.drawable.taita)),
            Category("Teso", ContextCompat.getDrawable(context, R.drawable.teso))
        )
}