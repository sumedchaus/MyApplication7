package com.example.KotlinExamples

class DayUsingWhen {
    fun days() {
        println(" Day Number")
        var number: Int = Integer.parseInt(readLine())

        when (number) {
            1 -> println("sunday")
            2 -> println("monday")
            3 -> println("tuesday")
            4 -> println("wednesday")
            5 -> println("thursday")
            6 -> println("friday")
           in 7..15-> println("saturday")
            else -> println("funday")
        }
    }


    fun monthUsingWhen() {

        println("month number")
        var monthnumber = Integer.parseInt(readLine())
        when (monthnumber) {
            1,11 -> println("Jan")
            2,22 -> println("Feb")
            3,33 -> println("March")
            4,44 -> println("April")
            5,55 -> println("May")
            6,66 -> println("June")
            7,77 -> println("July")
            8,88-> println("Aug")
            9,99 -> println("Sep")
            10,100 -> println("Oct")
            11,111 -> println("Nov")
            12,122 -> println("Dec")
            else -> println("no more")
        }
    }

    fun sutudent(){
        println("Roll number")
        var roll_no = Integer.parseInt(readLine())
        when(roll_no){
            1-> println("Ajay")
            2-> println("Mukesh")
            7-> println("Sumed")
            else -> println("No Space")
        }

    }

}

fun main(args: Array<String>){
    var dayUsingWhen = DayUsingWhen()
    dayUsingWhen.days()
    dayUsingWhen.monthUsingWhen()
    dayUsingWhen.sutudent()

}