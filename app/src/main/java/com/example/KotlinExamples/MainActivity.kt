package com.example.KotlinExamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // second example kaun sa hai ?????????????????, tu kuch click mat kar muze code karne de.ok


    }

    private fun ifelseexample1() {
        val num1 = 30
        val num2 = 45
        val num3 = 60
        var max = 0
        if (num1 > num2) {
            if (num1 > num3)
                max = num1
            else max = num3

        } else {
            if (num2 > num3)
                max = num2

            if (num2 > num3)
            else
                max = num3
        }

        println("max of 3 number is" + max)

    }


    private fun ifelseexample() {
        val num1 = 40
        val num2 = 45
        val num3 = 78
        val result = if (num1 > num2) {
            val max = if (num1 > num3) {
                num1
            } else {
                num3
            }
            "body of if" + max

        } else if (num2 > num3) {
            "body of else if" + num2
        } else {
            "body of else " + num3
        }
        println("ifelseexample(): " + " $result")

    }

    private fun funexample2() {
        val marks = arrayOf(80, 85, 60, 90, 70)
        for (item in marks.indices)
            println("funexample2(): marks[$item]: " + marks[item])
        val percentage = arrayOf(45, 85, 47, 65, 75)
        for (item in percentage.indices)
            println("funexample2():: percentage[$item]" + percentage[item])
    }


    private fun funexample1() {
        val percentage = arrayOf(45, 54, 21, 58, 55, 68)
        for (item in percentage)
            println("funexample1():" + item)

    }
}














/*    ifeleseexample()
}

/* private fun ifeleseexample() {

    var num1 = 10
    var num2 = 5
    var result = if (num1 > num2) {
        "$num1 is greater than $num2"
    } else {
        (num1 < num2)
        "$num1 is smaller than $num2"
    }
    println("ifeleseexample()::" + result)

    //whenexample()
    funexample()

}

private fun funexample() {

    val marks = arrayOf(25, 30, 40, 45)
    for (item in marks) {

        println("funexample()::" + item)
        Toast.makeText(this, "funexample()"+ item, Toast.LENGTH_LONG).show()
    }

     fun funexample() {
        //    val marks = arrayOf(80,85,60,90,70)
        //  for(item in marks.indices)
        //    println("marks[$item]: "+ marks[item])
        val percentage = arrayOf(45, 85, 47, 65, 75)
        for (item in percentage.indices)
            println("funexample():: percentage[$item]" + percentage[item])
    }
}
}



/*  private fun whenexample() {

    var number1 = 1
    when (number1) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")

    }


   whenexample()
    var number2 = 2
    when(number2){
        2 -> {
            println("whemexample():: tuesday")
*/





/*   class Account {
        var acc_no: Int = 0
        var name: String =  ""
        var amount: Float = 0.toFloat()
        fun insert(ac: Int,n: String, am: Float ) {
            acc_no=ac
            name=n
            amount=am
            println("Account no: ${acc_no} holder :${name} amount :${amount}")
        }

        fun deposit() {
            //deposite code
        }

        fun withdraw() {
            // withdraw code
        }

        fun checkBalance() {
            //balance check code
        }

    }
    fun main(args: Array<String>){
        Account()
        var acc= Account()
        acc.insert(832345,"Ankit",1000f) //accessing member function
        println("${acc.name}") //accessing class property
    }

*/
 */
 */
 