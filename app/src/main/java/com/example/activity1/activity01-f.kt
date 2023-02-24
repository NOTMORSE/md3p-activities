package com.example.activity1

import java.util.*


fun main() {
    var uniqueChars = ""
    var str1: String
    var str2: String

    while (true) {
        print("Enter string 1 (or type 'exit' to quit): ")
        str1 = readLine() ?: ""
        if (str1.lowercase(Locale.getDefault()) == "exit") break

        println("Enter string 2: ")
        str2 = readLine() ?: ""

        for (char in str1 + str2) {
            if (char !in uniqueChars) {
                uniqueChars += char
            }
        }

        print("Unique characters: $uniqueChars\n")
        uniqueChars = ""
    }
}
