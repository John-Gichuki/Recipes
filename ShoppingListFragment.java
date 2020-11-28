package com.visione.cuisine.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.visione.cuisine.MainActivity
import com.visione.cuisine.R

class ShoppingListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        (activity as MainActivity).collapseToolbar.title = "Shopping List"
        (activity as MainActivity).disableCollapse()
        return inflater.inflate(R.layout.fragment_shopping_list, container, false)
    }
}