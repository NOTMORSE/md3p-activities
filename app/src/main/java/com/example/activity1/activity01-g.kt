package com.example.activity1

fun main() {
    while (true) {
        print("Enter a string (or 'quit' to exit): ")
        val input = readLine()!!.trim()

        if (input == "quit") {
            break
        }

        val reversed = input.reversed()

        if (input == reversed) {
            println("Palindrome")
        } else {
            println("Not Palindrome")
        }
    }
}
