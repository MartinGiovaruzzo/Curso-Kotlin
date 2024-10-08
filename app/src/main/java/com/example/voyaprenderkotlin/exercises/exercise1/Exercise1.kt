package com.example.voyaprenderkotlin.exercises.exercise1

/**
 * Por lo general, el telefono te proporciona un resumen de las notificaciones.
 *
 * En el codigo inical que se proporciona en el siguiente fragmento de codigo,
 * escribe un programa que imprima el mensaje de resumen segun la cantidad de
 * notificaciones que recibiste. El mensaje debe incluir lo siguiente:
 *
 * La cantidad exacta de notificaciones cuando haya menos de 100
 * 99+ como cantidad de notificaciones cuando haya mas de 100
 *
 * RESULTADO:
 * - You have 51 notification
 * - You phone is blowing up! You have 99+ notifications.
 */

fun main() {
    val morningNotification = 51;
    val eveningNotification = 135;

    printNotificationSummary(morningNotification);
    printNotificationSummary(eveningNotification);
}

fun printNotificationSummary(numberOfMessages: Int) {

    if (numberOfMessages > 99) {
        println("Your phone is blowing up! You have 99+ notifications.")
    } else {
        println("You have $numberOfMessages notifications.")
    }

}