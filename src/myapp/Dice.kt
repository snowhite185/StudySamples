package myapp

import kotlin.random.Random
import kotlin.system.exitProcess

class Dice {

    fun roll(): Int {

        return Random.nextInt(1, 6)
    }

    fun continueDice(number: Int): Int {
        if (number == 6) {
            return continueDice(roll())
        } else
            return number
    }

}

fun main() {
    var dice = Dice()
    val numberOnTheDice = dice.roll()
    println("Your dice shows : $numberOnTheDice")

    if (numberOnTheDice == 6) {
        println("You have one more chance to roll the dice. Press Y to continue.. ")
        val input = readLine()!!
        println("You entered : $input")
        if (input == "Y") {
            println("Your dice shows : ${dice.continueDice(6)}")

        } else {
            exitProcess(0)
        }
    }
}