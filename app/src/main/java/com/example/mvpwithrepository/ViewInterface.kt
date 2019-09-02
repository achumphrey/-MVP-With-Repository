package com.example.mvpwithrepository

import com.example.mvpwithrepository.model.Employee

interface ViewInterface {

    fun showEmployees(list: ArrayList<Employee>)
}