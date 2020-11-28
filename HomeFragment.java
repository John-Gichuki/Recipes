package com.visione.cuisine.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.visione.cuisine.MainActivity
import com.visione.cuisine.R
import com.visione.cuisine.adapter.CategoryAdapter
import com.visione.cuisine.data.Categories
import com.visione.cuisine.data.Category
import com.visione.cuisine.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var categories: List<Category>
    private lateinit var adapter: CategoryAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)

        (activity as MainActivity).disableCollapse()
        (activity as MainActivity).collapseToolbar.title = "All Recipes"

        val data = Categories(activity?.applicationContext!!)
        categories = data.categories

        val listener = object : CategoryAdapter.CategoryItemClickListener{
            override fun onItemClick(view: View?, pos: Int) {
                val bundle = bundleOf("category" to categories[pos].name)
                this@HomeFragment.findNavController().navigate(R.id.nav_subcategory, bundle)

            }

        }
        adapter = CategoryAdapter(categories, listener)

        val gridManager = GridLayoutManager(activity, 2)
        binding.recyclerviewCategory.layoutManager = gridManager
        binding.recyclerviewCategory.adapter = adapter
        binding.recyclerviewCategory.isNestedScrollingEnabled = false


        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                confirmLogout()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)
    }

    private fun confirmLogout() {
        val alertDialog = AlertDialog.Builder(ContextThemeWrapper(activity, R.style.ThemeOverlay_AppCompat))
        alertDialog.setMessage("Do you really want to exit this app?")
        alertDialog.setPositiveButton(
            "Exit"
        ) { _, _ ->
            activity?.finish()
        }
        alertDialog.setNegativeButton("Cancel") { dialog, _ ->
            dialog.dismiss()
        }
        alertDialog.show()

    }
}