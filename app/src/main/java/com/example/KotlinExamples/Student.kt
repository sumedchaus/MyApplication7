package com.example.KotlinExamples

class Student (name : String, roll_no:  Int, age : Int): Comparable<Student>{


    var roll_no: Int = 0
    var name: String? = null
    var age: Int = 0
//    get() = field
//    set(value) {
//        field = value
//    }
    init {
        this.roll_no= roll_no
        this.name = name
        this.age = age
    }

    override fun compareTo(other: Student): Int {
        val compareroll_no : Int = (other as Student).roll_no
        return this.roll_no - compareroll_no
    }


}


    fun main(args: Array<String>) {


}




