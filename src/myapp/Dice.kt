package myapp

import kotlin.system.exitProcess

class Dice {
    var diceNumbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

    fun rollTheDice(): Int {
        val values = diceNumbers.toList()
        return values.shuffled()[0]
    }

    fun continueDice(number: Int): Int {
        if (number == 6) {
            return continueDice(6)
        } else
            return number
    }
}

fun main() {
    var dice = Dice()
    val numberOnTheDice = 6
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