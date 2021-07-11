package com.example.KotlinExamples

class Constructor1 (password: String){
    constructor(name: String , id: Int, password: String) : this(password) {
     println("name = $name , id = $id, password = $password")

    }
}
     fun main (args: Array<String>){
         var constructor1 = Constructor1("ashu", 101 , "mypassword")
     }
//
//Constructor1(password: String){
//
//    constructor(name: String, id: Int, password: String): this(password){
//        println("Name = ${name}")
//        println("Id = ${id}")
//        println("Password = ${password}")
//    }
//}
//fun main(args: Array<String>){
//    val myclass = Constructor1 ("Ashu", 101, "mypassword")
//
//}