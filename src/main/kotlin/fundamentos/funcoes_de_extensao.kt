package fundamentos

fun main() {
    println("Othon".pegar_ultimo_caracter())
    println("Othon".pegar_caractere)

    val nome = StringBuilder("Othon?")
    nome.pegar_caractere = '!'
    println(nome)

    // Funções de extensão nativas do kotlin
    val lista_de_strings: List<String> = listOf("Primeiro", "Segundo", "Terceiro")
    println(lista_de_strings.last())

    val lista_de_numeros: Collection<Int> = setOf(1, 12, 3)
    println(lista_de_numeros.maxOrNull())

    // função que desempacota
    desempacto_lista(arrayOf("Primeiro", "segundo", "terceiro"))
}

// declarando uma função de extensão
fun String.pegar_ultimo_caracter(): Char = this.get(this.length - 1)

// declarando uma propriedade de extensão
val String.pegar_caractere: Char
    get() = get(length - 1)

// declarando uma propriedade de extensão mutável
// Devemos usar um StringBuilder, pois o mesmo permite alterar seu conteudo
var StringBuilder.pegar_caractere: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

// Utilizando o operador '*' para fazer desempacotamento
fun desempacto_lista(lista: Array<String>) {
    val lista_d = listOf(*lista)
    println(lista_d)
}