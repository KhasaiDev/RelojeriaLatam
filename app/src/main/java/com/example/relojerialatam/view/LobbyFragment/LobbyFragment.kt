package com.example.relojerialatam.view.LobbyFragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.relojerialatam.R
import com.example.relojerialatam.databinding.FragmentLobbyBinding

class LobbyFragment : Fragment() {
    private var _binding: FragmentLobbyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLobbyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.card1.setOnClickListener {
            findNavController().navigate(R.id.action_lobbyFragment_to_sucursal1Fragment)
        }

        binding.card2.setOnClickListener {
            findNavController().navigate(R.id.action_lobbyFragment_to_sucursal2Fragment)
        }

        binding.card3.setOnClickListener {
            findNavController().navigate(R.id.action_lobbyFragment_to_sucursal3Fragment)
        }

        binding.card4.setOnClickListener {
            findNavController().navigate(R.id.action_lobbyFragment_to_sucursal4Fragment)
        }

        binding.card6.setOnClickListener {
            findNavController().navigate(R.id.action_lobbyFragment_to_sucursal5Fragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}