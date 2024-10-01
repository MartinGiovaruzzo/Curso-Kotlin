package com.example.voyaprenderkotlin

import java.nio.file.WatchEvent

fun main() {
    mutableList();
}

fun mutableList() {
    var weekDays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
    weekDays.add(0, "Dia de cumple.");
    println(weekDays);

    if (weekDays.isEmpty()) {
        // No voy a mostrar nada porque no hay nada.
    } else {
        weekDays.forEach { println(it) };
    }

    if (weekDays.isNotEmpty()) {
        weekDays.forEach { println(it) };
    }
}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");

//    println(readOnly.size);
//    println(readOnly);
//    println(readOnly[0]);
//    println(readOnly.first());
//    println(readOnly.last());

    // FILTRAR LISTAS
    val example = readOnly.filter { it.contains("a") };
    println(example);

    // ITERAR
    readOnly.forEach { weekDay -> println(weekDay) };

}