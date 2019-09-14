package com.hackerearth.solution

/**
 * You are provided an integer . Your task is to determine the largest integer  () that is a coprime of . This implies that .

Input format

A single line that contains an integer

Output format

Print the answer to the question.

Constraints



 */
fun main(args: Array<String>) {
    var input = readLine()!!.toInt()
    for (i in input - 2 downTo 1) {
        var gcd = getGcd(input, i)
        if (gcd == 1) {
            println(i)
            break
        }
    }
}

fun getGcd(a: Int, n: Int): Int {
    return if (n == 0) {
        a
    } else {
        getGcd(n, a % n)
    }
}