package com.example.voyaprenderkotlin.sintaxis

fun main() {

    val weekDay = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");

//    println(weekDay[1]);
//    println(weekDay.size);
//
//    if (weekDay.size >= 8) {
//        println(weekDay[7]);
//    } else {
//        println("Solo hay 7 dias de la semana.");
//    }

    /**
     * BUCLES PARA ARRAYS
     */

    // Este bucle podemos obtener el valor segun la posicion del array.
    for (position in weekDay.indices) {
        println(weekDay[position]);
    }

    // Este bucle sirve para obtener posicion y valor.
    for ((position, value) in weekDay.withIndex()) {
        println("La posicion $position es el dia $value");
    }

    // Este bucle podemos obtener el valor.
    for (weekDay in weekDay) {
        println("Hoy es $weekDay");
    }
}