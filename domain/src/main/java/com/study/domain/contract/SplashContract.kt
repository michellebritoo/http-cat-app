package com.study.domain.contract

interface SplashContract{
    interface View : ViewContract{
        fun showLottieAnimation()
    }

    interface Presenter : PresenterContract<View>{
        fun waitDelay()
    }
}