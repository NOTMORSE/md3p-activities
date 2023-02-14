package com.example.activity1

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate


@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    println("Hello and welcome to Eve Grocery!!")
    println("How may I assist you today?")
    println("1) Check available stocks")
    println("2) Update Inventory")
    println("3) Exit")
    print("Please select an option: ")
    val intro = readln()

    if (intro == "1") {
        categories()
    }
    if (intro == "2") {
        categories()
    }
    if (intro == "3") {
        println("Thank you for visiting") }

}
@RequiresApi(Build.VERSION_CODES.O)
fun categories(){
    println("Please select your desired Supply Categories:")
    println("1) Canned Foods")
    println("2) Vegetables")
    println("3) Cooking Essentials")
    println("4) Meat")
    println("5) Snacks")
    println("6) Beverages")
    print("Please select an option: ")
    when (readln()){
        "1" -> {
            stocks() }
        "2" -> {
            stocks2()
        }
        "3" -> {
            stocks3()
        }
        "4" -> {
            stocks4()
        }
        "5" -> {
            stocks5()
        }
        "6" -> {
            stocks6()
        }
    }
}
@RequiresApi(Build.VERSION_CODES.O)
fun stocks() {
    val date = LocalDate.now()
    println("Here are the stocks that are currently accessible as of $date:")
    println("Canned Goods:")
    println("1) $cname1\n   " +
                "Stocks Available:$can1                    Price:₱ $price1")
    println("2) $cname2\n   " +
                "Stocks Available:$can2                    Price:₱ $price2")
    println("3) $cname3\n   " +
                "Stocks Available:$can3                    Price:₱ $price3")
    println("4) $cname4\n   " +
                "Stocks Available:$can4                    Price:₱ $price4")
    println("5) $cname5\n   " +
                "Available Stocks:$can5                    Price:₱ $price5")
    println("")
    println("A) Back to Categories")
    println("B) Update Canned food")
    println("C) Exit")
    print("Please select an option: ")
    val canpage1 = readln()
    if (canpage1 == "A"){
        categories()
    }
    if (canpage1 == "B"){
        updatecan()}
    if (canpage1 == "C"){
            println("Thank you for visiting") }
    else {
        println("Error, Please try again")
    stocks()
    }
}
@RequiresApi(Build.VERSION_CODES.O)
fun stocks2() {
    val date = LocalDate.now()
    println("Here are the stocks that are currently accessible as of $date:")
    println("Canned Goods:")
    println("1) $fvname1\n   " +
            "Stocks Available:$fv1                    Price:₱ $fvprice1")
    println("2) $fvname2\n   " +
            "Stocks Available:$fv2                    Price:₱ $fvprice2")
    println("3) $fvname3\n   " +
            "Stocks Available:$fv3                    Price:₱ $fvprice3")
    println("4) $fvname4\n   " +
            "Stocks Available:$fv4                    Price:₱ $fvprice4")
    println("5) $fvname5\n   " +
            "Available Stocks:$fv5                    Price:₱ $fvprice5")
    println("")
    println("A) Back to Categories")
    println("B) Update Vegetable")
    println("C) Exit")
    print("Please select an option: ")
    val fvpage = readln()
    if (fvpage == "A"){
        categories()
    }
    if (fvpage == "B"){
        updatefv() }
    if (fvpage == "C"){
        println("Thank you for visiting") }
    else {
        println("Error, Please try again")
    stocks2() }
}

