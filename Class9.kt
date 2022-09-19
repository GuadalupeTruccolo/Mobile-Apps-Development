class Dog {
    var breed : String = "";
    var name : String = "";
    var eyeColour : String = "";

    fun showData() {
        println("Dog breed: ${breed}")
        println("Dog name: ${name}")
        println("Eye colour: ${eyeColour}")
    }
}

fun main(args: Array<String>) {
    var dog = Dog()
    dog.breed = "Collie"
    dog.name = "Prócer"
    dog.eyeColour = "black"
    
    dog.showData()
}