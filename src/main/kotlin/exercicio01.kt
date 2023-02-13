fun main() {

    val pattern = Regex("(^[0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})$|^[0-9]{3}[\\" +
            ".]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2}$")

    println("\n---------------------")
    println("Digite um CPF ou CNPJ para validação: ")

    val userInput = readln()

    if (userInput.matches(pattern)) {
        println("\nRegistro válido.")
    }
    else println("\nRegistro inválido.")
    println("---------------------")
}