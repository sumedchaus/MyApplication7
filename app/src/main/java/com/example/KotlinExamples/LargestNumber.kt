package com.example.KotlinExamples

class LargestNumber {
    fun bigNumber() {
//        println("first num")
//        var num1: Int = Integer.parseInt(readLine())
//        println("second number")
//        var num2: Int = Integer.parseInt(readLine())
//        println("third number")
//        var num3: Int = Integer.parseInt(readLine())
//        println("fourth number")
//        var num4: Int = Integer.parseInt(readLine())
//
//        if (num1 > num2 && num1 > num3) {
//            if (num1 > num4)
//                println("$num1 is greater")
//            else {
//                println("$num4 is greater")
//            }
//        } else {
//            if (num2 > num3) {
//                if (num2 > num4)
//                    println("$num2 is greater")
//                else {
//                    println("$num4 is greatr")
//                }
//
//            } else {
//                if (num3 > num4)
//                    println("$num3 is greater")
//                else {
//                    println("$num4 is greater")
//                }
//            }
//        }
    }

    fun areaOfCircle(): Double {
        println("enter radius for circle")
        var radius = readLine()?.toFloat()

        var area = 3.14 * radius!! * radius

        return area

    }

    fun areaOfRectangle(): Float {
        println("enter length for rectangle ")
        var length = readLine()?.toFloat()
        println("enter width for triangle ")
        var width = readLine()?.toFloat()

        var RectangleArea = length!! * width!!

        return RectangleArea
    }
    fun areaOfTriangle(): Float {
        println("enter hight for triangle ")
        var length = readLine()?.toFloat()
        println("enter width for triangle ")
        var width = readLine()?.toFloat()

        var triangleArea = (length!! * width!!) / 2

        return triangleArea
    }
}






fun main(args: Array<String>) {
    var largestNumber = LargestNumber()
    largestNumber.bigNumber()
    var areaOfCircle =largestNumber.areaOfCircle()
    println("Area of circle = "+ areaOfCircle)
    var areaOfRectangle = largestNumber.areaOfRectangle()
    println("Area of rectangle = "+ areaOfRectangle)
    var areaOfTriangle = largestNumber.areaOfTriangle()
    println("Area of triangle = "+ areaOfTriangle)

}

//        val result = if (num1 > num2 && num1 > num3) {    (using if else for 3 number)
//            println("$num1 is greater")
//        } else if (num2 > num3 && num2 > num1) {
//            println("$num2 is greater")
//        } else {
//            println("$num3 is greater")


//val result = if (num1 > num2 && num1 > num3 && num1 > num4) {
//    println("$num1 is greater")
//} else if (num2 > num3 && num2 > num4) {   (using if else ladder for four number)
//    println("$num2 is greater")
//} else if (num3 > num4){
//    println("$num3 is greater")}
//else {
//    println("$num4 is greaater")





























