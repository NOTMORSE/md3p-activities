package com.example.activity1



fun main() {
    main3()
}
 fun main3(){
        println("Please Enter two names you can think of : ")
        print("(1)Subject: ")
        val str = readln()
        print("(2)Subject: ")
        val str1 = readln()

        println("String 1: $str")
        println("String 2: $str1")
        val str3 = str + str1
        val str5 = str3.replaceRange(0, 1, str[0].uppercaseChar().toString())
        println("Unique: $str5")
        println("Do you want to try again?")
        print("Y/N: ")
        val str4 = readln()
        if (str4 == "Y") {
            main2()
        } else {
            println("Thank you")
        }
    }
    fun main2() {
        println("Please Enter two names you can think of : ")
        print("(1)Subject: ")
        val str = readln()
        print("(2)Subject: ")
        val str1 = readln()

        println("String 1: $str")
        println("String 2: $str1")
        val str3 = str + str1
        val str5 = str3.replaceRange(0, 1, str[0].uppercaseChar().toString())
        println("Unique: $str5")
        println("Do you want to try again?")
        print("Y/N: ")
        val str4 = readln()
        if (str4 == "Y") {
            main3()
        } else {
            println("Thank you")
        }
    }





