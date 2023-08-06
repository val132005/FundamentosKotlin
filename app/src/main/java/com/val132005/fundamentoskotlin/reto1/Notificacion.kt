package com.val132005.fundamentoskotlin.reto1

import kotlin.random.Random
class Notificacion {
}

fun main() {

    //Mensaje inicial
    println("Notificaciones del celurar:\n")

    //Declaracion de variables
    var numNotificaciones:Int
    var respuesta:String="si"
    var i:Int=0

    //Mensaje y captura de dato para el funcionamiento de do-while
    println("¿Desea ver las notificaciones de su celular?")
    respuesta= readLine()!!.toString().lowercase()

    //Inicio de do-while
    do {
        numNotificaciones=Random.nextInt(0,150)
        println()
        //Condicionales
        if (numNotificaciones>0 && numNotificaciones<100){
            println("Usted ha recibido $numNotificaciones notificaciones en su celular")
        }else if (numNotificaciones>=100){
            println("Usted ha recibido mas de 99 notificaciones en su celular")
        }else if (numNotificaciones==0){
            println("Usted no ha recibido ninguna notificacion")
        }
        println()
        println("¿Desea ver las notificaciones de su celular nuevamente?")
        respuesta= readLine()!!.toString().lowercase()
        i+=1
    }while (respuesta=="si")




}