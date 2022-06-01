package fundamentos.exercicios

/*
Diferença entre as funções sortBy e sortedBy

- sortBy: altera a propria lista, só funciona com lista mutavéis
- sortedBy: cria uma nova lista apartir da lista inicial
 */

fun main() {

    lista_de_livros.exibirFormatado()

    println("Comparação pelo método sortedby")
    // sortedby ordenada pela condição passada
    val lista_ordenada_c = lista_de_livros.sortedBy{it?.titulo}
    lista_ordenada_c.exibirFormatado()

    println("Mapa dos livros")
    lista_de_livros
        // groupBy cria um map(dicionario python)
        .groupBy {it?.editora}
        .forEach { (editora, livros) ->
            // operador ?: define um valor default caso tenha um valor que possa ser nulo
            println("Nome da editora: $editora, Livros: ${livros.joinToString{ it?.titulo ?: "Abacaxildo"}}")
        }
}

data class Livros (
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
): Comparable<Livros> {
    // O dataclass Livros estende Comparable para que seja possível comparar instâncias de Livros.
    // Para isso tem que sobscrever o metodo compareTo
    override fun compareTo(other: Livros): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }
}

data class Prateleira (
    val genero: String,
    val livros: MutableList<Livros>,
) {
    fun organizarPorAutor(): MutableList<Livros> {
        livros.sortBy { it.autor }
        return livros
    }
}


val livro_1 = Livros(
    titulo="Kotlin em Ação",
    autor="Dmitry Jemerov",
    anoPublicacao = 2017,
    editora="Novatec"
)

val livro_2 = Livros(
    titulo="Análise de dados com Pandas",
    autor="Daniel Y. Chen",
    anoPublicacao = 2018,
    editora="Novatec"
)

val livro_3 = Livros(
    titulo="Python Fluente",
    autor="Luciano Ramalho",
    anoPublicacao=2015,
    editora="Novatec"
)

val lista_de_livros = mutableListOf<Livros?>(livro_1, null, livro_2, null, livro_3)

fun List<Livros?>.exibirFormatado() {
    val textoFormatado = this.filterNotNull().joinToString(separator = "\n") {
        "* ${it.titulo} - ${it.autor} "
    }
    println("########## Lista de Livros ############# \n$textoFormatado")
}