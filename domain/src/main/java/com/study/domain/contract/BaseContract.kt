package com.study.domain.contract

interface NavigationContract {
    fun navigateToNextScreen()
    fun goBack()
}

interface ViewContract : NavigationContract{
}

interface PresenterContract<T : ViewContract>{
    fun attachView(view: T)
    fun onDestroy()
}