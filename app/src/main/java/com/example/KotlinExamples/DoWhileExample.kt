package com.example.KotlinExamples

open class DoWhileExample {
    fun reverseExample() {
        println("Please Enter Number")
        var number: Int = Integer.parseInt(readLine())
        var reversed = 0
        do {
            var digit = number % 10    // remove unwanted variable digit
            reversed = reversed * 10 + digit
            number /= 10
        } while (number != 0)
        println("Reversed Number = $reversed")
    }


    fun additionOfNumberExample() {
        println("Please Enter Number") //ex. 456= 4+5+6 = 15
        var number: Int = Integer.parseInt(readLine())
        var addition = 0
        do {
            var digit = number % 10  // remove unwanted variable digit
            addition = addition + digit
            number /= 10
        } while (number != 0)
        println("Addition Number = $addition")
    }


    fun plusAllExample() {
        println("Please Enter Number") //ex. 5= 1+2+3+4+5 =15
        var number: Int = Integer.parseInt(readLine())
        var total = 0
        do {
            total = number + total
            number = number - 1
        } while (number != 0)
        println("Plus Number = $total")
    }


    fun primeNumberExample() {
        println("Please Enter Number")
        var number: Int = Integer.parseInt(readLine())
        var counter = 2
        var flag = true
        do {
            if (number % counter == 0) {
                flag = false
            }
            counter++
        } while (counter < number)

        if (flag == true)
            println("number is  Prime")
        else
            println("number is not Prime")

    }


    fun factorialNumberExample() {
        println("Please Enter Number")
        var number: Int = Integer.parseInt(readLine())
        var factorial = 1
        do {
            factorial = factorial * number
            number--
        } while (number != 0)
        println("factorial is $factorial")
    }


    fun oddevenCountExample() {
        println("Please Enter Number")
        var number: Int = Integer.parseInt(readLine())
        var counteven = 0
        var countodd = 0
        var num2 = 1

        do {
            if (number % 2 != 0)
                countodd++
            else
                counteven++
            number++
        } while (num2 <= number)
        println("$counteven = even numbers , $countodd = odd numbers")
    }


    fun fibonaciSeriesExample() {
        println("Please Enter Number")
        var number: Int = Integer.parseInt(readLine())
        var num1 = 0
        var num2 = 1
        var sum = 0
        do {
            sum = num1 + num2
            println("Fibonaci Series : $num1")
            num1 = num2
            num2 = sum
            number--
        } while (number != 0)
    }


//    var factorial: Int = 1
    fun recursiveExample(number: Int): Int {
        if (number == 0)
            return 1
        else
//            factorial *= number
       return  number * recursiveExample(number - 1)
        }


fun recursiveExample1(number: Int): Int {
    if (number == 0)
        return 1
    else
    return  number * recursiveExample1(number - 1)
}
}


fun main(args:Array<String>) {
    var doWhileExample = DoWhileExample()
   // doWhileExample.reverseExample()
    //doWhileExample.additionOfNumberExample()
     // doWhileExample.plusAllExample()
    //doWhileExample.primeNumberExample()
    //doWhileExample.factorialNumberExample()
    //doWhileExample.oddevenCountExample()
    println("Please Enter Number")
    var number: Int = Integer.parseInt(readLine())

    println("factorial is = "+ doWhileExample.recursiveExample(number))
}
