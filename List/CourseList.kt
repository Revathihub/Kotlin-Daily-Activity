package com.List

fun main(){
    var JavaBatch=mutableListOf("Anil","Gopal","Ankit","Manish")
    var KotlinBatch=mutableListOf("Ankit","Kumar","Manish","Rahul")
    println("JavaBatch :$JavaBatch")
    println("KotlinBatch :$KotlinBatch")
    println("---------------------------------------------------------")
    JavaBatch.addAll(KotlinBatch)
    print("Combination Of Both Batchs :")
    println(JavaBatch)
    println("---------------------------------------------------------")
    JavaBatch.removeAll(KotlinBatch)
    print("After Removing Duplicate Names:")
    JavaBatch.addAll(KotlinBatch)
    println(JavaBatch)
    println("---------------------------------------------------------")
    var sortedlist=JavaBatch.sorted()
    println("Combination Of Both Batches in Ascending Order=$sortedlist")

}