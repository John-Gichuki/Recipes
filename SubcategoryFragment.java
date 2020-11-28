package com.visione.cuisine.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.visione.cuisine.MainActivity
import com.visione.cuisine.adapter.CategoryAdapter
import com.visione.cuisine.R
import com.visione.cuisine.data.Category
import com.visione.cuisine.data.Subcategories
import com.visione.cuisine.databinding.FragmentSubcategoryBinding

class SubcategoryFragment : Fragment() {
    private lateinit var subcategories: List<Category>
    private lateinit var adapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSubcategoryBinding.inflate(inflater, container, false)
        val category = arguments?.getString("category")

        (activity as MainActivity).collapseToolbar.title = "$category Recipe"
        (activity as MainActivity).disableCollapse()

        val data = Subcategories(activity?.applicationContext!!)
        subcategories = when(category){
            "Luhya"         -> data.luhyaSubcategories
            "Kikuyu"        -> data.kikuyuSubcategories
            "Luo"         -> data.luoSubcategories
            "Kalenjin"        -> data.kalenjinSubcategories
            "Kisii"         -> data.kisiiSubcategories
            "Maasai"        -> data.maasaiSubcategories
            "Marakwet"         -> data.marakwetSubcategories
            "Turkana"        -> data.turkanaSubcategories
            "Mijikenda"        -> data.kalenjinSubcategories
            "Taita"         -> data.kisiiSubcategories
            "Teso"        -> data.maasaiSubcategories
            "Meru"         -> data.marakwetSubcategories
            "Kamba"        -> data.turkanaSubcategories
            else -> emptyList()
        }


        val listener = object : CategoryAdapter.CategoryItemClickListener{
            override fun onItemClick(view: View?, pos: Int) {
                val bundle = bundleOf("subcategory" to subcategories[pos].name)
                this@SubcategoryFragment.findNavController().navigate(R.id.nav_details, bundle)
            }

        }
        adapter = CategoryAdapter(subcategories, listener)

        val gridManager = GridLayoutManager(activity, 2)
        binding.recyclerviewSubcategory.layoutManager = gridManager
        binding.recyclerviewSubcategory.adapter = adapter
        binding.recyclerviewSubcategory.isNestedScrollingEnabled = false


        return binding.root
    }
}