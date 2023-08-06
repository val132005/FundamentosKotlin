package com.val132005.fundamentoskotlin.reto3

class Subasta {
}

fun main() {

    //Mensaje inicial
    println("Subasta de vehiculos")

    // Declaracion de variables y de listas mutables
    var productos = mutableListOf<String>("Volkswagen Gol Mod.2004","International 7600 Sba 2012","Honda Click 125i Mod.2017")
    var precios= mutableListOf<Int>(390000,3460000,890000)

    var numOfertantes: Int
    var columnas:Int = 2

    var nombre:String
    var oferta:Int

    var mayor =0
    var posicion:Int = 0

    //Inicio de susbasta y recepcion de ofertas
    println("Subasta #1\nSe reciben ofertas por el vehiculo: ${productos[0]}\nLa subasta empieza con el valor de $${precios[0]}")

    println("Por favor indique el numero de ofertantes:")
    numOfertantes= readLine()!!.toInt()
    if (numOfertantes>0){
        // Declaracion de la matriz
        var subasta1 = Array(numOfertantes){ Array(columnas){Any()} }
        // Se llena la matriz dependiendo de los ofertantes
        for (i in (0 until numOfertantes)){
            println()
            print("Nombre del ofertante #${i+1}: ")
            nombre= readLine()!!.toString()
            subasta1[i][0]=nombre
            print("Valor de la oferta: ")
            oferta= readLine()!!.toInt()
            subasta1[i][1]=oferta
        }

        // Evaluacion de la mayor oferta
        for (i in (0 until numOfertantes)){
            val valorSubasta = subasta1[i][1] as Int
            if (valorSubasta > mayor){
                mayor = valorSubasta
                posicion=i
            }
        }

        // Condicionales para evaluar al ganador de la subasta
        println()
        if (mayor >= precios[0]){
            println("El vehiculo ${productos[0]} es vendido al ofertante ${subasta1[posicion][0]} por un valor de $mayor")
        }else if (mayor < precios[0]){
            println("Ningun ofertante ha superado el valor base del producto, por ende, este es vendido por su valor base a la casa de subastas")
        }
    }else{
        println("No hay ningun ofertante para este producto, por ende, este es vendido por su valor base a la casa de subastas")
    }

    //Inicio de susbasta y recepcion de ofertas
    println()
    println("Subasta #2\nSe reciben ofertas por el vehiculo: ${productos[1]}\nLa subasta empieza con el valor de $${precios[1]}")

    println("Por favor indique el numero de ofertantes:")
    numOfertantes= readLine()!!.toInt()
    if (numOfertantes>0){
        // Declaracion de la matriz
        var subasta2 = Array(numOfertantes){ Array(columnas){Any()} }
        // Se llena la matriz dependiendo de los ofertantes
        for (i in (0 until numOfertantes)){
            println()
            print("Nombre del ofertante #${i+1}: ")
            nombre= readLine()!!.toString()
            subasta2[i][0]=nombre
            print("Valor de la oferta: ")
            oferta= readLine()!!.toInt()
            subasta2[i][1]=oferta
        }

        // Evaluacion de la mayor oferta
        for (i in (0 until numOfertantes)){
            val valorSubasta = subasta2[i][1] as Int
            if (valorSubasta > mayor){
                mayor = valorSubasta
                posicion=i
            }
        }

        // Condicionales para evaluar al ganador de la subasta
        println()
        if (mayor >= precios[1]){
            println("El vehiculo ${productos[1]} es vendido al ofertante ${subasta2[posicion][0]} por un valor de $mayor")
        }else if (mayor < precios[1]){
            println("Ningun ofertante ha superado el valor base del producto, por ende, este es vendido por su valor base a la casa de subastas")
        }
    }else{
        println("No hay ningun ofertante para este producto, por ende, este es vendido por su valor base a la casa de subastas")
    }


    //Inicio de susbasta y recepcion de ofertas
    println()
    println("Subasta #3\nSe reciben ofertas por el vehiculo: ${productos[2]}\nLa subasta empieza con el valor de $${precios[2]}")

    println("Por favor indique el numero de ofertantes:")
    numOfertantes= readLine()!!.toInt()
    if (numOfertantes>0){
        // Declaracion de la matriz
        var subasta3 = Array(numOfertantes){ Array(columnas){Any()} }
        // Se llena la matriz dependiendo de los ofertantes
        for (i in (0 until numOfertantes)){
            println()
            print("Nombre del ofertante #${i+1}: ")
            nombre= readLine()!!.toString()
            subasta3[i][0]=nombre
            print("Valor de la oferta: ")
            oferta= readLine()!!.toInt()
            subasta3[i][1]=oferta
        }

        // Evaluacion de la mayor oferta
        for (i in (0 until numOfertantes)){
            val valorSubasta = subasta3[i][1] as Int
            if (valorSubasta > mayor){
                mayor = valorSubasta
                posicion=i
            }
        }

        // Condicionales para evaluar al ganador de la subasta
        println()
        if (mayor >= precios[2]){
            println("El vehiculo ${productos[2]} es vendido al ofertante ${subasta3[posicion][0]} por un valor de $mayor")
        }else if (mayor < precios[2]){
            println("Ningun ofertante ha superado el valor base del producto, por ende, este es vendido por su valor base a la casa de subastas")
        }
    }else{
        println("No hay ningun ofertante para este producto, por ende, este es vendido por su valor base a la casa de subastas")
    }

    println("\nFin de la susbasta")


}