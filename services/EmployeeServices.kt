package com.axis.services
import com.axis.model.Employee
import com.axis.database.EmployeeUtil

class EmployeeServices{
    var EmployeeUtil=EmployeeUtil()
    fun ViewDetails() {
        var Employees=EmployeeUtil.data()
        for (employee in Employees) {
            println("Id=${employee.id} | Name=${employee.name} | Salary=${employee.salary} | Department=${employee.department}")
        }
    }
    fun addData(employee:Employee):String{
        EmployeeUtil.data().add(employee)
        return "Employee Data Added Successfull!!"
    }


}