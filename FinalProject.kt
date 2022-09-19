// English:
// This is the final project I worked in. Our main goal was to design an application with the objective of feeding our pets remotely, connecting our devices to a smart feeder. Two of the main functions of our app were setting a specific time to feed our pets remotely and choosing the amount of grams we wanted to feed them.

// Spanish:
// Este es el proyecto final en el que trabajé. Nuestro objetivo principal era diseñar una aplicación móvil con el objetivo de alimentar a nuestras mascotas de forma remota, conectando nuestros dispositivos a un alimentador inteligente. Dos de las funciones principales de nuestra aplicación eran establecer un tiempo específico para alimentar a nuestras mascotas de forma remota y elegir la cantidad de gramos que queríamos darles de comer.

// Timer - Temporizador

fun main(args: Array<String>) {
    
    fun time (hours: Int, minutes: Int) {
        if (hours <= 12 && minutes <= 59) {
            println("The animal's feeding time is set to $hours:$minutes.")
        } else {
            print("Please enter a valid time.")
        }
    }
    time(10, 15)
}

// Choosing the amount of food - Eligiendo la cantidad de comida

fun main(args: Array<String>) {

    fun feed (grams: Int) {
        
        when {
            grams == 50 -> println("You added 50 grams.")
            grams == 100 -> println("You added 100 grams.")
            grams == 150 -> println("You added 150 grams.")
            grams == 200 -> println("You added 200 grams.")
            grams == 250 -> println("You added 250 grams.")
            grams > 250 -> println ("You can not add more than 250 grams.")
            (grams < 250 && grams > 0) -> println("You must add 50 to 250 grams in quantities of 50 grams.")  
            else -> println("Invalid quantity.")
        }
    }
    feed(250)
}