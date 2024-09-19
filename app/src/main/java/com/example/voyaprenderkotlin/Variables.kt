package com.example.voyaprenderkotlin

import android.net.ProxyInfo

fun main(){

    /**
     * VAL ES UNA CONSTANTE
     * VAR ES UNA VARIABLE
     */

    /**
     * VARIABLES NUMERICAS
     */

    //Int -2,147,483,647 a 2,147,483,647 (numeros que soporta)
    val age:Int = 30;
    var age2:Int = 57;

    //Long -9,223,372,036,854,775,807 A 9,223,372,036,854,775,807 (numeros que soporta - gasta mas memoria)
    val longExample:Long = 30;

    //Float - numeros con decimales - soporta 6 decimales
    val floatexample:Float = 30.5f;

    //Double - numeros con decimales - soporta 12 decimales - gasta mas memoria
    val doubleExample:Double = 30.5;

    /**
     * VARIABLES ALFANUMERICAS
     */

    //Char soporta 1 caracter - Se coloca en comillas simples ''
    val charExample1:Char = 'z';
    val charExample2:Char = '5';
    val charExample3:Char = '$';

    //String soporta lo que sea - Se coloca en comillas ""
    val stringExample:String = "MartinZZo 57"

    /**
     * VARIABLES BOOLEANAS
     */

    val booleanExample:Boolean = true;
    val booleanExample2:Boolean = false;

    /**
     * FUNCIONES ARITMETICAS
     */

    //SUMAR
    println("SUMAR")
    println(age + age2)

    //RESTAR
    println("RESTAR")
    println(age - age2)

    //DIVIDIR
    println("DIVIDIR")
    println(age / age2)

    println("MULTIPLICAR")
    //MULTIPLICAR
    println(age * age2)

    //MODULO
    println("MODULO")
    println(age % age2)

}