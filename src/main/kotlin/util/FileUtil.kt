package util

import java.io.File

class FileUtil(val path: String) {
    fun lines(): List<String> = File(path).readLines()
    fun ints(): List<Int> = lines().map { Integer.parseInt(it) }.toList()
}