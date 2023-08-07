package com.val132005.fundamentoskotlin.reto5
import kotlin.random.Random
import kotlin.system.exitProcess

class Nequi {
}

fun main() {

    //Mensaje de inicio
    println("Bienvenido a NEQUI")

    //Declaracion de variables
    val nombreUsuario = "Valentina"
    var numeroCelular: Long = 3213211903L
    var clave: Int = 1014

    var celularUsu: Long
    var claveUsu: Int
    var saldoDisponible:Double
    var saldoActual:Double= 4500000.0
    var funcionalidad: Int
    var modalidad :Int
    var dinero: Double

    //Inigreso del usuario
    println("Ingrese su numero de telefono")
    celularUsu = readLine()!!.toLong()
    println("Ingrese su clave de 4 digitos")
    claveUsu = readLine()!!.toInt()
    //Condicionales para acceso
    if (numeroCelular == celularUsu && clave == claveUsu) {
        //Bienvenida y muestra de funionalidades
        println("\nAcceso concedido\nBienvenid@ $nombreUsuario\n")
        println("$nombreUsuario tu saldo actual es: $saldoActual\n")
        println("Tienes acceso a las siguientes funcionalidades, elije la opcion que quieras")
        println("1. Sacar dinero\n2. Enviar dinero\n3. Recargar\n4. Salir de NEQUI")
        funcionalidad= readLine()!!.toInt()

        //Condicionales para funcionalidades

        //Sacar dinero
        if (funcionalidad==1){
            println("Sacar dinero:\nEscoge una de estas dos opciones\n1. Cajero\n2. Punto fisico")
            modalidad= readLine()!!.toInt()
            //Condicionales para la evaluacion la realizacion de la funcionalidad
            if (saldoActual>2000){
                println("¿Cuanto dinero desea retirar?")
                dinero= readLine()!!.toDouble()
                if (dinero>saldoActual){
                    println("Usted no puede retirar un valor mayor a su saldo actual " +
                            "equivalente a $saldoActual")
                }else if (dinero<0){
                    println("Valor no valido")
                }else{
                    val numeroAleatorio = Random.nextInt(100000, 999999)
                    println("Número aleatorio de 6 dígitos: $numeroAleatorio")
                    print("Digite el numero aleatorio:")
                    var numConfirmacion = readLine()!!.toInt()
                    if (numConfirmacion==numeroAleatorio){
                        saldoActual=saldoActual-dinero
                        println("Retiro realizado con exito")
                        println("Su saldo actual es $saldoActual")
                    }else{
                        println("El numero no coincide, accion no valida")
                    }
                }
            }else {
                println("La transaccion no se puede realizar, no te alcanza")
            }
        //Envio de dinero
        }else if (funcionalidad==2){
            println("Enviar dinero")
            print("Por favor ingrese el numero de telefono al cual quiere enviar dinero: ")
            var numeroEnvio= readLine()!!.toLong()
            print("Digite el valor de dinero que desea enviar: ")
            dinero= readLine()!!.toDouble()
            //Condicionales para la evaluacion la realizacion de la funcionalidad
            if (dinero<saldoActual){
                saldoActual=saldoActual-dinero
                println("El envio de dinero se realizo exitosamente")
                println("Su saldo actual es $saldoActual")
            }else{
                println("El envio del dinero no se puede llevar a cabo")
            }

        //Recarga de dinero
        }else if (funcionalidad==3){
            println("Recargar dinero")
            print("Por favor ingrese el la cantidad de dinero que desea ingresar: ")
            dinero= readLine()!!.toDouble()
            println("¿Usted esta seguro de realizar la recarga?\n1. Si\n2. No")
            var decision = readLine()!!.toString().lowercase()
            //Condicionales para la evaluacion la realizacion de la funcionalidad
            if (decision=="si"){
                saldoActual=saldoActual+dinero
                println("Recarga generada exitosamente")
                println("Su saldo actual es $saldoActual")
            }else if (decision=="no"){
                println("La recarga se canselo")
            }else{
                println("Opcion no valida")
            }
        //Opcion de salida
        }else if (funcionalidad == 4){
            println("Vuelve pronto $nombreUsuario")
            exitProcess(0)
        //Opcion no valida
        }else{
            println("Opcion no valida")
        }
    } else if (numeroCelular != celularUsu || clave != claveUsu) {
        println("Su usuario y contraseña son incorrectos, intentelo mas tarde")
    }

}