@RequiresApi(Build.VERSION_CODES.O)
fun stocks3() {
    val date = LocalDate.now()
    println("Here are the stocks that are currently accessible as of $date:")
    println("Canned Goods:")
    println("1) $cename1\n   " +
            "Stocks Available:$ce1                    Price:₱ $ceprice1")
    println("2) $cename2\n   " +
            "Stocks Available:$ce2                    Price:₱ $ceprice2")
    println("3) $cename3\n   " +
            "Stocks Available:$ce3                    Price:₱ $ceprice3")
    println("4) $cename4\n   " +
            "Stocks Available:$ce4                    Price:₱ $ceprice4")
    println("5) $cename5\n   " +
            "Available Stocks:$ce5                    Price:₱ $ceprice5")
    println("")
    println("A) Back to Categories")
    println("B) Update Cooking Essentials ")
    println("C) Exit")
    print("Please select an option: ")
    val cepage = readln()
    if (cepage == "A"){
        categories()
    }
    if (cepage == "B"){
        updatece()}
    if (cepage == "C"){
        println("Thank you for visiting") }
    else {
        println("Error, Please try again")
        stocks3() }
}
@RequiresApi(Build.VERSION_CODES.O)
fun stocks4() {
    val date = LocalDate.now()
    println("Here are the stocks that are currently accessible as of $date:")
    println("Canned Goods:")
    println("1) $mname1\n   " +
            "Stocks Available:$m1                    Price:₱ $mprice1")
    println("2) $mname2\n   " +
            "Stocks Available:$m2                    Price:₱ $mprice2")
    println("3) $mname3\n   " +
            "Stocks Available:$m3                    Price:₱ $mprice3")
    println("4) $mname4\n   " +
            "Stocks Available:$m4                    Price:₱ $mprice4")
    println("5) $mname5\n   " +
            "Available Stocks:$m5                    Price:₱ $mprice5")
    println("")
    println("A) Back to Categories")
    println("B) Update Meat")
    println("C) Exit")
    print("Please select an option: ")
    val mpage1 = readln()
    if (mpage1 == "A"){
        categories()
    }
    if (mpage1 == "B"){
        updatem()}
    if (mpage1 == "C"){
        println("Thank you for visiting") }
    else {
        println("Error, Please try again")
        stocks4()
    }
}
@RequiresApi(Build.VERSION_CODES.O)
fun stocks5() {
    val date = LocalDate.now()
    println("Here are the stocks that are currently accessible as of $date:")
    println("Snacks:")
    println("1) $sname1\n   " +
            "Stocks Available:$s1                    Price:₱ $sprice1")
    println("2) $sname2\n   " +
            "Stocks Available:$s2                    Price:₱ $sprice2")
    println("3) $sname3\n   " +
            "Stocks Available:$s3                    Price:₱ $sprice3")
    println("4) $sname4\n   " +
            "Stocks Available:$s4                    Price:₱ $sprice4")
    println("5) $sname5\n   " +
            "Available Stocks:$s5                    Price:₱ $sprice5")
    println("")
    println("A) Back to Categories")
    println("B) Update Snacks")
    println("C) Exit")
    print("Please select an option: ")
    val spage1 = readln()
    if (spage1 == "A"){
        categories()
    }
    if (spage1 == "B"){
        updates()}
    if (spage1 == "C"){
        println("Thank you for visiting") }
    else {
        println("Error, Please try again")
        stocks5()
    }
}
@RequiresApi(Build.VERSION_CODES.O)
fun stocks6() {
    val date = LocalDate.now()
    println("Here are the stocks that are currently accessible as of $date:")
    println("Canned Goods:")
    println("1) $bname1\n   " +
            "Stocks Available:$b1                    Price:₱ $bprice1")
    println("2) $bname2\n   " +
            "Stocks Available:$b2                    Price:₱ $bprice2")
    println("3) $bname3\n   " +
            "Stocks Available:$b3                    Price:₱ $bprice3")
    println("4) $bname4\n   " +
            "Stocks Available:$b4                    Price:₱ $bprice4")
    println("5) $bname5\n   " +
            "Available Stocks:$b5                    Price:₱ $bprice5")
    println("")
    println("A) Back to Categories")
    println("B) Update Beverages")
    println("C) Exit")
    print("Please select an option: ")
    val bpage1 = readln()
    if (bpage1 == "A"){
        categories()
    }
    if (bpage1 == "B"){
        updateb()}
    if (bpage1 == "C"){
        println("Thank you for visiting") }
    else {
        println("Error, Please try again")
        stocks6()
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun updatecan() {
    println("Please select the stock you want to Update:")
    println("1) $cname1")
    println("2) $cname2")
    println("3) $cname3")
    println("4) $cname4")
    println("5) $cname5")
    print("Please select an option: ")
    val canupdate = readln()

    if (canupdate == "1") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val canupdate2 = readln()
                cname1 = canupdate2
                stocks()
            }
            "B" -> {
                println("$cname1: $can1")
                print("Please enter the new amount: ")
                val canupdate3 = readln().toInt()
                can1 = canupdate3
                stocks()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val canupdate4 = readln().toInt()
                price1 = canupdate4.toString()
                stocks()
            }
            else -> {
                println("Error, Please try again")
                updatecan()
            }
        }
    }
    if (canupdate == "2") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val canupdate2 = readln()
                cname2 = canupdate2
                stocks()
            }
            "B" -> {
                println("$cname2: $can2")
                print("Please enter the new amount: ")
                val canupdate3 = readln().toInt()
                can2 = canupdate3
                stocks()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val canupdate4 = readln().toInt()
                price2 = canupdate4.toString()
                stocks()
            }
            else -> {
                println("Error, Please try again")
                updatecan()
            }
        }
    }
    if (canupdate == "3") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val canupdate2 = readln()
                cname3 = canupdate2
                stocks()
            }
            "B" -> {
                println("$cname3: $can3")
                print("Please enter the new amount: ")
                val canupdate3 = readln().toInt()
                can3 = canupdate3
                stocks()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val canupdate4 = readln().toInt()
                price3 = canupdate4.toString()
                stocks()
            }
            else -> {
                println("Error, Please try again")
                updatecan()
            }
        }
    }
    if (canupdate == "4") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val canupdate2 = readln()
                cname4 = canupdate2
                stocks()
            }
            "B" -> {
                println("$cname4: $can4")
                print("Please enter the new amount: ")
                val canupdate3 = readln().toInt()
                can4 = canupdate3.toString()
                stocks()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val canupdate4 = readln().toInt()
                price4 = canupdate4.toString()
                stocks()
            }
            else -> {
                println("Error, Please try again")
                updatecan()
            }
        }
    }
    if (canupdate == "5") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val canupdate2 = readln()
                cname5 = canupdate2
                stocks()
            }
            "B" -> {
                println("$cname5: $can5")
                print("Please enter the new amount: ")
                val canupdate3 = readln().toInt()
                can5 = canupdate3
                stocks()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val canupdate4 = readln().toInt()
                price5 = canupdate4.toString()
                stocks()
            }
            else -> {
                println("Error, Please try again")
                updatecan()
            }
        }
    }
}

    @RequiresApi(Build.VERSION_CODES.O)
    fun updatefv() {
        println("Please select the stock you want to Update:")
        println("1) $fvname1")
        println("2) $fvname2")
        println("3) $fvname3")
        println("4) $fvname4")
        println("5) $fvname5")
        print("Please select an option: ")
        val fvupdate = readln()

        if (fvupdate == "1") {
            println("What would you like to update?")
            println("A) Name")
            println("B) Stocks Available")
            println("C) Price")
            print("Please select an option: ")
            when (readln()) {
                "A" -> {
                    print("Please insert your new name: ")
                    val fvupdate2 = readln()
                    fvname1 = fvupdate2
                    stocks2()
                }
                "B" -> {
                    println("$fvname1: $fv1")
                    print("Please enter the new amount: ")
                    val fvupdate3 = readln().toInt()
                    fv1 = fvupdate3
                    stocks2()
                }
                "C" -> {
                    print("Please enter the desired product price:₱ ")
                    val fvupdate4 = readln().toInt()
                    fvprice1 = fvupdate4.toString()
                    stocks2()
                }
                else -> {
                    println("Error, Please try again")
                    updatefv()
                }
            }
        }
        if (fvupdate == "2") {
            println("What would you like to update?")
            println("A) Name")
            println("B) Stocks Available")
            println("C) Price")
            print("Please select an option: ")
            when (readln()) {
                "A" -> {
                    print("Please insert your new name: ")
                    val fvupdate2 = readln()
                    fvname2 = fvupdate2
                    stocks2()
                }
                "B" -> {
                    println("$fvname2: $fv2")
                    print("Please enter the new amount: ")
                    val fvupdate3 = readln().toInt()
                    fv2 = fvupdate3
                    stocks2()
                }
                "C" -> {
                    print("Please enter the desired product price:₱ ")
                    val canupdate4 = readln().toInt()
                    fvprice2 = canupdate4.toString()
                    stocks2()
                }
                else -> {
                    println("Error, Please try again")
                    updatefv()
                }
            }
        }
        if (fvupdate == "3") {
            println("What would you like to update?")
            println("A) Name")
            println("B) Stocks Available")
            println("C) Price")
            print("Please select an option: ")
            when (readln()) {
                "A" -> {
                    print("Please insert your new name: ")
                    val fvupdate2 = readln()
                    fvname3 = fvupdate2
                    stocks2()
                }
                "B" -> {
                    println("$fvname3: $fv3")
                    print("Please enter the new amount: ")
                    val fvupdate3 = readln().toInt()
                    fv3 = fvupdate3
                    stocks2()
                }
                "C" -> {
                    print("Please enter the desired product price:₱ ")
                    val canupdate4 = readln().toInt()
                    fvprice3 = canupdate4.toString()
                    stocks2()
                }
                else -> {
                    println("Error, Please try again")
                    updatefv()
                }
            }
        }
        if (fvupdate == "4") {
            println("What would you like to update?")
            println("A) Name")
            println("B) Stocks Available")
            println("C) Price")
            print("Please select an option: ")
            when (readln()) {
                "A" -> {
                    print("Please insert your new name: ")
                    val fvupdate2 = readln()
                    fvname4 = fvupdate2
                    stocks2()
                }
                "B" -> {
                    println("$fvname4: $fv4")
                    print("Please enter the new amount: ")
                    val fvupdate3 = readln().toInt()
                    fv4 = fvupdate3
                    stocks2()
                }
                "C" -> {
                    print("Please enter the desired product price:₱ ")
                    val canupdate4 = readln().toInt()
                    fvprice4 = canupdate4.toString()
                    stocks2()
                }
                else -> {
                    println("Error, Please try again")
                    updatefv()
                }
            }
        }
        if (fvupdate == "5") {
            println("What would you like to update?")
            println("A) Name")
            println("B) Stocks Available")
            println("C) Price")
            print("Please select an option: ")
            when (readln()) {
                "A" -> {
                    print("Please insert your new name: ")
                    val fvupdate2 = readln()
                    fvname5 = fvupdate2
                    stocks2()
                }
                "B" -> {
                    println("$fvname5: $fv5")
                    print("Please enter the new amount: ")
                    val fvupdate3 = readln().toInt()
                    fv5 = fvupdate3
                    stocks2()
                }
                "C" -> {
                    print("Please enter the desired product price:₱ ")
                    val canupdate4 = readln().toInt()
                    fvprice5 = canupdate4.toString()
                    stocks2()
                }
                else -> {
                    println("Error, Please try again")
                    updatefv()
                }
            }
        }
    }

        @RequiresApi(Build.VERSION_CODES.O)
        fun updatece() {
            println("Please select the stock you want to Update:")
            println("1) $cename1")
            println("2) $cename2")
            println("3) $cename3")
            println("4) $cename4")
            println("5) $cename5")
            print("Please select an option: ")
            val ceupdate = readln()

            if (ceupdate == "1") {
                println("What would you like to update?")
                println("A) Name")
                println("B) Stocks Available")
                println("C) Price")
                print("Please select an option: ")
                when (readln()) {
                    "A" -> {
                        print("Please insert your new name: ")
                        val ceupdate2 = readln()
                        cename1 = ceupdate2
                        stocks3()
                    }
                    "B" -> {
                        println("$cename1: $ce1")
                        print("Please enter the new amount: ")
                        val ceupdate3 = readln().toInt()
                        ce1 = ceupdate3
                        stocks3()
                    }
                    "C" -> {
                        print("Please enter the desired product price:₱ ")
                        val ceupdate4 = readln().toInt()
                        ceprice1 = ceupdate4.toString()
                        stocks3()
                    }
                    else -> {
                        println("Error, Please try again")
                        updatece()
                    }
                }
            }

            if (ceupdate == "2") {
                println("What would you like to update?")
                println("A) Name")
                println("B) Stocks Available")
                println("C) Price")
                print("Please select an option: ")
                when (readln()) {
                    "A" -> {
                        print("Please insert your new name: ")
                        val ceupdate2 = readln()
                        cename2 = ceupdate2
                        stocks3()
                    }
                    "B" -> {
                        println("$cename2: $ce2")
                        print("Please enter the new amount: ")
                        val ceupdate3 = readln().toInt()
                        ce2 = ceupdate3
                        stocks3()
                    }
                    "C" -> {
                        print("Please enter the desired product price:₱ ")
                        val ceupdate4 = readln().toInt()
                        ceprice2 = ceupdate4.toString()
                        stocks3()
                    }
                    else -> {
                        println("Error, Please try again")
                        updatece()
                    }
                }
            }

            if (ceupdate == "3") {
                println("What would you like to update?")
                println("A) Name")
                println("B) Stocks Available")
                println("C) Price")
                print("Please select an option: ")
                when (readln()) {
                    "A" -> {
                        print("Please insert your new name: ")
                        val ceupdate2 = readln()
                        cename3 = ceupdate2
                        stocks3()
                    }
                    "B" -> {
                        println("$cename3: $ce3")
                        print("Please enter the new amount: ")
                        val ceupdate3 = readln().toInt()
                        ce3 = ceupdate3
                        stocks3()
                    }
                    "C" -> {
                        print("Please enter the desired product price:₱ ")
                        val ceupdate4 = readln().toInt()
                        ceprice3 = ceupdate4.toString()
                        stocks3()
                    }
                    else -> {
                        println("Error, Please try again")
                        updatece()
                    }
                }
            }
            if (ceupdate == "4") {
                println("What would you like to update?")
                println("A) Name")
                println("B) Stocks Available")
                println("C) Price")
                print("Please select an option: ")
                when (readln()) {
                    "A" -> {
                        print("Please insert your new name: ")
                        val ceupdate2 = readln()
                        cename4 = ceupdate2
                        stocks3()
                    }
                    "B" -> {
                        println("$cename4: $ce4")
                        print("Please enter the new amount: ")
                        val ceupdate3 = readln().toInt()
                        ce4 = ceupdate3
                        stocks3()
                    }
                    "C" -> {
                        print("Please enter the desired product price:₱ ")
                        val ceupdate4 = readln().toInt()
                        ceprice4 = ceupdate4.toString()
                        stocks3()
                    }
                    else -> {
                        println("Error, Please try again")
                        updatece()
                    }
                }
            }
            if (ceupdate == "5") {
                println("What would you like to update?")
                println("A) Name")
                println("B) Stocks Available")
                println("C) Price")
                print("Please select an option: ")
                when (readln()) {
                    "A" -> {
                        print("Please insert your new name: ")
                        val ceupdate2 = readln()
                        cename5 = ceupdate2
                        stocks3()
                    }
                    "B" -> {
                        println("$cename5: $ce5")
                        print("Please enter the new amount: ")
                        val ceupdate3 = readln().toInt()
                        ce5 = ceupdate3
                        stocks3()
                    }
                    "C" -> {
                        print("Please enter the desired product price:₱ ")
                        val ceupdate4 = readln().toInt()
                        ceprice5 = ceupdate4.toString()
                        stocks3()
                    }
                    else -> {
                        println("Error, Please try again")
                        updatece() } } } }

