package com.example.KotlinExamples

class Constructor(name: String, id: Int) {

    val e_name: String
    var e_id: Int

    init {
        e_name = name
        e_id = id
        println("name = ($name) , id = $id")
    }
}

    fun main(args: Array<String>) {
        val myclass = Constructor("Ashu", 101)
    }

