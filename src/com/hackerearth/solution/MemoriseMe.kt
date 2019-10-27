package com.hackerearth.solution

/**
 * https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/memorise-me/
 */
fun main(stringArgs: Array<String>) {
    var numberSize = readInt()
    var numberList = readLn().split(" ").map { it.toInt() }

    var numberMap = convertToMap(numberList)

    var querySize = readInt()

    repeat(querySize) {
        var numberToCheck = readInt()
        if (numberMap.containsKey(numberToCheck)) {
            println(numberMap[numberToCheck])
        } else {
            println("NOT PRESENT")
        }
    }
}

fun convertToMap(numberList: List<Int>): Map<Int, Int> {
    var resultMap = HashMap<Int, Int>()

    for (i in 0 until numberList.size) {
        if (resultMap.containsKey(numberList[i])) {
            resultMap[numberList[i]] = resultMap[numberList[i]]!! + 1
        } else {
            resultMap[numberList[i]] = 1
        }
    }
    return resultMap
}

private fun readLn() = readLine()!!

private fun readInt() = readLn().toInt()