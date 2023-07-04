package myapp


fun main() {
reverse()
}

fun reverse(){
    var myName = "My name is Anusha"
    var name = myName.split(" ")
    println("${name[0]}")

myName = name[name.size]
    for (n in name){
        myName = String.format(myName,)
    }
}

//fun fibonocci(){
//    var num= 5;
//    val series = IntArray(num)
//    val fib1 =0
//    val fib2 =1
//    series[0] = fib1
//    series[1] = fib2
//    var i = 2
//    do {
//        series[i] = series[i-1] + series[i-2]
//        i++
//    }while (i<5)
//    println("Fibonocci series till 5 : ")
//    for (j in series){
//        println(j)
//    }
//}
//
//internal object fibonacci {
//    fun fib(n: Int): Int {
//        return if (n <= 1) n else fib(n - 1) + fib(n - 2)
//    }
//
//    @JvmStatic
//    fun main(args: Array<String>) {
//        val n = 9
//        println(fib(n))
//    }
//}



fun fiboR(firstNum : Int,secondNum : Int){
    println()
}
//fun twoSums(nums: IntArray, target: Int): IntArray {
//    var values = IntArray(2)
//    for (i in nums.indices) {
//        val temp = target - nums[i]
//        for (j in i+1 until nums.size) {
//            if (nums[j] == temp) {
//                values[0] = i
//                values[1] = j
//                return values
//            }
//        }
//    }
//    return values
//}