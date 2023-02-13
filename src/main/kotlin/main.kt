fun main() {
    println("---------------------")
        val patternNumbers = Regex("[0-9]\\.[0-9]")
        val numberTest = "3.0"
        println("NumberTest: ${numberTest.matches(patternNumbers)}")
    println("---------------------")

    println("---------------------")
        val patternLetters = Regex("[gG][a-zA-Z]{4,5}")
        val lettersTest = "Guilherme"
        println("LettersTest: ${lettersTest.matches(patternLetters)}")
    println("---------------------")

    println("---------------------")
        val cpfPatternNumbers = Regex("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}")
        val cpfNumberTest = "123.456.789-10"
        println("CpfNumberTest: ${cpfNumberTest.matches(cpfPatternNumbers)}")
    println("---------------------")
}