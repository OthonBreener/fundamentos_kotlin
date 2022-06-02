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
        return if (this.saldo < valor) {
            "Saldo insuficiente, saldo atual: ${this.saldo}"
        } else {
            this.saldo -= valor
            "Saldo atual: ${this.saldo}"
        }
    }

    override fun depositar(valor: Double): String {
        this.saldo += valor
        return "Saldo atual: ${this.saldo}"
    }

    override fun transferir (valor: Double, numeroConta: Int): String {

        var transferido = false
        for (conta in contas) {
            if (conta.numeroConta == numeroConta) {
                conta.saldo += valor
                transferido = true
            }
        }
        return if (!transferido) {
            "Conta $numeroConta não encontrada!"
        } else {
            this.saldo -= valor
            "Valor transferido para: $numeroConta, Saldo atual: ${this.saldo}"
        }
    }
}

val contas = mutableListOf<ContaCorrente>()
