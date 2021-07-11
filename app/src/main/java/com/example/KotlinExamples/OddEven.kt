package com.example.KotlinExamples

class OddEven {
    fun checkOddEven(){
        println("number")

        var num1: Int = Integer.parseInt(readLine())


        if(num1 and 1 == 1)  // bitwise & operator
           println("odd " )
        else
          println("even")
    }
    fun checkOddEven1() {
        println("number")

        //  var num1: Int = Integer.parseInt(readLine())
        var num1 = 5
        var num2 = 1
        var float = false
        while (num2 <= num1) {

            float = true
            num2++

            if (num2 and 1 == 1)  // bitwise & operator
                println("odd ")
            else
                println("even")
        }
    }
}
fun main(args: Array<String>) {
    var oddEven = OddEven()
  //  oddEven.checkOddEven()
    oddEven.checkOddEven1()



    // input 456 output 654
    // input 897 output 798
}