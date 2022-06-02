package orientacao_a_objetos

fun main() {
    val conta_1 = ContaCorrente("Lucas", 1001, 5200.0)
    val conta_2 = ContaCorrente("Matheus", 1002, 5300.0)
    val conta = ContaCorrente("Othon", 1000, 5000.0)

    contas.add(conta_1)
    contas.add(conta_2)
    contas.add(conta)

    println(conta.sacar(1000.0))
    println(conta.sacar(5000.0))
    println(conta.depositar(520.31))
    println(conta.transferir(1000.0, 1001))
    println(conta_1.saldo)
}
