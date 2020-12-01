package com.senix22.parimatchtech


fun main(args: Array<String>) {
    firstMethood()

}
fun firstMethood(): Unit{
    for(i in 1..100){
        if(i%3 == 0){
            println("Piff ")
        }
        else if(i%5 == 0){
            println("Paff")
        }

    }
}
fun secondMethod(){
    var i = 0
    while( i < 101){
        i++
        if(i%3 == 0){
            println("Piff ")
        }
        else if(i%5 == 0){
            println("Paff")
        }
    }

}