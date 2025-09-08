//procedimineto que no devuelve nada
fun saludar (saludo: String = "Hola", nombreCompleto: String){
println("$saludo, mi nombre es $nombreCompleto") //Hola, mi nombre es Josue Matias Molina Palacios
}

//procedimiento que devuelve un string
fun obtenerGenero(genero: String): String{
    return "mi genero es $genero" //Mi genero es Masculino
}

fun main(){
    val nombreCompleto = "Josue Matias Molina Palacios"
    val genero = "masculino"

//llamada al procedimiento
    saludar(nombreCompleto = nombreCompleto)

//llamada a la funcion
    val mensajeGenero = obtenerGenero(genero)
    println(genero)
}