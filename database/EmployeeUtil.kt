package com.axis.database
import com.axis.model.Employee

class EmployeeUtil {
    var employee=mutableListOf<Employee>()
    init{
        employee.add(Employee(1,"Revathi",30000,"HR"))
        employee.add(Employee(2,"Nandini",40000,"Manager"))
        employee.add(Employee(3,"Surekha",30000,"Admin"))
    }
    fun data():MutableList<Employee>{
        return employee
    }


}