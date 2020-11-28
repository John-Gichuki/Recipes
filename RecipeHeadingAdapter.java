package com.visione.cuisine.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.visione.cuisine.databinding.RecipeHeadingViewBinding

class RecipeHeadingAdapter : RecyclerView.Adapter<RecipeHeadingAdapter.RecipeHeadingViewHolder>() {

    class RecipeHeadingViewHolder private constructor(private val binding: RecipeHeadingViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(recipeHeading: String, recipeDescription: String) {
            with(binding) {
                textViewTitle.text = recipeHeading
                textViewContent.text = recipeDescription
            }
        }

        companion object {
            @JvmStatic
            fun from(parent: ViewGroup): RecipeHeadingViewHolder {
                return RecipeHeadingViewHolder(
                    RecipeHeadingViewBinding.inflate(
                        LayoutInflater.from(
                            parent.context
                        ), parent, false
                    )
                )
            }
        }
    }

    var headingAndDescription: Pair<String, String>? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeHeadingViewHolder {
        return RecipeHeadingViewHolder.from(parent)
    }

    override fun getItemCount() = if (headingAndDescription != null) 1 else 0

    override fun onBindViewHolder(holder: RecipeHeadingViewHolder, position: Int) {
        holder.bind(headingAndDescription!!.first, headingAndDescription!!.second)
    }

}