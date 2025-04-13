package com.example.bigdataprojectuit.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.bigdataprojectuit.R
import com.example.bigdataprojectuit.databinding.FragmentLoginBinding
import com.example.bigdataprojectuit.presentation.viewmodel.LoginViewModel
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        handleClick()
        observerData()
        return binding.root
    }

    private fun handleClick() {
        with(binding) {
            btnRegister.setOnClickListener {
                findNavController().navigate(
                    R.id.action_loginFragment_to_registerAccountFragment
                )
            }

            btnLogin.setOnClickListener {
                if (etEmail.text.toString().isEmpty()) {
                    Snackbar.make(requireView(), "Please fill in userName", Snackbar.LENGTH_SHORT)
                        .show()
                    return@setOnClickListener
                }

                if (etPassword.text.toString().isEmpty()) {
                    Snackbar.make(requireView(), "Please fill in passWord", Snackbar.LENGTH_SHORT)
                        .show()
                    return@setOnClickListener
                }

                viewModel.login(
                    userName = etEmail.text.toString(),
                    password = etPassword.text.toString()
                )
            }
        }
    }

    private fun observerData() {
        viewModel.obsNavigateToLogin.observe(viewLifecycleOwner) {
            if (it) {
                Snackbar.make(requireView(), "Login account successfully", Snackbar.LENGTH_SHORT)
                    .show()
                findNavController().navigate(
                    R.id.action_loginFragment_to_homeFragment
                )
            } else {
                Snackbar.make(requireView(), "Please check data again", Snackbar.LENGTH_SHORT)
                    .show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}