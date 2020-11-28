package com.visione.cuisine.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.visione.cuisine.MainActivity
import com.visione.cuisine.R
import com.visione.cuisine.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSettingsBinding.inflate(inflater, container, false)

        (activity as MainActivity).collapseToolbar.title = "Settings"
        (activity as MainActivity).disableCollapse()

        binding.linearDisclaimer.setOnClickListener {
            navigateToDisclaimerFragment()
        }
        return binding.root
    }

    private fun navigateToDisclaimerFragment() {
        findNavController().navigate(R.id.disclaimerFragment)
    }
}