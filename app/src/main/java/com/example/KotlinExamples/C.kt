package com.example.KotlinExamples
interface Myinterface11 {
    fun dosomething() {
        println("my interface11 is running")
    }
        fun something(stop: String) {
            println("My interface11 is $stop")
        }


}
interface Myinterface22{
    fun dosomething(){
        println("my interface22 is running")

    }
    fun something()
}
class C:Myinterface11,Myinterface22 {
    override fun dosomething() {
        super<Myinterface11>.dosomething()

    }

    override fun something() {

    }

    override fun something(stop:String) {
        super<Myinterface11>.something(stop)

println()
    }


    }

class D: Myinterface22{
    override fun something() {

        println("hello world")
    }
}


fun main(args:Array<String>){
    var cObj = C()

    cObj.dosomething()
    cObj.something()
    cObj.something("stop")

    var dObj = D()
    dObj.something()
    dObj.dosomething()

}