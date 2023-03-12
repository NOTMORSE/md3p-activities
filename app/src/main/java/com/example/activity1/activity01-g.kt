package com.example.activity1

import java.util.*

fun main() {
    while (true) {
        print("Enter a string (or 'exit' to quit): ")
        val inputString = readLine()!!.lowercase(Locale.getDefault())

        if (inputString == "exit") {
            break
        }

        var isPalindrome = true
        var leftIndex = 0
        var rightIndex = inputString.length - 1

        while (leftIndex < rightIndex) {
            if (inputString[leftIndex] != inputString[rightIndex]) {
                isPalindrome = false
                break
            }
            leftIndex++
            rightIndex--
        }

        if (isPalindrome) {
            println("Palindrome")
        } else {
            println("Not Palindrome")
        }
    }
}

