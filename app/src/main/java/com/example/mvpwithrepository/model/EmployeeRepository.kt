package com.example.mvpwithrepository.model

interface EmployeeRepository {

    fun retrieveEmployee(): ArrayList<Employee>
}