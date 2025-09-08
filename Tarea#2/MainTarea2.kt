fun saludar (saludo: String = "Hola", nombreCompleto: String){
println("$saludo, mi nombre es $nombreCompleto")
}


fun obtenerGenero(genero: String): String{
    return "mi genero es $genero"
}

fun main(){
    val nombreCompleto = "Josue Matias Molina Palacios"
    val genero = "masculino"


    saludar(nombreCompleto = nombreCompleto)

    val mensajeGenero = obtenerGenero(genero)
    println(genero)
}