@RequiresApi(Build.VERSION_CODES.O)
fun updatem() {
    println("Please select the stock you want to Update:")
    println("1) $mname1")
    println("2) $mname2")
    println("3) $mname3")
    println("4) $mname4")
    println("5) $mname5")
    print("Please select an option: ")
    val mupdate = readln()

    if (mupdate == "1") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val mupdate2 = readln()
                mname1 = mupdate2
                stocks4()
            }
            "B" -> {
                println("$mname1: $m1")
                print("Please enter the new amount: ")
                val mupdate3 = readln().toInt()
                m1 = mupdate3
                stocks4()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val mupdate4 = readln().toInt()
                mprice1 = mupdate4.toString()
                stocks4()
            }
            else -> {
                println("Error, Please try again")
                updatem()
            }
        }
    }
    if (mupdate == "2") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val mupdate2 = readln()
                mname2 = mupdate2
                stocks4()
            }
            "B" -> {
                println("$mname2: $m2")
                print("Please enter the new amount: ")
                val mupdate3 = readln().toInt()
                m2 = mupdate3
                stocks4()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val mupdate4 = readln().toInt()
                mprice2 = mupdate4.toString()
                stocks4()
            }
            else -> {
                println("Error, Please try again")
                updatem()
            }
        }
    }
    if (mupdate == "3") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val mupdate2 = readln()
                mname3 = mupdate2
                stocks4()
            }
            "B" -> {
                println("$mname3: $m3")
                print("Please enter the new amount: ")
                val mupdate3 = readln().toInt()
                m3 = mupdate3
                stocks4()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val mupdate4 = readln().toInt()
                mprice3 = mupdate4.toString()
                stocks4()
            }
            else -> {
                println("Error, Please try again")
                updatem()
            }
        }
    }
    if (mupdate == "4") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val mupdate2 = readln()
                mname4 = mupdate2
                stocks4()
            }
            "B" -> {
                println("$mname4: $m4")
                print("Please enter the new amount: ")
                val mupdate3 = readln().toInt()
                m4 = mupdate3
                stocks4()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val mupdate4 = readln().toInt()
                mprice4 = mupdate4.toString()
                stocks4()
            }
            else -> {
                println("Error, Please try again")
                updatem()
            }
        }
    }
    if (mupdate == "5") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val mupdate2 = readln()
                mname5 = mupdate2
                stocks4()
            }
            "B" -> {
                println("$mname5: $m5")
                print("Please enter the new amount: ")
                val mupdate3 = readln()
                m5 = mupdate3
                stocks4()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val mupdate4 = readln().toInt()
                mprice5 = mupdate4.toString()
                stocks4()
            }
            else -> {
                println("Error, Please try again")
                updatem() } } } }
