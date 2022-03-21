package com.study.httpcat.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.study.domain.contract.SplashContract
import com.study.httpcat.R
import com.study.httpcat.databinding.FragmentSplashBinding

class SplashFragment : Fragment(), SplashContract.View {
    private val presenter: SplashPresenter = SplashPresenter()
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater)

        presenter.attachView(this)
        presenter.waitDelay()

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }

    override fun showLottieAnimation() {
        binding.animationView.visibility = View.VISIBLE
    }

    override fun navigateToNextScreen() {
        findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
    }

    override fun goBack() = Unit
}