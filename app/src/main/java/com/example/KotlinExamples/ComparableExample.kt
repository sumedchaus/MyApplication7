package com.example.KotlinExamples

import java.util.*

class ComparableExample{

fun printvalues(){
    println("Print values:")
}

}
fun main(args:Array<String>) {
    var comparableExample = ComparableExample()
    var arrayList = mutableListOf<Student>()
    arrayList.add(Student("sumed", 7, 21))
    arrayList.add(Student("Ace", 2, 27))
    arrayList.add(Student("Lufy", 3, 17))

    for (str in arrayList) {
        println("  " + str.age + "  " + str.roll_no + "  " + str.name)
    }
    println()

    Collections.sort(arrayList)
    for (str in arrayList)
        println("  " + str.age + "  " + str.roll_no + "  " + str.name)
}
