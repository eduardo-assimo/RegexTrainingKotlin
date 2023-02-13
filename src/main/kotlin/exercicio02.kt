fun main() {

    val pattern = Regex("^([1-9][0-9]*)(\\.|\\,\\d{0,2}[0-9])?$")

    println("\n---------------------")
    println("Digite um valor monetário: ")

    val userInput = readln()

    if (userInput.matches(pattern)) {
        println("\nO valor é de R$ ${userInput}.")
    }
    else println("\nRegistro inválido.")
    println("---------------------")
}