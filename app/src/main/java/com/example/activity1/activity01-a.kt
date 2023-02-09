package com.example.activity1

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import kotlin.random.Random

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    println("Welcome to the portal")
    val name: String = ("Please enter your username: ")
    print(name)
    val user: String = readln()
    val pass2: String = ("\"Caution: Digits only\"")
    val pass: String = ("Please enter your password: ")
    print("$pass2\n$pass")
    readln().toInt()
    println("Welcome ${user.uppercase()}")
    println("You currently teach the following course: Mobile Development")
    val date = LocalDate.now()
    println("Here are your student updates as of $date")
    println("Students in your class: \"40\"")
    println("Top 10")
    val list = listOf(
        "1.Andrew Bustos: 96%\n" + "2.Jeffrey Saltiga: 95%\n" + "3.John Chris Bolanio: 94%\n" +
                "4.Jun Zon: 93.50%\n" + "5.Noven Rey Gunmad: 93%\n" + "6.Andrei Condino: 92%\n" +
                "7.Vanchan Navidad: 91.25%\n" + "8.Seong Phil: 91%\n" + "9.Xandrei Xhou: 90%\n" + "10.Ley De: 89%\n"
    )
    val separator = ", "
    val result = list.joinToString(separator)
    println(result)
    println(
        "Activities assigned:\n" +
                "Lesson 1: Activity 1\n" +
                "Lesson 1: Activity 2\n" +
                "Lesson 2: Activity 1\n" +
                "Lesson 2: Activity 2"
    )
    val act1 = ("Students who have completed Lesson 1: Activity 1:")
    val studentsample = Random.nextInt(0, 40)
    println("$act1 $studentsample")
    if (studentsample < 30) {
        println("\"Immediate action is required\"")
    } else {
        println("Great Job!!")
    }
    val act2 = ("Students who have completed Lesson 1: Activity 2:")
    val studentsample2 = Random.nextInt(0, 40)
    println("$act2 $studentsample2")
    if (studentsample2 < 30) {
        println("\"Immediate action is required\"")
    } else {
        println("Great Job!!")
    }
    val act3 = ("Students who have completed Lesson 2: Activity 1:")
    val studentsample3 = Random.nextInt(0, 40)
    println("$act3 $studentsample3")
    if (studentsample3 < 30) {
        println("\"Immediate action is required\"")
    } else {
        println("Great Job!!")
    }
    val act4 = ("Students who have completed Lesson 2: Activity 2:")
    val studentsample4 = Random.nextInt(0, 40)
    println("$act4 $studentsample4")
    if (studentsample4 < 30) {
        println("\"Immediate action is required\"")
    } else {
        println("Great Job!!")
    }
    val update: String = ("What would you like to do?" +
            "Options:\n" +
            "[A]UPDATE\n[B]ANNOUNCEMENT\n[C]ASSIGN TASK\n[D]NOTHING: ")
    print(update)
    val actup: String = readln()
    when (actup.uppercase()) {
        "A" -> {
            print("What Activity would you like to update?" +
                    "Options:\n" +
                    "[A]LESSON1:ACT1\n[B]LESSON1:ACT2\n[C]LESSON2:ACT1\n[D]LESSON2:ACT2: ")
            val actstatus: String = readln().uppercase()
            if (actstatus == "A") {
                print("How many pupils will you include in LESSON1:ACT1? ")
                val acstatus2 = readln().toInt()
                if (acstatus2 + studentsample <= 40) {
                    println("Thank you, we will update it shortly")
                } else {
                    println("ERROR!!!The number of students exceed the requirements") } }
            if (actstatus == "B") {
                print("How many pupils will you include in LESSON1:ACT2? ")
                val acstatus3 = readln().toInt()
                if (acstatus3 + studentsample2 <= 40) {
                    println("Thank you, we will update it shortly")
                } else {
                    println("ERROR!!!The number of students exceed the requirements") } }
            if (actstatus == "C") {
                print("How many pupils will you include in LESSON2:ACT1? ")
                val acstatus4 = readln().toInt()
                if (acstatus4 + studentsample3 <= 40) {
                    println("Thank you, we will update it shortly")
                } else {
                    println("ERROR!!!The number of students exceed the requirements") } }
            if (actstatus == "D") {
                print("How many pupils will you include in LESSON2:ACT2? ")
                val acstatus5 = readln().toInt()
                if (acstatus5 + studentsample4 <= 40) {
                    println("Thank you, we will update it shortly")
                } else {
                    println("ERROR!!!The number of students exceed the requirements") } }
        }
        "B" -> {
            print("Please enter your message here: ")
            val assigns = readln()
            println("Thank you, we will announce \"$assigns\" shortly") }
        "C" -> {
            print("Please indicate the assignment you wish to assign: ")
            val assign: String = readln()
            println("Thank you, we will post \"${assign.uppercase()}\" shortly") }
        "D" -> {
            print("Thank you, Have a Great day") }
    }
}