@RequiresApi(Build.VERSION_CODES.O)
fun updates() {
    println("Please select the stock you want to Update:")
    println("1) $sname1")
    println("2) $sname2")
    println("3) $sname3")
    println("4) $sname4")
    println("5) $sname5")
    print("Please select an option: ")
    val supdate = readln()

    if (supdate == "1") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val supdate2 = readln()
                sname1 = supdate2
                stocks5()
            }
            "B" -> {
                println("$sname1: $s1")
                print("Please enter the new amount: ")
                val supdate3 = readln().toInt()
                s1 = supdate3
                stocks5()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val supdate4 = readln().toInt()
                sprice1 = supdate4.toString()
                stocks5()
            }
            else -> {
                println("Error, Please try again")
                updates()
            }
        }
    }
    if (supdate == "2") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val supdate2 = readln()
                sname2 = supdate2
                stocks5()
            }
            "B" -> {
                println("$sname2: $s2")
                print("Please enter the new amount: ")
                val supdate3 = readln().toInt()
                s2 = supdate3
                stocks5()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val supdate4 = readln().toInt()
                sprice2 = supdate4.toString()
                stocks5()
            }
            else -> {
                println("Error, Please try again")
                updates()
            }
        }
    }
    if (supdate == "3") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val supdate2 = readln()
                sname3 = supdate2
                stocks5()
            }
            "B" -> {
                println("$sname3: $s3")
                print("Please enter the new amount: ")
                val supdate3 = readln().toInt()
                s3 = supdate3
                stocks5()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val supdate4 = readln().toInt()
                sprice3 = supdate4.toString()
                stocks5()
            }
            else -> {
                println("Error, Please try again")
                updates()
            }
        }
    }
    if (supdate == "4") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val supdate2 = readln()
                sname4 = supdate2
                stocks5()
            }
            "B" -> {
                println("$sname4: $s4")
                print("Please enter the new amount: ")
                val supdate3 = readln().toInt()
                s4 = supdate3
                stocks5()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val supdate4 = readln().toInt()
                sprice4 = supdate4.toString()
                stocks5()
            }
            else -> {
                println("Error, Please try again")
                updates()
            }
        }
    }
    if (supdate == "5") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val supdate2 = readln()
                sname5 = supdate2
                stocks5()
            }
            "B" -> {
                println("$sname5: $s5")
                print("Please enter the new amount: ")
                val supdate3 = readln().toInt()
                s5 = supdate3
                stocks5()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val supdate4 = readln().toInt()
                sprice5 = supdate4.toString()
                stocks5()
            }
            else -> {
                println("Error, Please try again")
                updates() } } } }
