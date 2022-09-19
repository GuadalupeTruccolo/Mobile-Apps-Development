fun main(args: Array<String>) {
    val programmingLanguages = arrayOf("Python", "Java", "C#", "C++", "JavaScript")
    
    println("- Programming Languages -")
    for ((index, value) in programmingLanguages.withIndex()) {
        println("The element at $index is $value")
    }
    
    val numbersList = arrayOf(1, 2, 3, 4, 5)
    
    println("- Number List -")
    for(num in numbersList[0]..numbersList.last()) {
        println("$num")
    }
    
    val sum = numbersList.sum()
    
    println("The sum of the array results in $result")
}