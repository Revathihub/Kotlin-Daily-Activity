package com.axis.Database

import java.sql.DriverManager

data class User(var id:Int,var name:String)
fun main() {

    val myurl = "jdbc:mysql://localhost:3306/kotlindb"
    val connection = DriverManager.getConnection(myurl, "root", "Revathi123@")
    println("connection establish successfully")
//select query - Read
    val query = connection.prepareStatement("select * from user")
    val result = query.executeQuery()
    val user = mutableListOf<User>()

    while (result.next()) {
        val id = result.getInt("id")
        val name = result.getString("name")
        user.add(User(id, name))
    }
   for (user in user){
       println(user)
   }
}