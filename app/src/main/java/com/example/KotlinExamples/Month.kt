package com.example.KotlinExamples

class Month {
    fun checkMonths() {
        println("enter number")
        var number:Int = Integer.parseInt(readLine())
        val result =
            if( number == 1){
            println("Jan")
        }
        else if (number == 2){
            println("Feb")
        }else if (number == 3){
            println("March")
        }else if (number == 4){
            println("April")
        }else if (number == 5){
            println("May")
        }else if (number == 6){
            println("June")
        }else if (number == 7){
            println("July")
        }else if (number == 8){
            println("Aug")
        }else if (number == 9){
            println("Sep")
        }else if (number == 10){
            println("Oct")
        }else if (number == 11){
            println("Nov")
        }else if (number == 12){
            println("Dec")
        }
        else{
            null
        }


    }

    fun fizzbuzz(){

    }
}


fun main (args: Array<String>) {
    var month = Month()
    month.checkMonths()
}
