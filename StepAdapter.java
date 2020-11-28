package com.visione.cuisine.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.visione.cuisine.data.Category
import com.visione.cuisine.data.Details
import com.visione.cuisine.databinding.CategoryBinding
import com.visione.cuisine.databinding.RecipeStepItemBinding

class StepAdapter(private val steps: List<String>) : RecyclerView.Adapter<StepAdapter.CategoryHolder>(){
    inner class CategoryHolder(private val binding: RecipeStepItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(){
            binding.textStepNumber.text = String.format("%d/%d ", bindingAdapterPosition.plus(1), steps.size)
            binding.textName.text = steps[bindingAdapterPosition]
            binding.progressRecipeStep.progress = ((bindingAdapterPosition.plus(1) * 100) / steps.size)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RecipeStepItemBinding.inflate(layoutInflater, parent, false)
        return CategoryHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = steps.size
}