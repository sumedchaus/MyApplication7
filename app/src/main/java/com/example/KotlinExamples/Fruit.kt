package com.example.KotlinExamples

abstract class Fruit {
    abstract fun taste (name:String): String

}
class Mango : Fruit(){
    override fun taste(mangoTaste: String): String {
    return(mangoTaste)
    }
}
class Grapes : Fruit(){
    override fun taste(grapeTaste: String): String {
return grapeTaste
    }
}
fun main(args: Array<String>){
    var mangoobj = Mango()
    var mangotaste = mangoobj.taste("sweet")
    println("the taste of mango is $mangotaste")

    var grapesObj = Grapes()
    var grapestaste =grapesObj.taste("sour")
    println("the taste of grapes is $grapestaste")


}











