package com.hackerearth.solution

import java.util.Stack

/**
 * https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/charges-repel/
 */
fun main(stringArgs: Array<String>) {
    var sizeOfString = readInt()
    var input = readLn()

    var container = Stack<Char>()

    for (i in 0 until input.length) {
        if (container.isEmpty()) {
            container.push(input[i])
            continue
        }

        if (container.peek() == input[i]) {
            container.pop()
        } else {
            container.push(input[i])
        }
    }
    var sb = StringBuilder()
    while (container.isNotEmpty()) {
        sb.append(container.pop())
    }

    println(sb.length)
    println(sb.reverse())
}


private fun readLn() = readLine()!!

private fun readInt() = readLn().toInt()