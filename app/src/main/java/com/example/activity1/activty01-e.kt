package com.example.activity1

import java.util.*

fun main() {

    println("Enter a list of student names, separated by commas:")
    val input1 = readLine() ?: ""
    val studentsArray = input1.split(",").map { it.trim() }.toTypedArray()
    println("The array of student names is: ${studentsArray.contentToString()}")

    print("Enter a list of student scores, separated by commas:")
    val input2 = readLine() ?: ""
    val scoresList = input2.split(",").map { it.trim().toInt() }.toCollection(ArrayList())
    println("The ArrayList of student scores is: $scoresList")

    print("Enter a list of student IDs(Number), separated by commas:")
    val input3 = readLine() ?: ""
    val idSet = input3.split(",").map { it.trim() }.toCollection(TreeSet())
    println("The Set of student IDs is: $idSet")

    println("Enter a number from 1 to 3 to choose an operation to perform:")
    println("1. Find the highest score and the student who earned it")
    println("2. Map each student name to their score")
    println("3. Print the IDs of all students who scored above a certain threshold")
    print("Please enter your input: ")

    when (readLine()?.toIntOrNull() ?: 0) {
        1 -> {
            val scoreMap = studentsArray.zip(scoresList).toMap()
            val maxScore = scoresList.maxOrNull()
            val topStudents = scoreMap.filterValues { it == maxScore }.keys
            println("The highest score is $maxScore, earned by ${topStudents.joinToString()}")
        }
        2 -> {
            val scoreMap = studentsArray.zip(scoresList).toMap()
            println("The map of student names to scores is: $scoreMap")
        }
        3 -> {
            println("Enter a minimum score threshold:")
            val threshold = readLine()?.toIntOrNull() ?: 0
            val aboveThresholdIds = studentsArray.zip(scoresList)
                .filter { it.second >= threshold }
                .map { it.first }
                .toSet()
            println("The IDs of students who scored above $threshold are: $aboveThresholdIds")
        }
        else -> {
            println("Invalid choice. Please enter a number from 1 to 3.")
        }
    }
}

