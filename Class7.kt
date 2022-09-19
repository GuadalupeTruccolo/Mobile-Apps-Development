// English:
// Create an array that contains the names Juan, Laura, Mateo, and Clara. The first name should be displayed in the console in uppercase, the second one in lowercase, and the last two should be displayed together.

// Spanish:
// Crear un array que tenga asignados los nombres Juan, Laura, Mateo y Clara. El primer nombre debe mostrarse en la consola en mayúsculas, el segundo en minúsculas y los dos últimos deben mostrarse en conjunto. 

fun main(args: Array<String>) {
    val names = arrayOf("Juan", "Laura", "Mateo", "Clara")

    println(names[0].uppercase());
    println(names[1].lowercase());
    println("${names[2]} and ${names[3]}");
}