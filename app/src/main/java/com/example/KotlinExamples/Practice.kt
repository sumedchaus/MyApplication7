package com.example.KotlinExamples

class Practice {


    fun ifElseExample(){

        var number = 5

          if (number == 0)
        println("number is zero" )
        else if (number < 0)
              println("number is negative")
        else if (number > 0)
              println("number is positive")
    }
    fun ifElseExample2(){
        var number = -5

        if (number == 0)
            println("number is zero")
        else if (number < 0)
            println("number is negative")
        else if (number > 0)
            println("number is positive")

    }
    fun ifelseexample3(){
        var number =50
        if (number == 0)
            println("number is zero")
        else if (number < 0)
            println("number is negative")
        else if (number > 0)
            println("number is positive")


    }
    fun ifelseexample4() {
        var number = -50
        if (number == 0)
            println("number is zero")
        else if (number < 0)
            println("number is negatine")
        else if (number > 0)
            println("number is positive")

    }
    fun example5() {
        var num1 = 15
        val num2 = 100

        if (num1 > num2) {
            println("$num1 is greater than $num2 ")
        }else
            println("$num2 is greater than $num1")
    }


    }
fun main(args: Array<String>){
    var practiceObj = Practice()
//    practiceObj.ifElseExample()
//    practiceObj.ifElseExample2()
//    practiceObj.ifelseexample3()
//    practiceObj.ifelseexample4()
    practiceObj.example5()



}