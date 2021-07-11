package com.example.KotlinExamples

class ArrayListExample {
    fun duplicateNumber() {
        var myArray = arrayListOf<Int>(546, 56, 1, 65, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        myArray.set(0, 1)
        for (i in 0 until myArray.size) {
            for (j in i + 1 until myArray.size) {
                if (myArray.get(i) == myArray.get(j))
                    println("Duplicate Element :" + myArray.get(i))
            }
        }
    }


    fun largestNumber() {
        var myArray = arrayListOf<Int>(546, 56, 1, 65, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        var largest = myArray[0]
        for (i in 0 until myArray.size) {
            if (largest < myArray[i]) {
                largest = myArray[i]
            }
        }
        println("largest Number = " + largest)
    }


    fun smallestNumber() {
        var myArray = arrayListOf<Int>(546, 56, 1, 65, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        var small = myArray[0]
        for (i in 0 until myArray.size) {
            if (small > myArray[i])
                small = myArray[i]
        }
        println("Smallest Number = " + small)
    }


    fun secondLargest() {

        var myArray =
            arrayListOf<Int>(54, 56, 1, 65, 2, 546, 5425, 4, 8, 2, 566, 6, 46, 588, 89, 16, 46)
        var second_largest = myArray[0]
        var largest = myArray[0]
        for (i in 0 until myArray.size)
            if (myArray.get(i) > largest) {
                second_largest = largest
                largest = myArray.get(i)
            } else if (myArray.get(i) > second_largest)
                second_largest = myArray.get(i)
        println("second largest = " + second_largest)
    }


    fun ascendingOrderNumber() {
        var myArray = arrayListOf<Int>(1, 48, 6, 46, 4, 1, 6, 6, 65, 10, 6184)

        for (i in 0 until myArray.size) {
            for (j in i + 1 until myArray.size) {
                if (myArray.get(i) > myArray.get(j)) {
                    var temp = myArray.get(i)
                    myArray[i] = myArray.get(j)
                    myArray[j] = temp
                }
            }
            println("ascending Order =" + myArray.get(i))
        }
    }


    fun decendingOrderNumber() {
        var myArray = arrayListOf<Int>(1, 48, 6, 46, 4, 1, 6, 6, 65, 10, 6184)

        for (i in 0 until myArray.size) {
            for (j in i + 1 until myArray.size) {
                if (myArray.get(i) < myArray.get(j)) {
                    var temp = myArray.get(i)
                    myArray[i] = myArray.get(j)
                    myArray[j] = temp
                }
            }
            println("decending Order =" + myArray.get(i))
        }
    }


    fun compareArray() {
        var myArray1 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 45,15)
        var myArray2 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 45)
        var flag = true

        if(myArray1.size == myArray2.size) {
            for (i in 0 until myArray1.size) {
                if (myArray1.get(i) != myArray2.get(i)) {
                    flag = false
                    break
                }
            }
            if (flag)
                println("Array are equal")
            else
                println(" Array are not equal")
        }
        else
            println(" Array are not equal")
    }

    fun removeDuplicateNumber() {
        var myArray = arrayListOf<Int>(546, 56, 1, 65, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        for (i in 0 until myArray.size) {
            var flag = true
            for (j in i + 1 until myArray.size) {
                if (myArray.get(i) == myArray.get(j))
                    flag = false
            }
            if (flag == true)
                println("Duplicate Element :" + myArray.get(i))
        }
    }


    fun consecativeNumber() {

        var myArray =arrayListOf<Int>(1, 2, 3, 5, 6, 1, 2, 3, 4, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 6, 5)
        var counter = 1
        var consecativecounter = 1

        for (i in 0 until myArray.size-1){
            if (myArray.get(i) - myArray.get(i+1) == -1){
                counter++
            }
            else{
                if(counter > consecativecounter)
                    consecativecounter = counter
                counter = 1
            }
        }

        if(counter > consecativecounter)
            consecativecounter = counter

        println("Largest consecutive count = " + consecativecounter)
    }

}




fun main(args: Array<String>){
    var arrayListExample = ArrayListExample()
    //arrayListExample.duplicateNumber()
   // arrayListExample.secondLargest()
//    arrayListExample.ascendingOrderNumber()
   // arrayListExample.decendingOrderNumber()
//    arrayListExample.largestNumber()
//    arrayListExample.smallestNumber()
    arrayListExample.compareArray()
//arrayListExample.removeDuplicateNumber()
// arrayListExample.consecativeNumber()
}