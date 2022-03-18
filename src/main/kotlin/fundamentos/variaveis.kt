package fundamentos

fun main() {
    var nome = "Gusta" // variavel mutavel
    val nomeImutavel = "Gusta" // variavel imutavel
}

class variaveis {
    // variaveis declaradas dentro de classes precisam receber
    // o valor assim que definidas ou utilizar a palavra reservada
    // lateinit para atribuir depois.
    lateinit var teste: String

    fun iniciaVariavel() {
        // uma função é criada para iniciar as variaveis
        teste = "Teste"
    }
}