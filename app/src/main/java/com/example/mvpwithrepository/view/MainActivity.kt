package com.example.mvpwithrepository.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mvpwithrepository.R
import com.example.mvpwithrepository.ViewInterface
import com.example.mvpwithrepository.model.Employee
import com.example.mvpwithrepository.presenter.EmployeePresenter

class MainActivity : AppCompatActivity(), ViewInterface {

    private lateinit var presenter: EmployeePresenter

    override fun showEmployees(list: ArrayList<Employee>) {

        Log.d("MainActivity", "First Employee is " + list[0])



    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroyCalled()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = EmployeePresenter(this)
        presenter.getEmployees()
    }
}
