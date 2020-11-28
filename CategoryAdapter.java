package com.visione.cuisine.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.visione.cuisine.data.Category
import com.visione.cuisine.databinding.CategoryBinding

class CategoryAdapter(private val categories: List<Category>, private val listener: CategoryItemClickListener) : RecyclerView.Adapter<CategoryAdapter.CategoryHolder>(){
    class CategoryHolder(private val binding: CategoryBinding, private val listener: CategoryItemClickListener): RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        init {
            binding.backgroundImage.setOnClickListener(this)
        }
        fun bind(category: Category){
            binding.imageCategory.background = category.image
            binding.textName.text = category.name
        }

        override fun onClick(p0: View?) {
            listener.onItemClick(binding.backgroundImage, bindingAdapterPosition)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = CategoryBinding.inflate(layoutInflater, parent, false)
        return CategoryHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
            holder.bind(categories[position])
    }

    override fun getItemCount() = categories.size

    interface CategoryItemClickListener{
        fun onItemClick(view: View?, pos: Int)
    }

}