@RequiresApi(Build.VERSION_CODES.O)
fun updateb() {
    println("Please select the stock you want to Update:")
    println("1) $bname1")
    println("2) $bname2")
    println("3) $bname3")
    println("4) $bname4")
    println("5) $bname5")
    print("Please select an option: ")
    val bupdate = readln()

    if (bupdate == "1") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val bupdate2 = readln()
                bname1 = bupdate2
                stocks6()
            }
            "B" -> {
                println("$bname1: $b1")
                print("Please enter the new amount: ")
                val bupdate3 = readln().toInt()
                b1 = bupdate3
                stocks6()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val bupdate4 = readln().toInt()
                bprice1 = bupdate4.toString()
                stocks6()
            }
            else -> {
                println("Error, Please try again")
                updateb()
            }
        }
    }
    if (bupdate == "2") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val bupdate2 = readln()
                bname2 = bupdate2
                stocks6()
            }
            "B" -> {
                println("$bname2: $b2")
                print("Please enter the new amount: ")
                val bupdate3 = readln().toInt()
                b2 = bupdate3
                stocks6()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val bupdate4 = readln().toInt()
                bprice2 = bupdate4.toString()
                stocks6()
            }
            else -> {
                println("Error, Please try again")
                updateb()
            }
        }
    }
    if (bupdate == "3") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val bupdate2 = readln()
                bname3 = bupdate2
                stocks6()
            }
            "B" -> {
                println("$bname3: $b3")
                print("Please enter the new amount: ")
                val bupdate3 = readln().toInt()
                b3 = bupdate3
                stocks6()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val bupdate4 = readln().toInt()
                bprice3 = bupdate4.toString()
                stocks6()
            }
            else -> {
                println("Error, Please try again")
                updateb()
            }
        }
    }
    if (bupdate == "3") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val bupdate2 = readln()
                bname3 = bupdate2
                stocks6()
            }
            "B" -> {
                println("$bname3: $b3")
                print("Please enter the new amount: ")
                val bupdate3 = readln().toInt()
                b3 = bupdate3
                stocks6()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val bupdate4 = readln().toInt()
                bprice3 = bupdate4.toString()
                stocks6()
            }
            else -> {
                println("Error, Please try again")
                updateb()
            }
        }
    }
    if (bupdate == "4") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val bupdate2 = readln()
                bname4 = bupdate2
                stocks6()
            }
            "B" -> {
                println("$bname4: $b4")
                print("Please enter the new amount: ")
                val bupdate3 = readln().toInt()
                b4 = bupdate3
                stocks6()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val bupdate4 = readln().toInt()
                bprice4 = bupdate4.toString()
                stocks6()
            }
            else -> {
                println("Error, Please try again")
                updateb()
            }
        }
    }
    if (bupdate == "5") {
        println("What would you like to update?")
        println("A) Name")
        println("B) Stocks Available")
        println("C) Price")
        print("Please select an option: ")
        when (readln()) {
            "A" -> {
                print("Please insert your new name: ")
                val bupdate2 = readln()
                bname5 = bupdate2
                stocks6()
            }
            "B" -> {
                println("$bname5: $b5")
                print("Please enter the new amount: ")
                val bupdate3 = readln().toInt()
                b5 = bupdate3
                stocks6()
            }
            "C" -> {
                print("Please enter the desired product price:₱ ")
                val bupdate4 = readln().toInt()
                bprice5 = bupdate4.toString()
                stocks6()
            }
            else -> {
                println("Error, Please try again")
                updateb()
            }
        }
    }
}




