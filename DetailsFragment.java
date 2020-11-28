package com.visione.cuisine.ui

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ConcatAdapter
import coil.ImageLoader
import coil.request.LoadRequest
import com.visione.cuisine.MainActivity
import com.visione.cuisine.R
import com.visione.cuisine.adapter.HeadingAdapter
import com.visione.cuisine.adapter.IngredientAdapter
import com.visione.cuisine.adapter.RecipeHeadingAdapter
import com.visione.cuisine.adapter.StepAdapter
import com.visione.cuisine.data.Details
import com.visione.cuisine.data.Steps
import com.visione.cuisine.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private var subcategory: String? = null
    private lateinit var binding: FragmentDetailsBinding
    private lateinit var details: List<Details>
    private val recipeHeadingAdapter = RecipeHeadingAdapter()
    private lateinit var ingredientAdapter: IngredientAdapter
    private lateinit var stepsAdapter: StepAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        (activity as MainActivity).enableCollapse()

        subcategory = arguments?.getString("subcategory")
        (activity as MainActivity).collapseToolbar.title = "$subcategory Recipe"

        val data = Steps(activity?.applicationContext!!)
        details = when (subcategory) {
            "Ugali" -> data.ugali
            "Sukuma-Wiki" -> data.sukuma
            "Apoth" -> data.apoth
            "Sweet-Potato" -> data.sweetPotato
            "Yams" -> data.yam
            "Green-Banana-Fries" -> data.greenBananaFries
            "Matoke" -> data.matoke
            "Fish" -> data.fish
            "Meat-Stew" -> data.meatStew
            "Nyama-Choma" -> data.nyamaChoma
            "Githeri" -> data.githeri
            "Chicken" -> data.chicken
            else -> emptyList()
        }
        stepsAdapter = StepAdapter(details[0].steps)
        ingredientAdapter = IngredientAdapter(details[0].ingredients)

        setHasOptionsMenu(true)

        initializeView()

        return binding.root
    }

    private fun initializeView() {
        postponeEnterTransition()
        setUpHeaderImage()
        setUpRecyclerView()
    }


    private fun setUpHeaderImage() {
        val imageUrl = details[0].image

        context?.run {
            val imageLoader = ImageLoader(this)
            val request = LoadRequest.Builder(this)
                .data(imageUrl)
                .target(onError = {
                    startPostponedEnterTransition()
                }, onSuccess = {
                    startPostponedEnterTransition()
                    (activity as MainActivity).imageHeader.setImageDrawable(it)
                })
                .build()

            imageLoader.execute(request)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_share, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_share) {
            startActivity(getShareIntent())
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getShareIntent(): Intent {
        return ShareCompat.IntentBuilder.from(requireActivity())
            .setText("$subcategory Food. ${details[0].steps}")
            .setType("text/plain")
            .intent
    }

    private fun setUpRecyclerView() {
        with(binding.recyclerView) {
            adapter = ConcatAdapter(
                recipeHeadingAdapter,
                HeadingAdapter(getString(R.string.ingredients)),
                ingredientAdapter,
                HeadingAdapter(getString(R.string.steps)),
                stepsAdapter
            )
        }
    }
}