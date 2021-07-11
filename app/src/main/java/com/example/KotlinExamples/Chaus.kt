package com.example.KotlinExamples

open class Chaus {
    fun grandfather() {
        println("grandfater name is Saeed Chaus")

    }
}

    class Father: Chaus() {

        fun uncle() {
            println("uncle's name is abubakar")

        }

        fun father() {
            println("my father's name is hasan")
        }
    }
    class Son: Chaus(){
        fun son(){
        println("my name is Sumed")
        }
    }
fun main(args: Array<String>) {
    val fatherObj = Father()
    fatherObj.uncle()
    fatherObj.father()
    val sonObj = Son()
    sonObj.son()
    fatherObj.grandfather()
    sonObj.grandfather()
    val chausobj = Chaus()
    chausobj.grandfather()

}



