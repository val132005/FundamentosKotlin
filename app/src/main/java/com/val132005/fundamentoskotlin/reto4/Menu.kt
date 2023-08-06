package com.val132005.fundamentoskotlin.reto4

class Menu {
}

fun main() {
    var numEntrdas:Int
    var numPlatos:Int
    var numPostres:Int
    var numBebidas:Int
    var columnas=4

    val eliminar = -1



    println("Bienvenido al menu, para iniciar debe haber registros, por ende por favor indique para cada categoria cuantos elementos desea agregar")
    println("¿Cuantos elementos desea agregar en entradas?")
    numEntrdas= readLine()!!.toInt()

    var entradas = Array(numEntrdas){ Array(columnas){Any()} }

    println("Entradas:\n")
    for (i in 0 until numEntrdas){
        println("Digite el codigo de la entrada")
        var codigo = readLine()!!.toInt()
        entradas[i][0]=codigo
        println("Digite el nombre de la entrada")
        var nombre = readLine()!!.toString()
        entradas[i][1]=nombre
        println("Digite la descripcion de la entrada")
        var descripcion = readLine()!!.toString()
        entradas[i][2]=descripcion
        println("Digite el pecio de la entrada")
        var precio = readLine()!!.toInt()
        entradas[i][3]=precio
        println()
    }

    println("¿Cuantos elementos desea agregar en platos fuertes?")
    numPlatos= readLine()!!.toInt()

    var platos = Array(numPlatos){ Array(columnas){Any()} }

    println("Platos fuertes:\n")
    for (i in 0 until numPlatos){
        println("Digite el codigo del plato")
        var codigo = readLine()!!.toInt()
        platos[i][0]=codigo
        println("Digite el nombre del plato")
        var nombre = readLine()!!.toString()
        platos[i][1]=nombre
        println("Digite la descripcion del plato")
        var descripcion = readLine()!!.toString()
        platos[i][2]=descripcion
        println("Digite el pecio del plato")
        var precio = readLine()!!.toInt()
        platos[i][3]=precio
        println()
    }

    println("¿Cuantos elementos desea agregar en postres?")
    numPostres= readLine()!!.toInt()

    var postres = Array(numPostres){ Array(columnas){Any()} }

    println("Postres:\n")
    for (i in 0 until numPostres){
        println("Digite el codigo del postre")
        var codigo = readLine()!!.toInt()
        postres[i][0]=codigo
        println("Digite el nombre del postre")
        var nombre = readLine()!!.toString()
        postres[i][1]=nombre
        println("Digite la descripcion del postre")
        var descripcion = readLine()!!.toString()
        postres[i][2]=descripcion
        println("Digite el pecio del postre")
        var precio = readLine()!!.toInt()
        postres[i][3]=precio
    }

    println("¿Cuantos elementos desea agregar en bebidas?")
    numBebidas= readLine()!!.toInt()

    var bebidas = Array(numBebidas){ Array(columnas){Any()} }

    println("Bebidas:\n")
    for (i in 0 until numBebidas){
        println("Digite el codigo de la bebida")
        var codigo = readLine()!!.toInt()
        bebidas[i][0]=codigo
        println("Digite el nombre de la bebida")
        var nombre = readLine()!!.toString()
        bebidas[i][1]=nombre
        println("Digite la descripcion de la bebida")
        var descripcion = readLine()!!.toString()
        bebidas[i][2]=descripcion
        println("Digite el pecio de la bebida")
        var precio = readLine()!!.toInt()
        bebidas[i][3]=precio
    }

    var decision = "si"
    var opcion:Int

    do {
        println("Opciones del menu:")
        println("1. Visualizar el menu")
        println("2. Mostrar un plato especifico segun su codigo")
        println("3. Modificar el menu")
        println("4. Eliminar un elemento del menu")

        println()
        print("Digite la opcion que desea ejecutar:")
        opcion= readLine()!!.toInt()

        //OPCION 1 VISULIZAR

        if (opcion==1){
            if (entradas.size>=0){
                println("\nEntradas: \n")
                for (i in (0 until entradas.size)){
                    if (entradas[i][0] != eliminar) {
                        println("Entrada #${i + 1}")
                        println("Codigo: ${entradas[i][0]}")
                        println("Nombre: ${entradas[i][1]}")
                        println("Descripcion: ${entradas[i][2]}")
                        println("Precio: ${entradas[i][3]}")
                        println()
                    }
                }
                println("\nPlatos fuertes: \n")
                for (i in (0 until platos.size)){
                    if (platos[i][0] != eliminar) {
                        println("Pato fuerte #${i+1}")
                        println("Codigo: ${platos[i][0]}")
                        println("Nombre: ${platos[i][1]}")
                        println("Descripcion: ${platos[i][2]}")
                        println("Precio: ${platos[i][3]}")
                        println()
                    }

                }

                println("\nPostres: \n")
                for (i in (0 until postres.size)){
                    if (postres[i][0] != eliminar) {
                        println("Postre #${i+1}")
                        println("Codigo: ${postres[i][0]}")
                        println("Nombre: ${postres[i][1]}")
                        println("Descripcion: ${postres[i][2]}")
                        println("Precio: ${postres[i][3]}")
                        println()
                    }
                }
                println("\nBebidas: \n")
                for (i in (0 until bebidas.size)) {
                    if (bebidas[i][0] != eliminar) {
                        println("Bebida #${i + 1}")
                        println("Codigo: ${bebidas[i][0]}")
                        println("Nombre: ${bebidas[i][1]}")
                        println("Descripcion: ${bebidas[i][2]}")
                        println("Precio: ${bebidas[i][3]}")
                        println()
                    }

                }
            }else if (entradas.size<0){
                println("Por el momento no hay ningun registro en el menu")
            }


        //OPCION 2 BUSCAR MEDIANTE EL CODIGO

        } else if(opcion==2){
            println("En cual de las siguientes categorias desea buscar el producto")
            println("1. Entrdas\n2. Platos fuertes\n3. Postres\n4. Bebidas")
            var categoria = readLine()!!.toInt()
            if (categoria==1){
                println("Digite el codigo de la entrada que desea buscar")
                var codigo = readLine()!!.toInt()
                for (i in (0 until entradas.size)){
                    if (entradas[i][0]==codigo){
                        var posicion = i
                        println("El producto que usted busca es ${entradas[posicion][1]} cuyo codigo es ${entradas[posicion][0]}")
                    }else{
                        println("El codigo no se encuentra registrado")
                    }
                }
            }else if(categoria==2){
                println("Digite el codigo del plato fuerte que desea buscar")
                var codigo = readLine()!!.toInt()
                for (i in (0 until platos.size)){
                    if (platos[i][0]==codigo){
                        var posicion = i
                        println("El producto que usted busca es ${platos[posicion][1]} cuyo codigo es ${platos[posicion][0]}")
                    }else{
                        println("El codigo no se encuentra registrado")
                    }
                }
            }else if(categoria==3) {
                println("Digite el codigo del postre que desea buscar")
                var codigo = readLine()!!.toInt()
                for (i in (0 until postres.size)) {
                    if (postres[i][0] == codigo) {
                        var posicion = i
                        println("El producto que usted busca es ${postres[posicion][1]} cuyo codigo es ${postres[posicion][0]}")
                    } else {
                        println("El codigo no se encuentra registrado")
                    }
                }
            }else if(categoria==4) {
                println("Digite el codigo de la bebida que desea buscar")
                var codigo = readLine()!!.toInt()
                for (i in (0 until bebidas.size)) {
                    if (bebidas[i][0] == codigo) {
                        var posicion = i
                        println("El producto que usted busca es ${bebidas[posicion][1]} cuyo codigo es ${bebidas[posicion][0]}")
                    } else {
                        println("El codigo no se encuentra registrado")
                    }
                }
            }else {
                println("La opcion no es valida")
            }

        //OPCION 3 MODIFICAR EL MENU
        }else if(opcion==3){
            println("En cual de las siguientes categorias desea modificar el producto")
            println("1. Entrdas\n2. Platos fuertes\n3. Postres\n4. Bebidas")
            var categoria = readLine()!!.toInt()
            println("¿Cuantas modificaciones desea realizar?")
            var modificaciones = readLine()!!.toInt()
            if (categoria==1){
                for (i in 0 until modificaciones){
                    println("Digite el codigo de la entrada que desea modificar")
                    var codigo = readLine()!!.toInt()
                    for (i in (0 until entradas.size)){
                        if (entradas[i][0]==codigo){
                            var posicion = i
                            println("El producto que usted quiere modificar es ${entradas[posicion][1]} cuyo codigo es ${entradas[posicion][0]}")

                                println("Digite el codigo de la entrada")
                                var codigo = readLine()!!.toInt()
                                entradas[posicion][0]=codigo
                                println("Digite el nombre de la entrada")
                                var nombre = readLine()!!.toString()
                                entradas[posicion][1]=nombre
                                println("Digite la descripcion de la entrada")
                                var descripcion = readLine()!!.toString()
                                entradas[posicion][2]=descripcion
                                println("Digite el pecio de la entrada")
                                var precio = readLine()!!.toInt()
                                entradas[posicion][3]=precio
                                println()
                            } else{
                                println("El codigo no se encuentra registrado")
                        }
                    }
                }

            }else if(categoria==2){
                for (i in 0 until modificaciones){
                    println("Digite el codigo del plato fuerte que desea modificar")
                    var codigo = readLine()!!.toInt()
                    for (i in (0 until platos.size)){
                        if (platos[i][0]==codigo){
                            var posicion = i
                            println("El producto que usted busca es ${platos[posicion][1]} cuyo codigo es ${platos[posicion][0]}")

                            println("Digite el codigo del plato")
                            var codigo = readLine()!!.toInt()
                            platos[posicion][0]=codigo
                            println("Digite el nombre del plato")
                            var nombre = readLine()!!.toString()
                            platos[posicion][1]=nombre
                            println("Digite la descripcion del plato")
                            var descripcion = readLine()!!.toString()
                            platos[posicion][2]=descripcion
                            println("Digite el pecio del plato")
                            var precio = readLine()!!.toInt()
                            platos[posicion][3]=precio
                            println()

                        }else{
                            println("El codigo no se encuentra registrado")
                        }
                    }
                }

            }else if(categoria==3) {
                for (i in 0 until modificaciones){
                    println("Digite el codigo del postre que desea modificar")
                    var codigo = readLine()!!.toInt()
                    for (i in (0 until postres.size)) {
                        if (postres[i][0] == codigo) {
                            var posicion = i
                            println("El producto que usted busca es ${postres[posicion][1]} cuyo codigo es ${postres[posicion][0]}")

                            println("Digite el codigo del postre")
                            var codigo = readLine()!!.toInt()
                            postres[posicion][0]=codigo
                            println("Digite el nombre del postre")
                            var nombre = readLine()!!.toString()
                            postres[posicion][1]=nombre
                            println("Digite la descripcion del postre")
                            var descripcion = readLine()!!.toString()
                            postres[posicion][2]=descripcion
                            println("Digite el pecio del postre")
                            var precio = readLine()!!.toInt()
                            postres[posicion][3]=precio

                        } else {
                            println("El codigo no se encuentra registrado")
                        }
                    }
                }

            }else if(categoria==4) {
                for (i in 0 until modificaciones){
                    println("Digite el codigo de la bebida que desea modificar")
                    var codigo = readLine()!!.toInt()
                    for (i in (0 until bebidas.size)) {
                        if (bebidas[i][0] == codigo) {
                            var posicion = i
                            println("El producto que usted busca es ${bebidas[posicion][1]} cuyo codigo es ${bebidas[posicion][0]}")

                            println("Digite el codigo de la bebida")
                            var codigo = readLine()!!.toInt()
                            bebidas[posicion][0]=codigo
                            println("Digite el nombre de la bebida")
                            var nombre = readLine()!!.toString()
                            bebidas[posicion][1]=nombre
                            println("Digite la descripcion de la bebida")
                            var descripcion = readLine()!!.toString()
                            bebidas[posicion][2]=descripcion
                            println("Digite el pecio de la bebida")
                            var precio = readLine()!!.toInt()
                            bebidas[posicion][3]=precio

                        } else {
                            println("El codigo no se encuentra registrado")
                        }
                    }
                }

            }else {
                println("La opcion no es valida")
            }
        //OPCION 4 ELIMINAR ELEMENTOS
        }else if (opcion==4){
            println("En cual de las siguientes categorias desea eliminar el producto")
            println("1. Entrdas\n2. Platos fuertes\n3. Postres\n4. Bebidas")
            var categoria = readLine()!!.toInt()
            println("¿Cuantas eliminaciones desea realizar?")
            var eliminaciones = readLine()!!.toInt()
            if (categoria==1) {
                for (i in 0 until eliminaciones) {
                    println("Digite el codigo de la entrada que desea eliminar")
                    var codigo = readLine()!!.toInt()
                    for (i in (0 until entradas.size)) {
                        if (entradas[i][0] == codigo) {
                            var posicion = i
                            println("El producto que usted quiere eliminar es ${entradas[posicion][1]} cuyo codigo es ${entradas[posicion][0]}")

                            entradas[posicion][0] = eliminar
                            println("Producto eliminado exitosamente")


                        } else {
                            println("El codigo no se encuentra registrado")
                        }
                    }
                }
            }else if(categoria==2){
                for (i in 0 until eliminaciones){
                    println("Digite el codigo del plato fuerte que desea eliminar")
                    var codigo = readLine()!!.toInt()
                    for (i in (0 until platos.size)){
                        if (platos[i][0]==codigo){
                            var posicion = i
                            println("El producto que usted busca es ${platos[posicion][1]} cuyo codigo es ${platos[posicion][0]}")

                            platos[posicion][0] = eliminar
                            println("Producto eliminado exitosamente")

                        }else{
                            println("El codigo no se encuentra registrado")
                        }
                    }
                }

            }else if(categoria==3) {
                for (i in 0 until eliminaciones){
                    println("Digite el codigo del postre que desea eliminar")
                    var codigo = readLine()!!.toInt()
                    for (i in (0 until postres.size)) {
                        if (postres[i][0] == codigo) {
                            var posicion = i
                            println("El producto que usted busca es ${postres[posicion][1]} cuyo codigo es ${postres[posicion][0]}")

                            postres[posicion][0] = eliminar
                            println("Producto eliminado exitosamente")

                        } else {
                            println("El codigo no se encuentra registrado")
                        }
                    }
                }

            }else if(categoria==4) {
                for (i in 0 until eliminaciones) {
                    println("Digite el codigo de la bebida que desea eliminar")
                    var codigo = readLine()!!.toInt()
                    for (i in (0 until bebidas.size)) {
                        if (bebidas[i][0] == codigo) {
                            var posicion = i
                            println("El producto que usted busca es ${bebidas[posicion][1]} cuyo codigo es ${bebidas[posicion][0]}")

                            bebidas[posicion][0] = eliminar
                            println("Producto eliminado exitosamente")

                        } else {
                            println("El codigo no se encuentra registrado")
                        }
                    }
                }
            }
        }

        println("¿Desea ver el menu?\n-Si\n-No")
        decision= readLine()!!.toString().lowercase()
    }while (decision=="si")

}