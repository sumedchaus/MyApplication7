package com.example.KotlinExamples

open class Bird(var name: String) {
    open var colour = "black"
    fun colour(){
        println("bird colour is $colour")
    }
    open fun fly(){
        println("bird is flying with $name")


    }
}
class Duck(var name1: String) :Bird(name = "Carrot") {
    override var colour = "white"
     override fun fly() {
         super.fly()
         super.colour()
         println("$name1 is flying")

     }

}
class Parrot(var name2:String):Bird(name = "Carrot") {
    override var colour = "green"
    override fun fly() {
        super.colour()
        println("$name2 is flying")

    }
}


    fun main(args: Array<String>) {
        val duckObj = Duck("Duck")
        duckObj.fly()

        println("duck colour is "+ duckObj.colour)



        val parrotobj = Parrot("Parrot")
        parrotobj.fly()
        println("the parrot colour is " + parrotobj.colour)


        val marks = arrayOf(45,84,2,6,84,848,55)
        for (number in marks)
            println(number)
        for(item in marks.indices)
            println("$item: "+ marks[item])


        print("for (i in 1..5) print(i)=")
        for (i in 1..5) print(i)
        println()
        print("for (i in 5..1) print(i)=")
        for (i in 5..1) print(i)
        println()
        print("for (i in 5 downTo 1) print(i)=")
        for (i in 5 downTo 1) print(i)
        println()



//        print("for (i in 5 downTo 1) print(i) = ")
//        for (i in 5 downTo 1) print(i)
//        println()
//        print("for (i in 5 downTo 2) print(i) = ")
//        for (i in 5 downTo 2) print(i)
//        println()
//        print("for (i in 1..5 step 2) print(i) = ")
//        for (i in 1..5 step 2) print(i)
//        println()
//        print("for (i in 5 downTo 1 step 2) print(i) = ")
//        for (i in 5 downTo 1 step 2) print(i)


//        val marks = arrayOf(80,85,60,90,70)
//        for(item in marks)
//            println(item)

}





















//open class Bird {
//    open fun fly() {
//        println("Bird is flying...")
//    }
//}
//class Parrot: Bird() {
//
//}
//class Duck: Bird() {
//
//}
//fun main(args: Array<String>) {
//    val p = Parrot()
//    p.fly()
//    val d = Duck()
//    d.fly()