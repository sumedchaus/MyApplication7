package com.example.KotlinExamples

class WhileLoop {
    fun reversedNumber() {
        println("input for reversed number")
        var number: Int = Integer.parseInt(readLine())
        var reversed = 0
        while (number != 0) {
            val digit: Int = number % 10
            reversed = reversed * 10 + digit
            number /= 10
        }
        println("reversed number: $reversed")
    }

    fun additionOfNumber() {
        println("input for add number")
        var number: Int = Integer.parseInt(readLine()) // ex.  456 = addition =15
        var addition = 0
        while ((number != 0)) {
            var digit = number % 10
            addition = digit + addition
            number /= 10
        }
        println("addition: $addition")
    }

    fun plusAllNumbers() {
        println("input for add number")
        var number: Int = Integer.parseInt(readLine()) // ex. 10 = 1+2+3+4+5+6+7+8+9+10 = 55
        var add = 0

        while ((number != 0)) {
            add = number + add
            number = number - 1
        }
        println("addition: $add")
    }

    fun primeNumber() {
        println("Please Enter Number")
        var number: Int = Integer.parseInt(readLine())
        var counter = 2
        var flag = true
        while (counter < number) {
            if (number % counter == 0) {
                flag = false
            }
            counter++
        }
        if (flag == true) {
            println("number is prime")
        } else {
            println("number is not prime")
        }
    }

    fun checkOddEvenNumber() {
        println("Please Enter Number")      // 15 = 7even number & 8 odd number
        var num1: Int = Integer.parseInt(readLine())
        var countEven = 0
        var countOdd = 0
        var num2 = 1
        while (num2 <= num1) {
            if (num2 % 2 != 0)  // bitwise & operator
                countOdd++
            else
                countEven++
            num2++
        }
        println("$countEven = even numbers")
        println("$countOdd = odd numbers")
    }

    fun factorialOfNumber() {
        println("Please Enter Number")
        var num1: Int = Integer.parseInt(readLine())
        var factorial = 1
        while (num1 != 0) {
            factorial = factorial * num1
            num1--
        }
        println("factorial is = $factorial")
    }

    fun fibonaciSeries(){

//        println("Please Enter Number")
//       var num: Int = Integer.parseInt(readLine())
       var counter = 1
        var maxnumber=10
        var num1 = 0
        var num2 = 1
        print("upto $maxnumber:")
        while (counter <= maxnumber){
          print("$num1+")
            val sum = num1 + num2
            num1=num2
            num2 = sum
            counter++
        }
    }


}



fun main(args:Array< String>) {
   var whileLoop = WhileLoop()
    whileLoop.reversedNumber()
 //   whileLoop.addition()
  //  whileLoop.plusall()
  //  whileLoop.primenumber()
  //  whileLoop.checkOddEvenNumber()
   // whileLoop.fibonaciSeries()
  // whileLoop.primeNumber()



}