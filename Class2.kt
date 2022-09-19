// English:
// In this challenge you have to write the code to display the result of the following operations:
// - Assign the result of the sum of 1 plus 2 plus 3 to a variable called “a”.
// - Decrement the variable “a” by one.
// - Duplicate the value of the variable ”a” using the compound assignment operator.
// - Finally, concatenate the text “Maradona wore soccer jersey number ” with the value of the variable called “a”.

// Spanish:
// En este desafío tenés que escribir el código para mostrar el resultado de las siguientes operaciones por consola:
// - Asignar el resultado de la suma de 1 más 2 más 3 a una variable llamada “a”.
// - Decrementar en uno la variable “a”.
// - Duplicar el valor de la variable ”a” usando el operador de asignación compuesto.
// - Finalmente concatenar el texto “Maradona usaba la ” con el valor de la variable llamada “a”. 

fun main(args: Array<String>) {
    var a = 1 + 2 + 3
    a--
    a*=2

    println("Maradona wore soccer jersey number $a.")
}