package com.example.test4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.test4.databinding.FragmentStartBinding



class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listeners()

    }

    private fun listeners(){
        binding.btnThreeDimensional.setOnClickListener {
            findNavController().navigate(StartFragmentDirections.actionStartFragmentToGameFragment())
        }

        binding.btnFourDimensional.setOnClickListener {
            findNavController().navigate(StartFragmentDirections.actionStartFragmentToFourDimensionalFragment())
        }

        binding.btnFiveDimensional.setOnClickListener {
            findNavController().navigate(StartFragmentDirections.actionStartFragmentToFiveDimensionalFragment())
        }

    }

}