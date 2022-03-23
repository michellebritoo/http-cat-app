package com.study.httpcat.ui.splash

import com.study.domain.contract.SplashContract
import io.reactivex.Completable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit

class SplashPresenter : SplashContract.Presenter {
    private var view: SplashContract.View? = null

    override fun waitDelay() {
        Completable.timer(5, TimeUnit.SECONDS, AndroidSchedulers.mainThread())
            .doOnComplete { view?.navigateToNextScreen() }
            .subscribe()
    }

    override fun attachView(view: SplashContract.View) {
        this.view = view
    }

    override fun onDestroy() {
        view = null
    }
}