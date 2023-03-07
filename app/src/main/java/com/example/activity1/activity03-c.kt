package com.example.activity1

import java.util.*
import kotlin.collections.HashMap

fun main() {

    val groceryList = arrayListOf(
        "Milk", "Bread", "Eggs", "Cheese", "Butter",
        "Rice", "Pasta", "Flour", "Sugar", "Salt",
        "Chicken", "Beef", "Pork", "Fish", "Shrimp",
        "Apples", "Bananas", "Oranges", "Grapes", "Strawberries"
    ).map { it.lowercase(Locale.getDefault()) }

    val cart = hashMapOf<String, Int>()

    val scanner = Scanner(System.`in`)

    while (true) {

        println("Grocery List:")
        groceryList.forEach { item -> println(item.replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(
                Locale.getDefault()
            ) else it.toString()
        }) }


        println("Cart:")
        cart.forEach { (item, quantity) -> println("${item.replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(
                Locale.getDefault()
            ) else it.toString()
        }} x$quantity") }

        println("Enter 'add' to add item to cart, 'remove' to remove item from cart, 'checkout' to checkout")
        print("Choose your desired action: ")
        when (scanner.nextLine().lowercase(Locale.getDefault())) {
            "add" -> {

                print("Enter item name: ")
                val item = scanner.nextLine().lowercase(Locale.getDefault())

                if (groceryList.contains(item)) {

                    print("Enter quantity: ")
                    val quantity = scanner.nextInt()
                    scanner.nextLine()

                    addToCart(item, quantity, cart)
                } else {
                    println("${item.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }} is not in the grocery list.")
                }

            }
            "remove" -> {

                print("Enter item name:")
                val item = scanner.nextLine().lowercase(Locale.getDefault())

                removeFromCart(item, cart)
            }
            "checkout" -> {

                val totalItemsCheckedOut = checkOut(cart)
                println("Total items checked out: $totalItemsCheckedOut")

                cart.clear()
                break
            }
            else -> {
                println("Invalid action. Please try again.")
            }
        }
    }
}

fun addToCart(item: String, quantity: Int, cart: HashMap<String, Int>) {

    val existingItem = cart.keys.find { it.startsWith(item) }

    if (existingItem != null) {

        val existingQuantity = cart[existingItem]!!
        cart[existingItem] = existingQuantity + quantity
    } else {

        val newItem = if (cart.containsKey(item)) {
            val numDuplicates = cart.keys.filter { it.startsWith(item) }.size
            "${item}_${numDuplicates + 1}"
        } else {
            item
        }
        cart[newItem] = quantity
    }
}

fun checkOut(cart: HashMap<String, Int>): Int {
    var totalItemsCheckedOut = 0


    cart.values.forEach { quantity -> totalItemsCheckedOut += quantity }

    return totalItemsCheckedOut
}

fun removeFromCart(item: String, cart: HashMap<String, Int>) {

    cart.keys.filter { it.startsWith(item) }.forEach { cart.remove(it) }
}
