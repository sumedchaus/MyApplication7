package com.example.KotlinExamples
interface myinterface {
    var id : Int
    fun absmethod():String
    fun dosomething(){
        println("MyInterface doing some work")
    }
}
class InterfaceImp :myinterface{

    override var id: Int =100
    override fun absmethod(): String {
        return "implementing abstract method"
    }

}
fun main(args: Array< String>){
    var intefaceImpobj = InterfaceImp()
    intefaceImpobj.id
    println(intefaceImpobj.id)
    intefaceImpobj.dosomething()
   println( intefaceImpobj.absmethod())


}