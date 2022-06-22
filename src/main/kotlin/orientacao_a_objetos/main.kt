package orientacao_a_objetos

fun main() {
    val conta = ContaCorrente()
    conta.titular = "Othon"
    conta.numeroConta = 1000
    conta.depositar(5000.0)

    val conta_1 = ContaCorrente()
    conta_1.titular = "Lucas"
    conta_1.numeroConta = 1001
    conta_1.depositar(5200.0)

    println(conta.sacar(1000.0))
    println(conta.sacar(5000.0))
    println(conta.depositar(520.31))
    println(conta.transferir(1000.0, conta_1))
    println(conta_1.saldo)
}
