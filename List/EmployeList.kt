package com.List

class Employee(id:Int,name:String,dept:String,salary:Int,age:Int)
{
    var id:Int=id
    var name:String=name
    var dept:String=dept
    var salary:Int=salary
    var age:Int=age
}

fun main() {

    var emp= mutableListOf<Employee>()
    emp.add (Employee(1,"Revathi","It",30000,20))
    emp.add(Employee(2,"Raji","it",40000,30))
    emp.add(Employee(3,"Ganesh","NonIt",40000,25))
    for (Employe in emp)
        println("${Employe.id} ${Employe.name} ${Employe.dept} ${Employe.salary} ${Employe.age}")





}

