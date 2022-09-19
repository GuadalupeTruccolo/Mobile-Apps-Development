// English:
// Create a program using a while loop that displays the values ​​from 1 to 5 and display in the console whether these numbers are odd or even.

// Spanish:
// Desarrollar un programa utilizando un bucle while que muestre los valores que van del 1 al 5 e informar por consola si cada uno de estos números es par o impar.

// One way to do it - Una forma de hacerlo

fun main(args: Array<String>) {
    var n1 = 1

    while (n1 > 0 && n1 < 6) {
        if(n1 % 2 == 0) {
            println("$n1 es par")
        } else {
            println("$n1 es impar")
        } 
        n1++
    }
}

// Another way to do it - Otra forma de hacerlo

fun main(args: Array<String>) {
    var i = 1
    
    while (i < 6) {
        println(i)
    when {
        i == 1 -> println("Número impar")
        i == 2 -> println("Número par")
        i == 3 -> println("Número impar")
        i == 4 -> println("Número par")
        i == 5 -> println("Número impar")
    }
    i++
    }
}
