package com.example.mvpwithrepository.model

class EmployeeDataSource {

    fun getEmployees(): ArrayList<Employee>{

        var employeeList = arrayListOf<Employee>()

        for (i: Int in 1..30){
            val employee = Employee(ID + i, FIRST_NAME + i, LAST_NAME + i)
            employeeList.add(employee)
        }
        return employeeList
    }

    companion object{
        const val ID = "IdNumber"
        const val FIRST_NAME = "FirstName"
        const val LAST_NAME = "LastName"
    }
}