// English:
// Create a function called "interval" that has three parameters called "number", "min" and "max" and determine if the value of the variable "number" is within the interval between min and max.
// Call this function and assign 3 values ​​to the function call.

// Spanish:
// Crear una función llamada "intervalo" que posea tres parámetros llamados “número”, “min” y “max” y determinar si el valor de la variable “número” se encuentra dentro del intervalo entre min y max. 
// Llamá a esta función desde el main y pasale los 3 valores al llamado de la función.

fun main(args: Array<String>) {
    
    fun interval (number: Int, min: Int, max: Int) {
        if(number in min..max) {
            print("Number $number is within $min and $max.")
        } else {
            print("Number $number not within $min and $max.")
        }
    }
    interval(7, 0, 10)
}
