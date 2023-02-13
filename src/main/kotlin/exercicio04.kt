import java.util.regex.Pattern

fun main() {

    val pattern = Regex("^((\\(?)[1-9]{2}(\\)?))( )?(9[0-9]{4}(-| ?)[0-9]{4})$")

    println("\n---------------------")
    println("Digite um número de telefone celular: ")

    val userInput = readln()

    if (userInput.matches(pattern)) {
        val output = pattern.replace(userInput, "($1) $5")
        println("\nO número de telefone celular é $output")
    }
    else println("\nRegistro inválido.")
    println("---------------------")
}