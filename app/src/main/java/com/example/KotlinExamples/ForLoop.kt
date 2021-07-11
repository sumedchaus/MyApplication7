package com.example.KotlinExamples

class ForLoopExample { // ForLoopExample

    fun fibonaciSeriesExample(max_number: Int) {  // max_number is formal argument
        println("Please Enter Number")
        var max_number: Int = Integer.parseInt(readLine())
   //     var max_number = 10
        var num1: Int = 0
        var num2: Int = 1
        println("Fibonaci Number $max_number")

        for (i in 1..max_number) {
            println("$num1 ")
            val sum = num1 + num2
            num1 = num2
            num2 = sum
        }
    } // output = 1 1 2 3 5 8 13 21 ....

    fun reverseNumberExample() {
        println("Please Enter Number")
        var number: Int = Integer.parseInt(readLine())
        // var number: Int = 10
        var reversed = 0

        for (i in reversed..number) {
            val digit: Int = number % 10
            reversed = reversed * 10 + digit
            if (number == 0) break
            number /= 10
            println("  reverse Number :$reversed ")
        }
    }

    fun plusAllExample() {
        println("Please Enter Number")
        var num: Int = Integer.parseInt(readLine()) //ex. 10 = 1+2+3+4+5+6+7+8+9+10 = 55
        var num1 = 0

        for (i in num1..num) {
            num1 = num1 + i
        }
        println("Addition of Number = $num1")
    }

    fun additionOfNumberExample() {
        println("input for add number") // 456 = 4+5+6 = 15
   //      var number: Int = Integer.parseInt(readLine())
         var number  = 456
        var addition = 0

        for (digit in number downTo 1) {
            var digit = number % 10
            addition = addition + digit
          number = number / 10     // number /= 10
        }
        println("$addition")
    }


    fun primeNumberExample() { // number which divided by itself n 1 only ex 7, 17, 13
        println("Enter Number")
       // var num1: Int = Integer.parseInt(readLine())
        var num1 = 10
        var flag = false
        for (i in 2..(num1 - 1)){
            if (num1 % i == 0)
                flag = true
    }
            if (flag == false)
                println("number is prime")
             else
                println("number is not prime")
    }


    fun oddEvenExample() { // odd num 1 3 5 7 9 //even num 2 4 6 8 10
        println("Enter Number")
        // var num: Int = Integer.parseInt(readLine())
        var num = 10
        var countodd = 0
        var counteven = 0

        for (i in 1..num) {
            if (i % 2 == 0)
             counteven++
             else
              countodd++
        }
        println("$counteven number is even ,  $countodd number is odd ")
    }


    fun fibonaciSeriesExample(){
        println("Enter Number")
       var num: Int = Integer.parseInt(readLine())
        var num1 = 0
        var num2 = 1
        var sum =0

        for (i in 0..num-1) {
            sum = num1 + num2
            println("$num1")
            num1=num2
            num2 = sum
        }
    }
    fun swapNumberExample(){
        var num1 = 10
        var num2 = 20
        var sum = num1

        num1 = num2
        num2 = sum
        println("Swapped num1 is $num1")
        println("Swapped num2 is $num2")
    }
    fun swappedNumberTwo(){
        var num1 = 10
        var num2 = 20
        num1 = num1 - num2
        num2 = num1 +num2
        num1 = num2 - num1
        println("Swapped num1 is $num1")
        println("Swapped num2 is $num2")
    }

    fun factorialNumber(){ // 5! = 5*4*3*2*1 = 120
        var num = 10
        var num1 = 1
        for (i in 1..num){

            num1 = num1* i


        }
        println("factorial number of $num is $num1")

    }
}

fun main(args:Array< String>) {
   var forLoopExample = ForLoopExample()
//    forLoopExample.additionOfNumberExample()
//    forLoopExample.fibonaciSeriesExample()
//    forLoopExample.oddEvenExample()
//    forLoopExample.plusAllExample()
//    forLoopExample.primeNumberExample()
//    forLoopExample.reverseNumberExample()
//    forLoopExample.swapNumberExample()
//    forLoopExample.swappedNumberTwo()
    forLoopExample.factorialNumber()

}