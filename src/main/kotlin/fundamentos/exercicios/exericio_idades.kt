package fundamentos.exercicios

fun main () {
    var idades = listOf(22, 25, 16, 44, 31, 11, 9, 61, 72)

    println(maior_idade(idades))
}

fun maior_idade (lista_idades: List<Int>): Map<String, Int> {

    val idades_ordenadas = lista_idades.sortedBy{it}
    val maior_idade = idades_ordenadas.last()
    val menor_idade = idades_ordenadas.first()
    // outra forma é usar o max, lista_idades.max() ou lista_idades.min()
    val maior_e_menor_idade = mapOf("maior idade" to maior_idade, "menor idade" to menor_idade)

    // calcula a media dos dados
    val mediaIdades = lista_idades.average()

    // devolve true se todos os itens satisfazerem a condição
    val todosMaiores18 = lista_idades.all { it >= 18 }

    // devolve true se pelo menos um for maior que 18
    val umMaiorQue18 = lista_idades.any { it >= 18 }

    // devolve os dados que satisfazem a condição
    val maiores = lista_idades.filter { it >= 18 }

    return maior_e_menor_idade
}