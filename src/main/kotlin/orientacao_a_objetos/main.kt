package orientacao_a_objetos

fun main() {
    val conta = ContaCorrente("Othon", 1000, 5000.0)
    println(conta.sacar(1000.0))
    println(conta.depositar(520.31))
}