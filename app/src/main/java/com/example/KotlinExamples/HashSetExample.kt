package com.example.KotlinExamples

import java.util.*
import kotlin.collections.HashSet

class HashSetExample {

    fun ascendingDescendingOrder() {
        var myHashSet = hashSetOf<Int>(546, 56, 1, 65, 1, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        myHashSet.add(5)
        var hashSet = HashSet<Int>(6)
        hashSet.add(2)
        hashSet.add(13)
        hashSet.add(6)
        hashSet.add(5)
        hashSet.add(2)
        hashSet.add(8)
        println("ASCENDING Order = " + myHashSet.sortedBy { it })
        println("Descending Order = " + myHashSet.sortedByDescending { it })
    }


    fun largestNumber(): Int {
        var myHashSet = hashSetOf<Int>(54, 56, 1, 65, 1, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        var largest = myHashSet.elementAt(0)
        for (element in myHashSet)
            if (largest < element) {
                largest = element
            }
        return largest
    }


    fun smallestNumber(): Int {
        var myHashSet = hashSetOf<Int>(54, 56, 1, 65, 1, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        var smallest = myHashSet.elementAt(0)
        for (element in myHashSet)
            if (smallest < element) {
                smallest = element
            }
        return smallest
    }


    fun secondLargestNumber(): Int {
        var myHashSet = hashSetOf<Int>(54, 56, 1, 65, 1, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        var largest = myHashSet.elementAt(0)
        var second_largest = myHashSet.elementAt(0)
        for (element in myHashSet)
            if (largest < element) {
                second_largest = largest
                largest = element
            } else {
                second_largest < element
                second_largest = element
            }
        return second_largest
    }

    fun compareExample() {
        var myHashSet1 = hashSetOf<Int>(54, 56, 1, 65, 1, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        var myHashSet2 = hashSetOf<Int>(54, 56, 1, 65, 1, 2, 546, 4, 8, 2, 6, 46, 89, 16, 46)
        var flag = true
        if (myHashSet1 == myHashSet2) {
            for (element in myHashSet1) {
                if (myHashSet1 != myHashSet2) {
                    flag = false
                    break
                }
            }
                if (flag)
                    println("Hashmap Are Equal")
                else
                    println(" Hashmap Are Not Equal")
        } else
            println("Hashmap Are Not Equal")
    }


    fun consecativeNumber() {

        var myHashSet = hashSetOf<Int>(1, 2, 3, 5, 6, 1, 2, 3, 4, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 6, 5)
        var counter = 1
        var consecativecounter = 1

        for (i in 0 until myHashSet.size){
            if (myHashSet.elementAt(i) - myHashSet.elementAt(i+1) == -1){
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
    var hashSetExample = HashSetExample()
//hashSetExample.ascendingDescendingOrder()
//println("smallest number is " +hashSetExample.smallestNumber())
//println("Largest number is " +hashSetExample.largestNumber())
//println("Second Largest number is " +hashSetExample.secondLargestNumber())
//    hashSetExample.compareExample()
    hashSetExample.consecativeNumber()

}