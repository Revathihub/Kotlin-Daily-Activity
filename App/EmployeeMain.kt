package com.axis.App
import com.axis.model.Employee
import com.axis.services.EmployeeServices

fun main(){
    var employeService=EmployeeServices()


    var employee=Employee(4,"Ganesh",40000,"HR")
    employeService.addData(employee)
    employeService.ViewDetails()
}