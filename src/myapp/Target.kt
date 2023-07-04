package myapp

fun main() {
    println("Hello world")
    val numbers = IntArray(4)
    numbers[0] = 2
    numbers[1] = 7
    numbers[2] = 11
    numbers[3] = 15
    val target = 9;
    val sums = getIndices(numbers, target)
//    val sums = twoSums(intArrayOf( 1, 2, 3, 4), 5)

    println("${sums[0]} and  ${sums[1]}")
}

fun getIndices(nums: IntArray, target: Int): IntArray {

    val indices = IntArray(2)
    val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val sub = target - nums.get(i)
            println("Nums[i] : {${nums.get(i)} SUb : $sub")
            map.put(nums[i],sub)
        }
    map.forEach { item ->
        println("MAp key ${item.key} value : ${item.value}")
    }
    return indices
}