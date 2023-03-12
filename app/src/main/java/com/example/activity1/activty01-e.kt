package com.example.activity1

data class Student(val name: String, val score: Int, val id: String)

fun main() {

    val students = listOf(
        Student("Andrew Bustos", 90, "1001"),
        Student("Faith Mariano", 80, "1002"),
        Student("Felix Navarro", 85, "1003"),
        Student("Gee Quero", 95, "1004"),
        Student("Jaramillo Hanz", 75, "1005"),
        Student("Jeffrey Laroya Saltiga", 88, "1006"),
        Student("Joe Mari Ubay", 92, "1007"),
        Student("John Chris Macaraig Bolanio", 84, "1008"),
        Student("Mark Andrei Condino", 89, "1009"),
        Student("Marie Fe Dela Peña", 93, "1010"),
        Student("Vanchan Navidad", 87, "1011"),
        Student("Riz Caser", 81, "1012"),
        Student("Xandrei Xhou", 91, "1013"),
        Student("Vic Ama", 82, "1014"),
        Student("Yer Bravo Toilas", 79, "1015"),
        Student("Paolo Luzares", 76, "1016"),
        Student("Noven Rey Gumnad", 83, "1017"),
        Student("Ley De", 86, "1018")
    )

    var shouldExit = false
    while (!shouldExit) {
        println("Enter a number from 1 to 3 to choose an operation to perform:")
        println("1. Find the highest score and the student who earned it")
        println("2. Map each student name to their score")
        println("3. Print the IDs of all students who scored above a certain threshold")
        println("4. Exit")
        print("Please enter your input: ")

        when (readLine()?.toIntOrNull() ?: 0) {
            1 -> {
                val maxScore = students.maxOf { it.score }
                val topStudents = students.filter { it.score == maxScore }
                println("The highest score is $maxScore, earned by ${topStudents.joinToString { it.name }}")
            }
            2 -> {
                val scoreMap = students.associate { it.name to it.score }
                println("The map of student names to scores is: $scoreMap")
            }
            3 -> {
                println("Enter a minimum score threshold:")
                val threshold = readLine()?.toIntOrNull() ?: 0
                val aboveThresholdIds = students.filter { it.score >= threshold }
                    .map { it.id }
                    .toSet()
                println("The IDs of students who scored above $threshold are: $aboveThresholdIds")
            }
            4 -> {
                shouldExit = true
            }
            else -> {
                println("Invalid choice. Please enter a number from 1 to 4.")
            }
        }
    }
}
