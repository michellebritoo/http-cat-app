package com.study.httpcat.ui.splash

import android.os.Handler
import android.os.Looper
import com.study.domain.contract.SplashContract

class SplashPresenter : SplashContract.Presenter {
    private var view: SplashContract.View? = null

    override fun waitDelay() {
        Handler(Looper.getMainLooper()).postDelayed(
            { view?.navigateToNextScreen() },
            3000L
        )
    }

    override fun attachView(view: SplashContract.View) {
        this.view = view
    }

    override fun onDestroy() {
        view = null
    }
}