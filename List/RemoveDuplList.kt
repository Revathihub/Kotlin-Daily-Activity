fun main(){
    var fruits= mutableListOf<String>("Apple","Mango","Banana","Apple","Mango","Papaya")
    println(fruits)
    var fruitWithOutDupl=fruits.toSet()
    println(fruitWithOutDupl)
}