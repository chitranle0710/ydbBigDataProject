package com.example.bigdataprojectuit.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.bigdataprojectuit.R
import com.example.bigdataprojectuit.databinding.FragmentRegisterAccountBinding
import com.example.bigdataprojectuit.presentation.viewmodel.MainViewModel
import com.example.bigdataprojectuit.presentation.viewmodel.RegisterAccountViewModel
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterAccountFragment : Fragment() {

    private var _binding: FragmentRegisterAccountBinding? = null
    private val binding get() = _binding!!

    private val viewModel: RegisterAccountViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterAccountBinding.inflate(inflater, container, false)
        initView()
        observerData()
        return binding.root
    }

    private fun initView() {
        with(binding) {
            btnRegister.setOnClickListener {
                viewModel.registerAccount(
                    name = etFullName.text.toString(),
                    password = etPassword.text.toString(),
                    userName = etEmail.text.toString()
                )
            }
        }
    }

    private fun observerData() {
        viewModel.obsNavigateToLogin.observe(viewLifecycleOwner) {
            if (it) {
                Snackbar.make(requireView(), "Register account successfully", Snackbar.LENGTH_SHORT).show()
                findNavController().popBackStack()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}