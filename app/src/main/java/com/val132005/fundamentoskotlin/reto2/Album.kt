package com.val132005.fundamentoskotlin.reto2

class Album {
}

fun main() {

    // Declaracion de variables
    var numCanciones:Int
    var tipoMusica:String
    var columnas:Int = 4

    //Declaracion de listas mutables
    var titulo = mutableListOf<String>()
    var artista= mutableListOf<String>()
    var publicacion = mutableListOf<Int>()
    var reproducciones= mutableListOf<Int>()

    var tit:String
    var art:String
    var publi:Int
    var repro:Int

    //Funciones max y min para obtener evaluaciones de popularidad
    var mayorReproduccion= reproducciones.max()
    var menorReproduccion= reproducciones.min()

    var popular = reproducciones.indexOf(mayorReproduccion)
    var noPopular = reproducciones.indexOf(menorReproduccion)

    //Pregunta para el funcionamiento del ciclo y de la matriz
    println("¿Cuantas canciones tiene el Album?")
    numCanciones= readLine()!!.toInt()

    var album = Array(numCanciones){ Array(columnas){""}}

    println("\n¿Que tipo de musica contine el Album?")
    tipoMusica= readLine()!!.toString()

    //Inicio del ciclo
    for (i in (0 until numCanciones)){
        println()
        println("Ingrese el titulo de la cancion #${i+1}")
        tit = readLine()!!.toString()
        titulo.add(tit)
        println()
        println("Ingrese el nombre del artista de la cancion #${i+1}")
        art = readLine()!!.toString()
        artista.add(art)
        println()
        println("Ingrese el año de publicacion de la cancion #${i+1}")
        publi = readLine()!!.toInt()
        publicacion.add(publi)
        println()
        println("Ingrese el numero de reproducciones que ha tenido la cancion#${i+1}")
        repro = readLine()!!.toInt()
        reproducciones.add(repro)
        println()
    }

    //Salida por pantalla de las canciones y evaluacion de sus respectivas reproducciones
    println("Las canciones mas y menos pupulares:")
    println("La cancion mas popular del album es ${titulo[popular]} con ${reproducciones[popular]} reproducciones")
    println("La cancion menos popular del album es ${titulo[noPopular]} con ${reproducciones[noPopular]} reproducciones")

    println()
    println("Evaluacion del numero de reproducciones")
    for (i in (0 until numCanciones)){
        if (reproducciones[i]>=0 && reproducciones[i]<1000){
            println("La cancion ${titulo[i]} tiene ${reproducciones[i]} reproducciones, por ende, es poco popular")
        }else if (reproducciones[i]>=1000){
            println("La cancion ${titulo[i]} tiene ${reproducciones[i]} reproducciones, por ende, es popular")
        }
    }
    println()
    println("Canciones del album:")
    for (i in (0 until numCanciones)){
        println("Cancion #${i+1}:")
        println("${titulo[i]}, interpretada por ${artista[i]}, se lanzo en ${publicacion[i]} y tiene ${reproducciones[i]} reproducciones")
        println()
    }

}