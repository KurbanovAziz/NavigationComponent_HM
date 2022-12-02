package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponent.FirstFragment.Companion.KEY_DETAIL_CARD
import com.example.navigationcomponent.databinding.FragmentDetailCardBinding


class DetailCardFragment : Fragment() {

    private lateinit var binding: FragmentDetailCardBinding
    private lateinit var navArgs: DetailCardFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailCardBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            navArgs = DetailCardFragmentArgs.fromBundle(it)
        }
        binding.tvLife.text = navArgs.detail.tvLife
        binding.tvName.text = navArgs.detail.tvName
        binding.imageView.setImageResource(navArgs.detail.image!!)
    }
}