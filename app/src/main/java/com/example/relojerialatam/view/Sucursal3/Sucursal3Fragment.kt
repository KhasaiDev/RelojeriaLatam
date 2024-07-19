package com.example.relojerialatam.view.Sucursal3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.relojerialatam.R
import com.example.relojerialatam.databinding.FragmentSucursal2Binding
import com.example.relojerialatam.databinding.FragmentSucursal3Binding

class Sucursal3Fragment : Fragment() {

    private var _binding: FragmentSucursal3Binding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  FragmentSucursal3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.sucursal3Direccion.setOnClickListener {
            Toast.makeText(requireContext(), "Direccion Copiada", Toast.LENGTH_SHORT).show()
        }
    }

}