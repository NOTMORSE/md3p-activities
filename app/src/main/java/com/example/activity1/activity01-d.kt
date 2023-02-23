package com.example.activity1


fun main() {
    val inputList = mutableListOf<Double>()
    var count = 1
    while (count <= 5) {
        print("Enter monetary amount $count: ")
        val input = readLine()?.toDoubleOrNull()
        if (input == null || input < 0) {
            println("Invalid input, please enter a positive number.")
        } else {
            inputList.add(input)
            count++
        }
    }
    var divisor: Int?
    do {
        print("Divide the value by how many? ")
        divisor = readLine()?.toIntOrNull()
        if (divisor == null || divisor == 0) {
            println("Invalid input, please enter a non-zero positive integer.")
        }
    } while (divisor == null || divisor == 0)

    val total = inputList.sum()
    val result = total / divisor
    println("The result is: $result")
}








