package com.axis.dbconnection
import java.sql.DriverManager

fun main() {

    val myurl = "jdbc:mysql://localhost:3306/kotlindb"
    val connection = DriverManager.getConnection(myurl, "root", "Revathi123@")
    println("connection establish successfully")

//   insert query -Create
    val stmt = connection.createStatement()
    var res=stmt.executeUpdate("insert into user values(2,'Ankit')")
    if (res > 0) {
        println("successfully inserted record into users db !!!")
    } else {
        println("Insert Not sucessful")
    }

}