package orientacao_a_objetos

interface Conta {
    fun sacar(valor: Double): String
    fun depositar(valor: Double): String
    fun transferir(valor: Double, numeroConta: Int): String
}

data class ContaCorrente(
    val titular: String,
    val numeroConta: Int,
    var saldo: Double
): Conta {
    override fun sacar(valor: Double): String {
        this.saldo -= valor
        return "Saldo atual: ${this.saldo}"
    }
    override fun depositar(valor: Double): String {
        this.saldo += valor
        return "Saldo atual: ${this.saldo}"
    }
    override fun transferir (valor: Double, numeroConta: Int): String {
        this.saldo -= valor

        return "Valor transferido para: $numeroConta, Saldo atual: ${this.saldo}"
    }
}