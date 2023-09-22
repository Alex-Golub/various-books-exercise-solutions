package org.mrdrprof.solutions

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val isRightEquation = { a: Int, b: Int, c: Int -> a * b == c }

    println(isRightEquation(a, b, c))
}
