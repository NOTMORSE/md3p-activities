package com.example.activity1

import java.util.Scanner

fun main() {

    val groceryList = arrayListOf(
        "Milk", "Bread", "Eggs", "Cheese", "Butter",
        "Rice", "Pasta", "Flour", "Sugar", "Salt",
        "Chicken", "Beef", "Pork", "Fish", "Shrimp",
        "Apples", "Bananas", "Oranges", "Grapes", "Strawberries"
    )

    val cart = hashMapOf<String, Int>()

    val scanner = Scanner(System.`in`)

    while (true) {

        println("Grocery List:")
        groceryList.forEach { item -> println(item) }


        println("Cart:")
        cart.forEach { (item, quantity) -> println("$item x$quantity") }

        println("Enter 'add' to add item to cart, 'remove' to remove item from cart, 'checkout' to checkout")

        when (scanner.nextLine()) {
            "add" -> {

                println("Enter item name: ")
                val item = scanner.nextLine()

                println("Enter quantity:")
                val quantity = scanner.nextInt()
                scanner.nextLine()

                addToCart(item, quantity, cart)
            }
            "remove" -> {

                println("Enter item name:")
                val item = scanner.nextLine()

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
