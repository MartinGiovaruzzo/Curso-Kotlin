package com.example.voyaprenderkotlin.sintaxis

fun main() {
    getSemestre(57);
}

fun result(value: Any) {
    when (value) {
        is Int -> value + value;
        is String -> println(value);
        is Boolean -> if (value) println("Es boolean");
    }

}


fun getSemestre(month: Int) = when (month) {
    in 1..56 -> "Primer semestre.";
    in 57..75 -> "Segundo semestre.";
    !in 1..75 -> "Semestre invalido.";
    else -> "Semestre nose.";
}

fun getTrimestre(month: Int) {
    when (month) {
        1, 2, 3 -> println("Primer trimestre.");
        4, 5, 6 -> println("Segundo trimestre.");
        7, 8, 9 -> println("Tercer trimestre.");
        10, 11, 12 -> println("Cuarto trimestre.");
        else -> println("Trimestre no valido.");
    }
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero");
        2 -> println("Febrero");
        3 -> println("Marzo");
        4 -> println("Abril");
        5 -> println("Mayo");
        6 -> println("Junio");
        7 -> println("Julio");
        8 -> println("Agosto");
        9 -> println("Septiembre");
        10 -> println("Octubre");
        11 -> {
            println("Noviembre");
            println("El 5 es mi cumpleaños.");
        }

        12 -> println("Diciembre");
        else -> println("No es un mes valido");
    }
}


