package com.visione.cuisine.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.visione.cuisine.data.Category
import com.visione.cuisine.data.Details
import com.visione.cuisine.databinding.CategoryBinding
import com.visione.cuisine.databinding.IngredientItemBinding
import com.visione.cuisine.databinding.RecipeStepItemBinding

class IngredientAdapter(private val steps: List<String>) : RecyclerView.Adapter<IngredientAdapter.CategoryHolder>(){
    inner class CategoryHolder(private val binding: IngredientItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            binding.textIngredientName.text = steps[bindingAdapterPosition]

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = IngredientItemBinding.inflate(layoutInflater, parent, false)
        return CategoryHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = steps.size
}