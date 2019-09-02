package com.example.mvpwithrepository.model

class EmployeeRepoImpl: EmployeeRepository {

    var dataSource = EmployeeDataSource()

    //some AsyncTask Operation
    override fun retrieveEmployee(): ArrayList<Employee> {

        return dataSource.getEmployees()

    }
}