package com.visione.cuisine.data

import android.content.Context
import androidx.core.content.ContextCompat
import com.visione.cuisine.R

class Subcategories (private val context: Context){
    val luhyaSubcategories: MutableList<Category>
        get() = mutableListOf(
            Category("Ugali", ContextCompat.getDrawable(context, R.drawable.ugali)),
            Category("Apoth", ContextCompat.getDrawable(context, R.drawable.apoth)),
            Category("Chicken", ContextCompat.getDrawable(context, R.drawable.chicken)),
            Category("Sweet-Potato", ContextCompat.getDrawable(context, R.drawable.sweet_potato)),
            Category("Sukuma-Wiki", ContextCompat.getDrawable(context, R.drawable.sukuma_wiki))
        )

    val kikuyuSubcategories: MutableList<Category>
        get() = mutableListOf(
            Category("Ugali", ContextCompat.getDrawable(context, R.drawable.ugali)),
            Category("Yams", ContextCompat.getDrawable(context, R.drawable.yams)),
            Category("Sweet-Potato", ContextCompat.getDrawable(context, R.drawable.sweet_potato)),
            Category("Sukuma-Wiki", ContextCompat.getDrawable(context, R.drawable.sukuma_wiki))
        )

    val kalenjinSubcategories: MutableList<Category>
        get() = mutableListOf(
            Category("Ugali", ContextCompat.getDrawable(context, R.drawable.ugali)),
            Category("Green-Banana-Fries", ContextCompat.getDrawable(context, R.drawable.green_banana_fries)),
            Category("Sukuma-Wiki", ContextCompat.getDrawable(context, R.drawable.sukuma_wiki))
        )

    val luoSubcategories: MutableList<Category>
        get() = mutableListOf(
            Category("Ugali", ContextCompat.getDrawable(context, R.drawable.ugali)),
            Category("Fish", ContextCompat.getDrawable(context, R.drawable.fish)),
            Category("Apoth", ContextCompat.getDrawable(context, R.drawable.apoth)),
            Category("Sukuma-Wiki", ContextCompat.getDrawable(context, R.drawable.sukuma_wiki))
        )

    val kisiiSubcategories: MutableList<Category>
        get() = mutableListOf(
            Category("Ugali", ContextCompat.getDrawable(context, R.drawable.ugali)),
            Category("Matoke", ContextCompat.getDrawable(context, R.drawable.matoke)),
            Category("Green-Banana-Fries", ContextCompat.getDrawable(context, R.drawable.green_banana_fries)),
            Category("Sukuma-Wiki", ContextCompat.getDrawable(context, R.drawable.sukuma_wiki))
        )

    val marakwetSubcategories: MutableList<Category>
        get() = mutableListOf(
            Category("Ugali", ContextCompat.getDrawable(context, R.drawable.ugali)),
            Category("Githeri", ContextCompat.getDrawable(context, R.drawable.githeri)),
            Category("Nyama-Choma", ContextCompat.getDrawable(context, R.drawable.nyama_choma)),
            Category("Sukuma-Wiki", ContextCompat.getDrawable(context, R.drawable.sukuma_wiki))
        )

    val maasaiSubcategories: MutableList<Category>
        get() = mutableListOf(
            Category("Ugali", ContextCompat.getDrawable(context, R.drawable.ugali)),
            Category("Meat-Stew", ContextCompat.getDrawable(context, R.drawable.meat_stew)),
            Category("Sukuma-Wiki", ContextCompat.getDrawable(context, R.drawable.sukuma_wiki))
        )

    val turkanaSubcategories: MutableList<Category>
        get() = mutableListOf(
            Category("Ugali", ContextCompat.getDrawable(context, R.drawable.ugali)),
            Category("Nyama-Choma", ContextCompat.getDrawable(context, R.drawable.nyama_choma)),
            Category("Meat-Stew", ContextCompat.getDrawable(context, R.drawable.meat_stew)),
            Category("Sukuma-Wiki", ContextCompat.getDrawable(context, R.drawable.sukuma_wiki))
        )
}