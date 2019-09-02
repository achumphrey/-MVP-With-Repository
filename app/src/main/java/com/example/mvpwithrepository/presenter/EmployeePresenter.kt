package com.example.mvpwithrepository.presenter

import com.example.mvpwithrepository.PresenterInterface
import com.example.mvpwithrepository.ViewInterface
import com.example.mvpwithrepository.model.EmployeeRepoImpl

class EmployeePresenter(_view: ViewInterface): PresenterInterface {

    var view: ViewInterface? = _view
    var employeeRepoImpl: EmployeeRepoImpl = EmployeeRepoImpl()

    override fun getEmployees() {

        view?.showEmployees(employeeRepoImpl.retrieveEmployee())
    }

    override fun onDestroyCalled() {
      view = null
    }


}