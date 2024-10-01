package com.example.voyaprenderkotlin.sintaxis

fun main() {
    var name: String? = null
    println(name?.get(7) ?: println("La variable es null."))
}