package com.example.activity1

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import kotlin.random.Random



@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    println("Welcome to the portal")
    print(" Please enter your name here: ")
    val name = readln()
    println("Hello $name")
    println("Course you currently have taken: Mobile Development")
    print("Date you have taken this course: ")
    val date = LocalDate.of(2020, 5, 17)
    println("$date")
    print("Choose your course: ")
    readln()
    println("Mobile Development")
    println("Here are your Progress regarding your course:")
    val randomsample = Random.nextInt(0, 100)
    val randomsample2 = Random.nextInt(0, 100)
    val randomsample3 = Random.nextInt(0, 100)
    val randomsample4 = Random.nextInt(0, 100)

    println("Activity 1 $randomsample%")
    println("Activity 2 $randomsample2%")
    println("Activity 3 $randomsample3%")
    println("Activity 4 $randomsample4%")

    println("Would you like to update your progress?")
    var stringValue = ""
    print("yes OR no: ")
    stringValue = readln()

    when (stringValue.lowercase()) {
        "yes" -> {
            println("Activity 1")
            println("Activity 2")
            println("Activity 3")
            println("Activity 4")
            print("What activity would you like to update? ")
            readln()
            println("Thank you for inquiring. We will notify your teacher shortly.")
        }
        "no" -> {
            println("Thank you for visiting!!")
        }
        else -> {
            println("ERROR!!, Please follow the instructions")
            println("Would you like to update your progress?")
            var stringValue2 = ""
            print("yes OR no: ")
            stringValue2 = readln()
            when (stringValue2.lowercase()) {
                "yes" -> {
                    println("Activity 1")
                    println("Activity 2")
                    println("Activity 3")
                    println("Activity 4")
                    print("What activity would you like to update? ")
                    readln()
                    println("Thank you for inquiring. We will notify your teacher shortly.")
                }
                "no" -> {
                    println("Thank you for visiting!!")
                }
            }

        }
    }
}

















