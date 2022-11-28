package com.axis.test
import java.util.Scanner

fun main(args:Array<String>) {
    var scan = Scanner(System.`in`)
    println("Enter the age: ")
    var age = scan.nextInt()
    var checkage: (Int) -> String ={ age ->
        if (age < 18){ "Non Adult"}
        else if (age <= 5){
            "Adult"}
        else{
            "Senior citizen"}
    }
    println("${checkage(age)}")
}

