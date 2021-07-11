package com.example.KotlinExamples

abstract class Bank {
    abstract fun simpleinterest(p:Int, r:Double, t:Int):Double
    }
class SBI:Bank(){
    override fun simpleinterest(p: Int, r: Double, t: Int): Double {
return(p*r*t)/100
    }
}
class PNB:Bank(){
    override fun simpleinterest(p: Int, r: Double, t: Int):Double {
   return (p*r*t)/100
    }
}
fun main (args:Array<String>){
    var sbiobj = SBI()
  var sbiTotal =  sbiobj.simpleinterest(1000,5.0,3)

    println("simpleinterest of sbi bank is " + sbiTotal)

    var pnbobj = PNB()
    var pnbTotal = pnbobj.simpleinterest(1000,4.5,3)
    println("simpleinterest of pnb bank is " + pnbTotal)




}

