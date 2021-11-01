package Aquarium

import Spice.SimpleSpice

fun main (args: Array<String>){
    buildAquarium()
//    buildSpices()
}

fun buildSpices(){
    val mySpice = SimpleSpice()

    print("name: ${mySpice.name} " +
            "heat: ${mySpice.heat}")
}

fun buildAquarium(){
    val myAquarium = Aquarium()

    println("length: ${myAquarium.length} " +
            "width: ${myAquarium.width} " +
            "height: ${myAquarium.height} ")

    println("volume: ${myAquarium.volume} ")

    val smallAquarium = Aquarium(20,15,30)
    println("small volume: ${smallAquarium.volume} liters ")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Small Aquarium 2: ${myAquarium2.volume} liters with " +
            "length: ${myAquarium2.length} " +
            "width: ${myAquarium2.width} " +
            "height: ${myAquarium2.height} ")
}