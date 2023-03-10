package com.example.activity1

import java.util.*

class Student(val firstName: String, val lastName: String, val nickName: String, val id: Int, val yearEnrolled: Int) {
    override fun toString(): String {
        return "$firstName $lastName (Nick: $nickName, ID: $id, Enrolled: $yearEnrolled)"
    }
}

fun main() {
    val students = listOf(
        Student("Andrew", "Bustos", "Andy", 1234, 2024),
        Student("Faith", "Mariano", "Fay", 5678, 2024),
        Student("Felix", "Navarro", "Flex", 9012, 2024),
        Student("Gee", "Quero", "G", 3456, 2024),
        Student("Jaramillo", "Hanz", "Jazz", 7890, 2024),
        Student("Jeffrey", "Laroya Saltiga", "Jeff", 1235, 2024),
        Student("Joe Mari", "Ubay", "JM", 5679, 2024),
        Student("John Chris", "Macaraig Bolanio", "JC", 9013, 2024),
        Student("Mark Andrei", "Condino", "Mark", 3457, 2024),
        Student("Marie Fe", "Dela Peña", "Mafe", 7891, 2024),
        Student("Vanchan", "Navidad", "Van", 1236, 2024),
        Student("Riz", "Caser", "Riz", 5680, 2024),
        Student("Xandrei", "Xhou", "Xan", 9014, 2024),
        Student("Vic", "Ama", "Vic", 3458, 2024),
        Student("Yer", "Bravo Toilas", "Yer", 7892, 2024),
        Student("Paolo", "Luzares", "Paolo", 1237, 2024),
        Student("Noven Rey", "Gumnad", "Noven", 5681, 2024),
        Student("Ley", "De", "Ley", 9015, 2024)
    )

    val scanner = Scanner(System.`in`)
    while (true) {
        print("Enter search string (or 'exit' to quit): ")
        val input = scanner.nextLine()
        if (input == "exit") {
            break
        }
        val matches = searchStudentWildSearch(input, students)
        if (matches.isEmpty()) {
            println("No matches found.")
        } else {
            println("Matches found:")
            matches.forEach { println(it) }
        }
    }
}

fun searchStudentWildSearch(searchString: String, students: List<Student>): ArrayList<Student> {
    val result = ArrayList<Student>()
    for (student in students) {
        if (student.firstName.contains(searchString, ignoreCase = true) ||
            student.lastName.contains(searchString, ignoreCase = true) ||
            student.nickName.contains(searchString, ignoreCase = true))
        {
            result.add(student)
        }
    }
    return result
}
