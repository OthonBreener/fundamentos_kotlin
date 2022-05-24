package fundamentos

import java.util.TreeMap

fun main() {
    // armazernar_binario()
    interando_em_colecao()
    val map = mapOf(1 to "One", 7 to "seven")
    println(map)
}
// TreeMap = Parecido com um dicionario ordenado, amarzena valores na ordem crescente.

fun armazernar_binario() {

    val representacaoBinarios = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code) // converte codigo ascii em binário
        representacaoBinarios[c] = binary
    }

    for ((letra, binario) in representacaoBinarios) {
        println("$letra = $binario")
    }

}

fun interando_em_colecao() {

    val list = arrayListOf("10", "11", "1001")
    // withIndex cria um especie de tupla - semelhante ao enumerate
    for ((index, elemento) in list.withIndex()) {
        println("$index = $elemento")
    }
}

// usando o in para verificação

fun verifica_se_e_letra_ou_numero(c: Char) = when (c) {
    in '0'..'9' -> "É um digito"
    in 'a'..'z', in 'A'..'Z' -> "É uma letra"
    else -> "I don't know"
}