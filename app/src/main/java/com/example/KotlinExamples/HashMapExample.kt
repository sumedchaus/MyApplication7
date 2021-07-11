package com.example.KotlinExamples

class HashMapExample {
    fun duplicateNumber() {
        var myHashMap = hashMapOf<Int, String>(1 to "Sumed", 9 to "Ace", 3 to "Sumed", 4 to "demon")
        myHashMap.put(5, "deepak")
        myHashMap.put(16, "mukesh")
        myHashMap.put(7, "ajay")
        myHashMap.put(7, "siri")
        var duplicateHashMap = hashMapOf<Int, String>()

        for (key in myHashMap.keys) {
            if (!duplicateHashMap.containsValue(myHashMap.get(key))) {
                duplicateHashMap.put(key, myHashMap.getValue(key))
            } else
                println("duplicate Values: " + myHashMap.get(key))
        }
    }


    fun largestNumber() {
        var myHashmap = hashMapOf<Int, Int>(1 to 5, 6 to 8, 4 to 7, 3 to 6, 8 to 3, 7 to 7)
        myHashmap.put(2, 10)
        myHashmap.put(9, 5)
        myHashmap.put(9, 25)
        var largest = myHashmap.getValue(1)

        for (key in myHashmap.keys) {
            if (largest < myHashmap.get(key)!!)
                largest = myHashmap.get(key)!!
        }
        println("largest Number = $largest ")
    }

    fun smallestNumber() {
        var myHashmap = hashMapOf<Int, Int>(1 to 5, 6 to 8, 4 to 7, 3 to 6, 8 to 3, 7 to 7)
        myHashmap.put(2, 10)
        myHashmap.put(9, 5)
        myHashmap.put(9, 25)
        var small = myHashmap.getValue(1)

        for (key in myHashmap.keys) {
            if (small > myHashmap.get(key)!!)
                small = myHashmap.get(key)!!
        }
        println("Smallest number = $small")
    }


    fun ascendingOrderNumber() {
        var myHashmap = hashMapOf<Int, Int>(1 to 5, 6 to 8, 4 to 7, 3 to 6, 8 to 3, 7 to 7)
        myHashmap.put(2, 10)
        myHashmap.put(9, 5)
        myHashmap.put(9, 25)


        var value = myHashmap.toList().sortedBy { (key, value)-> value }.toMap()
        println("ascending Order Values: " + value)
        println("ascending Order keys " + myHashmap.toSortedMap())
    }


    fun descendingOrderNumber() {
        var myHashmap = hashMapOf<Int, Int>(1 to 5, 6 to 8, 4 to 7, 3 to 6, 8 to 3, 7 to 7)
        myHashmap.put(2, 10)
        myHashmap.put(9, 5)
        myHashmap.put(9, 25)


        var value = myHashmap.toList().sortedByDescending { (key, value)-> value }.toMap()
        var value1 = myHashmap.toList().sortedByDescending { (key, value)-> key }.toMap()
        println(" Decending Order values : " + value)
        println("Decending Order keys : $value1 ")

    }


    fun firstReaptingVales() {
        var myHashmap = hashMapOf<Int, Int>(1 to 5, 6 to 8, 4 to 7, 3 to 6, 8 to 3, 7 to 7, 5 to 5)
        myHashmap.put(2, 10)
        myHashmap.put(9, 5)
        myHashmap.put(9, 25)
        var duplicateHashMap = hashMapOf<Int, Int>()

        for (key in myHashmap.keys) {
            if (!duplicateHashMap.containsValue(myHashmap.get(key)))
                duplicateHashMap.put(key, myHashmap.getValue(key))
             else {
                println("first repeating Number : " + myHashmap.get(key))
                break
            }
        }
    }


    fun secondLargestNumber(){
        var myHashmap = hashMapOf<Int, Int>(1 to 5, 6 to 8, 4 to 7, 3 to 6, 8 to 3, 7 to 7, 5 to 5)
        myHashmap.put(2, 10)
        myHashmap.put(9, 5)
        myHashmap.put(9, 25)
        var large = myHashmap.getValue(1)
        var second_large = myHashmap.getValue(1)

        for (key in myHashmap.keys){
            if (large < myHashmap.get(key)!!){
                second_large = large
                large = myHashmap.get(key)!!
            }
            else {
                if (second_large < myHashmap.get(key)!!)
                    second_large = myHashmap.get(key)!!
            }
        }
        println("second_largest Number = " + second_large)
    }


    fun removeDuplicate(){
        var myHashmap = hashMapOf<Int, Int>(1 to 5, 2 to 8, 3 to 7, 4 to 6, 5 to 3, 6 to 7, 7 to 5)
        myHashmap.put(8, 8)
        myHashmap.put(9, 5)
        myHashmap.put(10, 25)
        var duplicateHashMap = hashMapOf<Int, Int>()

        for (key in myHashmap.keys) {
            if (!duplicateHashMap.containsValue(myHashmap.get(key))) {
                duplicateHashMap.put(key, myHashmap.getValue(key))
                println(" Remove Duplicate Values: " + " $key key :  "+ duplicateHashMap.get(key))
            }
        }
    }
}



fun main(args:Array<String>){
    var hashMapExample = HashMapExample()
//    hashMapExample.duplicateNumber()
//    hashMapExample.largestNumber()
//    hashMapExample.smallestNumber()
//    hashMapExample.ascendingOrderNumber()
//    hashMapExample.firstReaptingVales()
//    hashMapExample.descendingOrderNumber()
//    hashMapExample.secondLargestNumber()
    hashMapExample.removeDuplicate()


}
