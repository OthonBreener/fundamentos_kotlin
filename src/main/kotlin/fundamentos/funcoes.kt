package fundamentos


// A função main é a que é chamada quando o código é executado
// A função main não retorna nada por padrão
fun main() {
    // funções podem receber outras funções como parametro
    ola(nome())

    // funções aceitam parametros nomeados
    ola(idade = 21, nome = "Bruna")
}

// é possível definir o tipo de retorno de uma função
fun nome(): String {
    return "Othon Breener"
}
// argumentos de funções podem ter valor padrão
fun ola(nome: String, idade: Int = 24) {
    println("Olá ${nome}, parabéns pelos seus ${idade} anos")
}
