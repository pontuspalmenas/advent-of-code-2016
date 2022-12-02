package day01

import util.FileUtil

fun main(args: Array<String>) {
    val l = FileUtil("input/day01.txt").lines()
    println(solve1(l))
}

fun solve1(lines: List<String>): Int {
    val x = 0
    val y = 0

    lines.forEach {
        val a = it.take(1)
        val b = it.substring(1)

    }
}