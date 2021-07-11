package com.example.KotlinExamples

class ArrayExample {
    fun duplicateNumber() {
        var myArray1 = arrayOf<Int>(546, 56, 1, 65, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)

        for (i in 0 until myArray1.size) {  // take one element in array 14 times
            for (j in i + 1 until myArray1.size) {  // take all remaining elements in array except ith element
                if (myArray1[i] == myArray1[j])  // compare ith and jth element
                    println("Duplicate element " + myArray1[j])
            }
        }
    }

    fun largestNumber() {
        var myArray = arrayOf<Int>(642, 48, 6, 48, 4, 65, 1, 6184, 94, 49, 80)
        var largest = myArray[0]
        for (i in 0 until myArray.size) {
            if (largest < myArray[i]) {
                largest = myArray[i]
            }
        }
        println("largest Number = " + largest)

    }

    fun smallestNumber() {
        var myArray = arrayOf<Int>(642, 48, 6, 48, 4, 65, 1, 6184, 94, 49, 80)
        var small = myArray[0]
        for (i in 0 until myArray.size) {
            if (small > myArray[i])
                small = myArray[i]
        }
        println("Smallest Number = " + small)
    }

    fun removeDuplicateNumber() {
        var myArray = arrayOf<Int>(56, 56, 1, 65, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)

        for (i in 0 until myArray.size) {
            var flag = true
            for (j in i + 1 until myArray.size) {
                if (myArray[i] == myArray[j]) {
                    flag = false
                }
            }
            if (flag == true)
                println("Removed Duplicate element " + myArray[i])
        }

    }


    fun secondLargestNumber() {
        var myArray =
            arrayOf<Int>(64, 48, 6, 485, 4, 501, 55555, 499, 65, 487, 1, 6184, 94, 49, 80, 486, 500)
        var large = myArray[0]
        var second_Large = myArray[0]
        var third_Large = myArray[0]

        for (i in 0 until myArray.size) {
            if (large < myArray[i]) {
                third_Large = second_Large
                second_Large = large
                large = myArray[i]
            } else if (second_Large < myArray[i]) {
                third_Large = second_Large
                second_Large = myArray[i]
            } else if (third_Large < myArray[i]) {
                third_Large = myArray[i]
            }
        }
        println("Large Number" + large)
        println(" Second Large Number" + second_Large)
        println(" Third Large Number" + third_Large)

    }

    fun firstRepeatingNumber() {
        var myArray = arrayOf<Int>(3, 1, 65, 5, 4, 56, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        sumed@ for (i in 0 until myArray.size) {
            for (k in i + 1 until myArray.size) {
                if (myArray[i] == myArray[k]) {
                    println("firstRepeatingNumber" + myArray[i])
                    break@sumed
                }
            }
        }
    }

    fun ascendingOrderNumber() {
        var myArray = arrayOf<Int>(1, 48, 6, 46, 4, 1, 6, 6, 65, 10, 6184)
        for (i in 0 until myArray.size) {
            for (j in i + 1 until myArray.size)
                if (myArray[i] > myArray[j]) {
                    var temp = myArray[i]
                    myArray[i] = myArray[j]
                    myArray[j] = temp
                }
            println("ascending Order: " + myArray[i])

        }
//        for (k in 0 until myArray.size)  // remove this loop and print ascending values
//            println(myArray[k])
    }

    fun descendingOrderNumber() {
        var myArray = arrayOf<Int>(1, 48, 6, 46, 4, 1, 6, 6, 65, 10, 6184)
        for (i in 0 until myArray.size) {
            for (j in i + 1 until myArray.size)
                if (myArray[i] < myArray[j]) {
                    var temp = myArray[i]
                    myArray[i] = myArray[j]
                    myArray[j] = temp
                }
            println("descending Order: " + myArray[i])

        }
//        for (k in 0 until myArray.size)   // remove this loop and print descending values
//            println(myArray[k])
    }


    fun compareArray() {
        var myArray1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        var myArray2 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        var flag = true

        for (i in 0 until myArray1.size) {
            if (myArray1[i] != myArray2[i])
                flag = false
        }

        if (flag)
            println("equal")
        else
            println("not equal")
    }


    fun bubbleSort() {
        var myArray = arrayOf<Int>(9, 6, 46, 4, 1, 45, 6, 65, 10, 6184)
        for (i in 0 until myArray.size) {
            for (j in i + 1 until myArray.size) {
                if (myArray[i] > myArray[j]) {
                    var temp = myArray[i]
                    myArray[i] = myArray[j]
                    myArray[j] = temp
                }
            }
            println("bubble Sort : " + myArray[i])
        }
        // for (k in 0 until myArray.size)  // remove this loop and print ascending values
        //   println(myArray[k])

    }


    fun consecutiveNumbers() {

//     var myArray = arrayOf<Int>(9, 6, 46, 4, 1, 2, 3, 45, 6, 1, 2, 3, 4, 5, 6, 7, 65, 10, 1, 2, 3, 4, 5, 6184)
        var myArray = arrayOf<Int>(
            9,
            6,
            46,
            4,
            1,
            2,
            3,
            45,
            6,
            1,
            2,
            3,
            4,
            65,
            10,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            6184,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10
        )
        var consecutiveCounter = 1 // ex in above array 1 to 10 is largest consecutive number
        var counter: Int = 1

        for (i in 0 until myArray.size - 1) {
            if (myArray[i] == myArray[i + 1] - 1)
//            if(myArray[i] - myArray[i+1] == -1)
                counter++
            else {
                if (counter > consecutiveCounter)
                    consecutiveCounter = counter
                counter = 1
            }
        }

        if (counter > consecutiveCounter)
            consecutiveCounter = counter

        println("Largest consecutive count = " + consecutiveCounter)
    }

    fun fizzbuzz() {

        var num = 15
        for (num in 1..num) {
            // Short-circuit operator is used
            if (num % 3 == 0) {
                println("fizz")
            } else if (num % 5 == 0) {
                println("buzz")
            } else if (num % 5 != 0 || num % 3 != 0) {
                println("$num")
            }
        }
    }
}




fun main(args: Array<String>) {
    var arrayExample = ArrayExample()
//    arrayExample.duplicateNumber()
//    arrayExample.largestNumber()
//    arrayExample.smallestNumber()
//    arrayExample.removeDuplicateNumber()
//    arrayExample.secondLargestNumber()
//    arrayExample.firstRepeatingNumber()
//    arrayExample.ascendingOrderNumber()
//    arrayExample.descendingOrderNumber()
//    arrayExample.bubbleSort()
//    arrayExample.compareArray()
//    arrayExample.consecutiveNumbers()
      arrayExample.fizzbuzz()
}
