package com.example.KotlinExamples

class ImpExample {

    fun patternExample() {

        for (i in 1..5) {
            for (j in 1..i) {

                print(" $j")
            }
            println()
        }
    }

    fun patternExample2() {
        for (i in 5 downTo 1) {
            for (j in 1..i) {

                print(" $j")
            }
            println()
        }
    }

    fun patternExample3() {

        for (i in 1..5) {
            for (j in 1..i) {

                print(" *")
            }
            println()
        }
    }

    fun patternExample4() {
        for (i in 5 downTo 1) {
            for (j in 1..i) {

                print(" *")
            }
            println()
        }
    }

    fun patternExample5() {
        for (i in 1..5) {
            for (j in 1..i) {

                print(" *")
            }
            println()
        }
    }
    fun loopTriangleCounter() {
        var counter = 1
        for (i in 1..4) {    //number of rows
            for(j in 1..i){  //number of columns in each row
                print("" + counter++ + " ")
            }
            println()
        }
    }
    fun loopTriangleAlpha() {
        var counter = 65
        for (i in 1..5) {    //number of rows
            for(j in 1..i){  //number of columns in each row
                print(counter.toChar() + " ")
            }
            counter++
            println()
        }
    }
    fun loopTriangleStar3(){
        var counter = 1
        for (i in 1..5){

            for (j in 1..i){
                print(" ")

            }
            print("*")
            println("*")
        }
    }
}

fun main(args:Array< String>) {
 var impExampleObj = ImpExample()

//    impExampleObj.patternExample()
//    impExampleObj.patternExample2()
//    impExampleObj.patternExample3()
//    impExampleObj.patternExample4()
//    impExampleObj.loopTriangleCounter()
    impExampleObj.loopTriangleAlpha()

impExampleObj.loopTriangleStar3()
}



//    fun loopTriangleStar() {
//        for (i in 1..5) {    //number of rows
//            for(j in 1..i){  //number of columns in each row
//                print("* ")
//            }
//            println()
//        }
//    }
//
//    fun loopTriangleStar1(){
//        for (i in 5 downTo 1){
//            for (j in 1..i){
//                print("* ")
//            }
//            println()
//        }
//    }
//
//    fun loopTriangleCounter() {
//        var counter = 1
//        for (i in 1..4) {    //number of rows
//            for(j in 1..i){  //number of columns in each row
//                print("" + counter++ + " ")
//            }
//            println()
//        }
//    }
//
//    fun loopTriangleAlpha() {
//        var counter = 65
//        for (i in 1..5) {    //number of rows
//            for(j in 1..i){  //number of columns in each row
//                print(counter.toChar() + " ")
//            }
//            counter++
//            println()
//        }
//    }
//
//    fun loopTriangleStar3(){
//        var counter = 1
//        for (i in 1..5){
//
//            for (j in 1..i){
//                print(" ")
//
//            }
////            print("*")
//            println("*")
//        }
//    }
//
//    // Program to check palindrome number
//    fun palindromeNumber() {
//        println("Enter Number")
//        var number: Int = Integer.parseInt(readLine())
//        var reversed = 0
//        var num = number
//        while (number != 0) {
//            val digit: Int = number % 10
//            reversed = reversed * 10 + digit
//            number /= 10
//        }
//        //  println("$reversed")
//
//        if (reversed == number) {
//            println("Number is palindromic number")
//        }else
//            println("Number is  not palindromic number")
//    }
//
//    //Program to check palindrome String
//    fun palindromeString(){
//        println("Enter String")
//        // Reading data using readLine
//        var name: String = BufferedReader(InputStreamReader(System.`in`)).readLine()
//        var reverseString = ""
//        name.length
//        for (i in name.length-1 downTo 0){
//            reverseString += name.get(i)
//        }
//        if (reverseString == name){
//            println("String is palindrome")
//        }else{
//            println("String is not palindrome")
//        }
//    }
//
//    fun factorOfNumber(){
//        var number = 56
//        for (i in 1..number){
//            if (number % i == 0){
//                println("$i")
//            }
//        }
//    }
//
//    fun spyNumber() {
//        println("Please Enter Number")
//        var number: Int = Integer.parseInt(readLine())
//        var addition = 0
//        var multiplcation = 1
//
//        while (number != 0) {
//            var digit = number % 10
//            addition += digit
//            multiplcation *= digit
//            number /= 10
//        }
//        if(addition==multiplcation){
//            println("Number is spy number")
//        }else
//            println("Number is not spy number")
//    }
//
//    //Program to reverse a sentence
//    fun reverseSentence() {
//        println("Enter String")
//        // Reading data using readLine
//        var name: String = BufferedReader(InputStreamReader(System.`in`)).readLine()
//        var reverseString = ""
//        for (i in name.length - 1 downTo 0) {
//            reverseString += name.get(i)
//        }
//        print(reverseString)
//    }
//
//    //program to find armstrong number
//    fun armstrongNumber(){
//        println("Please Enter Number")
//        var number: Int = Integer.parseInt(readLine())
//        var addition = 0
//
//        for (digit in number downTo 1) {
//            var digit = number % 10
//
//        }
////        println("$addition")
//    }
//
//
//    //program to find neon number
//    fun neonNumber(){
//        println("Please Enter Number")
//        var number: Int = Integer.parseInt(readLine())
//        var addition = 0
//        var multiplcation = 1
//        var square = 0
//
//        while (number != 0) {
//            var square = number*number
////            print("$square")
////            break
//            var digit = square%10
//            addition += digit
//            print(addition)
//        }
//    }
//
//}
//fun main(args: Array<String>){
//    var loopexample = LoopExample()
////    loopexample.loopTriangle()
////    loopexample.loopTriangle2()
////    loopexample.loopTriangleStar()
////    loopexample.loopTriangleStar1()
////    loopexample.loopTriangleCounter()
////    loopexample.loopTriangleAlpha()
////    loopexample.loopTriangleStar3()
////    loopexample.palindromeNumber()
////    loopexample.factorOfNumber()
////    loopexample.spyNumber()
////    loopexample.palindromeString()
////    loopexample.reverseSentence()
////    loopexample.armstrongNumber()
//    loopexample.neonNumber()
//
//}




