package fundamentos

fun main() {
    // o ponto ? no final do tipo string diz para o compilador
    // que essa variavel pode ser nula
    var nome: String? = null

    // como a variavel pode ser nula, quando fazer uma operação
    // com ela é preciso indicar assim como no typing com '?'
    println(nome?.length)
    // se nome for null, retorna null


    var outro_nome: String? = "Eu"

    // Tamanho recebe nome que pode ser nulo mas tamanho tem
    // que ser inteiro
    // O operador '?:' atribui o valor a direita, caso o valor da
    // esquerda seja nulo
    var tamanho: Int = outro_nome?.length ?: 0
}