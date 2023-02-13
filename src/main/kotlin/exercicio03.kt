fun main() {

    val pattern = Regex("^[A-Za-z](.*)@(.+)(\\.)(com|com.br)")

    println("\n---------------------")
    println("Digite um email: ")

    val userInput = readln()

    if (userInput.matches(pattern)) {
        println("\nEmail: ${userInput}")
    }
    else println("\nRegistro inválido.")
    println("---------------------")
}