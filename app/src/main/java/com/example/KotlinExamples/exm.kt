package com.example.KotlinExamples




    fun fizzBuzz(n: Int): Unit {
        // Write your code here

        for (i in 1..n) {
            // Short-circuit operator is used
             if (i % 5 == 0 && i % 3 == 0) {
                 println("fizzbuzz")
             }else if (i % 3 == 0) {
                println("fizz")
            } else if (i % 5 == 0) {
                println("buzz")

            } else if (i % 5 != 0 || i % 3 != 0) {
                println("$i")

            }
        }
    }


    fun main(args: Array<String>) {


        val n = readLine()!!.trim().toInt()

        fizzBuzz(n)
    }


