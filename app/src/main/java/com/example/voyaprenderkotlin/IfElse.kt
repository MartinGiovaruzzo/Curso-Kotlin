package com.example.voyaprenderkotlin

fun main() {
}

fun ifInt() {
    var age: Int = 24;

    if (age > 18) {
        println("Puedo tomar alcohol.");
    }
}

fun ifBoolean() {
    var soyFeliz: Boolean = false;

    if (!soyFeliz) {
        println("SOY FELIZ")
    }
}

fun ifAnidado() {

    val animal = "cat"

    if (animal == "dog") {
        println("Es un perro.")
    } else if (animal == "cat") {
        println("Es un gato.")
    } else if (animal == "bird") {
        println("Es un pajaro.")
    } else {
        println("No es uno de los animales esperados.")
    }
}


fun ifBasico() {

    var name: String = "Martin";

    if (name == "German") {
        println("Los nombres son iguales");
    } else {
        println("Los nombres no son iguales")
    }
}