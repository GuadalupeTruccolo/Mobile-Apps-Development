// English:
// Create a program that, based on a certain numerical value, is displayed on the console to which day of the week it corresponds (For example, if the number is 1 we must show the string "Monday", if the number is 6 we must display the string "Saturday", etc.)
// In case that the number entered is less than 1 or greater than 7, we must display an error message in the console.

// Spanish:
// Crear un programa que a partir de un determinado valor numérico, se muestre por consola a que día de la semana corresponde (Por ejemplo, si el número es un 1 debemos mostrar la cadena "Lunes", si el  número es un 6 debemos mostrar la cadena "Sábado", etc.)
// En el caso de que el número ingresado sea menor a 1 ó mayor a 7 debemos informar por consola con un mensaje de error.

fun main(args: Array<String>) {
    
    fun dayOfTheWeek(num: Int) {
        when {
            num == 1 -> println("Monday")
            num == 2 -> println("Tuesday")
            num == 3 -> println("Wednesday")
            num == 4 -> println("Thursday")
            num == 5 -> println("Friday")
            num == 6 -> println("Saturday")
            num == 7 -> println("Sunday")
            else -> println("Error")
        }
    }
    dayOfTheWeek(1) // assing a value
}