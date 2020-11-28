package com.visione.cuisine.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.visione.cuisine.databinding.HeadingViewBinding

class HeadingAdapter(private val heading: String) : RecyclerView.Adapter<HeadingAdapter.HeadingViewHolder>() {
    class HeadingViewHolder private constructor(
        private val binding: HeadingViewBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(title: String) {
            binding.textViewTitle.text = title
        }

        companion object {
            @JvmStatic
            fun from(parent: ViewGroup): HeadingViewHolder {
                return HeadingViewHolder(
                    HeadingViewBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeadingViewHolder {
        return HeadingViewHolder.from(
            parent
        )
    }

    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: HeadingViewHolder, position: Int) {
        holder.bind(heading)
    }
}