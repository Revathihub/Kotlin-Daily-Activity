package com.axis.test

fun main(args:Array<String>) {
    var countList=mutableListOf<Int>()
    for (i in 1..100) {
        if(i%3==0 && i%5==0){
            countList.add(i)
        }
    }
    println("Divisible by 3 and 5= $countList")
    println("Count of num between 1-100 divisible by 3 and 5=${countList.count()}")
}