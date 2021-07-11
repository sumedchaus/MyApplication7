package com.example.KotlinExamples

class Company {

    var employ_name = ""
    var shift = ""
    var id_number = 0

    fun insert(id_1: Int, name1: String, shift1: String) {

        id_number = id_1
        employ_name = name1
        shift = shift1
        println("insert(): name = $name1, id_number = $id_1, shift= $shift1.")

    }
}
    fun shift() {

    }