package com.visione.cuisine.data

import android.graphics.drawable.Drawable

data class Details(
    var name: String,
    var image: Drawable?,
    var ingredients: MutableList<String>,
    var steps: MutableList<String>
)