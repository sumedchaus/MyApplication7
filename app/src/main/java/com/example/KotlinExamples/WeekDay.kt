package com.example.KotlinExamples

class WeekDay {
    fun seven() {
        println(" enter  a number")
        var day:Int = Integer.parseInt(readLine())

        val result = if (day == 1) {
            println("day1 is sunday")
        } else if(day == 2) {
            println("day2 is monday")
        } else if(day == 3) {
            println("day3 is tuesday")
        }else if(day == 4) {
        println("day4 is wednesday")
        } else if(day == 5) {
            println("day5 is thursday")
        } else if(day == 6) {
            println("day6 is friday")
        } else if(day == 7) {
            println("day7 is saturday")
        }else null
    }
}

        fun main (args: Array<String>) {
            var weekDay = WeekDay()
            weekDay.seven()

        }








