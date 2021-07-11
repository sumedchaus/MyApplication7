package com.example.KotlinExamples

open class Car{
    open fun run (){
        println("car is running")
    }

}
abstract class Honda: Car() {
    override fun run() {
        super.run()
    }
}

class City():Honda(){

    override fun run() {
        println("honda city is running")
    }
}
fun main(args: Array<String>){
    val City = City()
    City.run()
    val Car = Car()
    Car.run()
}

















//    open class Car {
//        open fun run() {
//            println("Car is running..")
//        }
//    }
//    abstract class Honda : Car() {
//        override abstract fun run()
//    }()
////
//    class City: Honda(){
//        override fun run() {
//            //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            println("Honda City is running..")
//        }
//    }
//    fun main(args: Array<String>){
//        val car = Car()
//        car.run()
//        val city = City()
//        city.run








