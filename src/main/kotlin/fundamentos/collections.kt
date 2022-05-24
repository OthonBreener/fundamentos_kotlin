package fundamentos

fun main() {
    listas()
    // sets()
    // maps()
}

fun maps() {
    // map é uma estrutura de chave e valor, parecida com dicionarios
    // do python, matendo a regra de não poder ter chaves duplicadas
    // mas podendo ter valores

    var map_nomes = mapOf("Gustavo" to 24, "Othon" to 20)
    println(map_nomes)

    // acessando valores
    println(map_nomes["Othon"])

    // alterando valores de map mutaveis

    var map_mutavel = mutableMapOf("Gustavo" to 24, "Othon" to 20)
    println(map_mutavel)
    map_mutavel["Othon"] = 30
    println(map_mutavel)

    // removendo valores
    map_mutavel.remove("Gustavo")
    println(map_mutavel)

    // adiciona apenas se a chave não existir
    map_mutavel.putIfAbsent("Othon", 31)
    println(map_mutavel)

    map_mutavel.putIfAbsent("Gustavo", 31)
    println(map_mutavel)
}

fun sets() {

    // set é uma lista que não recebe valores iguais
    var set_numeros = setOf(1, 2, 3, 2)
    println("O set é: ${set_numeros}")

    // é possível fazer um set mutável da mesma forma que uma lista

    var set_mutavel = mutableSetOf(1, 2, 3)

    // os mesmos metodos de listas podem ser usados no set

    // verifica se contém um número
    println(set_mutavel.contains(2))
}

fun listas() {
    // 'listOf' cria uma lista imutável
    var lista = listOf(10, 2, 6, 4, 1, 5, 3, 7, 8)

    // 'mutableListOf' cria uma lista mutável
    var lista_mutavel = mutableListOf(1, 3, 6)

    // elementos podem ser acessados por indicie e pelo get
    println(lista[0])
    println(lista.get(0))

    // tamanho da lista
    println("Tamanho da lista ${lista.size}")

    // Indicie de um elemento da lista
    println("Indicie do elemento 6 é ${lista.indexOf(6)}")

    lista
        // passa por cada elemento da lista e verifica se satisfaz
        // a condição
        .filter{it % 2 == 0}
        // ordena os elementos da lista
        .sortedBy{it} // .sorted() ordena a lista tbm
        // executa para cada elemento da lista
        .forEach { println(it) }

    // Lista imutável
    println("A lista mutável é ${lista_mutavel}")
    lista_mutavel.add(8)
    lista_mutavel.add(12)
    lista_mutavel.add(-2)
    lista_mutavel.add(99)
    println("A lista mutável é ${lista_mutavel}")

    // remove o elemento do indicie
    lista_mutavel.removeAt(0)

    // remove o próprio elemento
    lista_mutavel.remove(3)
    println("A lista mutável é ${lista_mutavel}")

    // Alterando valores por indicies
    lista_mutavel[0] = 20
    println("A lista mutável é ${lista_mutavel}")

    // Alterando a ordem dos elementos aleatóriamente
    lista_mutavel.shuffle()
    println("A lista mutável é ${lista_mutavel}")
}