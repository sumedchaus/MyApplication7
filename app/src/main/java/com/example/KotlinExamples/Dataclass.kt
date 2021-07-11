package com.example.KotlinExamples

class Dataclass {

}
fun main(args: Array<String>){
    var user = User(" Sumed ", 7, " first shift")

    println("User Properties:: Name:${user.name}  id:${user.id}  Shift:${user.shift}")


    var village1 = Village("Nagarsoga",5000, 3000)
    var village2 = Village("Ausa",40000, 25000)
    var village3 = Village("Siradhon",4000, 2500)
    var village4= Village("Dapegaon",7000, 3512)
    var village5= Village("Latur",60000, 35000)

    village5.eighteen_plus = 16000

    var village6= Village("Tungi",9000, 4500)
    var village7= Village("Nilanga",17000, 25000)
    var village8= Village("Renapur",45188, 4512)
    var village9= Village("Udgir",17562, 1245)
    var village10= Village("Shirul",3000, 1554)


    println("[Village Data]:   Village Name: ${village1.village_name}      Population: ${village1.population}       Eighteen Plus: ${village1.eighteen_plus}")
    println("[Village Data]:   Village Name: ${village2.village_name}      Population: ${village2.population}       Eighteen Plus: ${village2.eighteen_plus}")
    println("[Village Data]:   Village Name: ${village3.village_name}      Population: ${village3.population}       Eighteen Plus: ${village3.eighteen_plus}")
    println("[Village Data]:   Village Name: ${village4.village_name}      Population: ${village4.population}       Eighteen Plus: ${village4.eighteen_plus}")
    println("[Village Data]:   Village Name: ${village5.village_name}      Population: ${village5.population}       Eighteen Plus: ${village5.eighteen_plus}")
    println("[Village Data]:   Village Name: ${village6.village_name}      Population: ${village6.population}       Eighteen Plus: ${village6.eighteen_plus}")
    println("[Village Data]:   Village Name: ${village7.village_name}      Population: ${village7.population}       Eighteen Plus: ${village7.eighteen_plus}")
    println("[Village Data]:   Village Name: ${village8.village_name}      Population: ${village8.population}       Eighteen Plus: ${village8.eighteen_plus}")
    println("[Village Data]:   Village Name: ${village9.village_name}      Population: ${village9.population}       Eighteen Plus: ${village9.eighteen_plus}")
    println("[Village Data]:   Village Name: ${village10.village_name}     Population: ${village10.population}      Eighteen Plus: ${village10.eighteen_plus}")



}
