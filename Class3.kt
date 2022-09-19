// English:
// Create 2 variables, assign them different values ​​and use a conditional and display in the console which of the two numbers is bigger.

// Spanish:
// Creá 2 variables, asignales diferentes valores y utiliza un condicional para informar por consola cuál de los dos números es más grande.

fun main(args: Array<String>) {
    val n1 = 6
    val n2 = 9

    if (n1 > n2) {
        println("$n1 es mayor a $n2")
    } else {
        println("$n2 es mayor a $n1")
    }
}

// Personal Challenge - Desafío personal:

// English:
// Create a program that evaluates a student's grades to report if they passed the subject (based on the grade system used in Argentina, divided into two semesters).

// Spanish:
// Crear un programa que evalúe las notas de un estudiante para informar si aprobó la materia.

fun main(args: Array<String>) {

    fun notas (nota1: Int, nota2: Int){
        if(nota1 >= 6 && nota2 >= 6) {
            println("Aprobaste ambos cuatrimestre de la materia.")
        } else if (nota1 >= 6 && nota2 < 6) {
            println("Debés recuperar el 2do cuatrimestre.")
        } else if (nota1 < 6 && nota2 >= 6 ) {
            println("Debés recuperar el 1er cuatrimestre.")
        } else {
            println("¡A seguir trabajando! Debés recuperar toda la materia.")
        }
    }
    
    notas(3, 6) // assing the values
}