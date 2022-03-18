package fundamentos

fun main() {
    println(par_ou_impar(2))
    println(par_ou_impar(3))
    aprovacao_teste(10)
    aprovacao_teste(3)
}
// Você pode usar o return if para já retornar seu objeto
fun par_ou_impar(numero: Int): String {
    return if (numero % 2 == 0)
        "Par"
    else
        "Impar"
}

// A sintax do kotlin aceita os if e else com ou sem chaves
fun aprovacao_teste(nota: Int) {
    if (nota >= 6){
        println("Passou")
    } else if (nota >= 4){
        println("Recuperação")
    } else {
        println("Reprovado")
    }
}