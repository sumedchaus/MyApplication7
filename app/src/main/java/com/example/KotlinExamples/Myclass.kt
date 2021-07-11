package com.example.KotlinExamples
 class Myclass: Myinterface1, Myinterface2 {

    override fun dosomething(){
        super<Myinterface2>.dosomething()
    }

     override fun absmethod(name: String) {
         println("hello $name")
     }

 }
fun main(args: Array<String>){
    var myclassObj = Myclass()

    myclassObj.dosomething()

    myclassObj.absmethod()
     myclassObj.absmethod("sumed")

}
interface Myinterface1{
    fun dosomething(){
        println("overriding interface of myinterface1 do something")

    }
    fun absmethod(name:String)


}
interface Myinterface2 {
    fun dosomething() {
        println("overriding interface of myinterface2 do something")
    }

    fun absmethod() {
        println("00000000helllooooo")
    }
}