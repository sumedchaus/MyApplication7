package com.example.KotlinExamples

  open class Employee (name: String, id: Int, shift: String) {
      init {
          println("Employee name is $name")
          println("Employee id number is $id")
          println("Employee Shift is $shift")
      }
  }
      class Programmer (var name: String,id: Int,shift: String): Employee(name,id,shift) {

          init {
              println("$name of id number $id is work in $shift")
          }

          fun noiceprogrammer(){
              println("$name is noice programmer ")
          }
      }
              class Salesman(var name: String, id: Int, shift: String):Employee(name,id,shift){
                  init {
                      println("$name of id number $id is work in $shift")
                  }
                  fun toughSalesman(){
                      println("$name is hardworker salesman" )
                  }

              }


          fun main (args:Array<String>){
              val programmer=Programmer("sumed",77, "1st shift")
              programmer.noiceprogrammer()
              var Salesmanobj = Salesman("ash",456,"2nd shift")
              Salesmanobj.toughSalesman()



          }





















//open class Employee(name: String,salary: Float) {
//    init {
//        println("Name is $name.")
//        println("Salary is $salary")
//    }
//}
//class Programmer(name: String, dept: String, salary: Float):Employee(name,salary){
//    init {
//        println("Name $name of department $dept with salary $salary.")
//    }
//    fun doProgram() {
//        println("Programming is my passion.")
//
//    }
//}
//class Salesman(name: String, dept: String, salary: Float):Employee(name,salary){
//    init {
//        println("Name $name of department $dept with salary $salary.")
//    }
//    fun fieldWork() {
//        println("Travelling is my hobby.")
//
//    }
//}
//fun main(args: Array<String>){
//    val obj1 = Programmer("Ashu", "Development", 40000f)
//    obj1.doProgram()
//    println()
//    val obj2 = Salesman("Ajay", "Marketing", 30000f)
//    obj2.fieldWork()
//}