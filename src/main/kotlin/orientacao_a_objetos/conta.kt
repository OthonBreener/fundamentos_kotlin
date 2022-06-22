package orientacao_a_objetos

interface Conta {
    fun sacar(valor: Double): String
    fun depositar(valor: Double): String
    fun transferir(valor: Double, contaDestino: ContaCorrente): String
}

class ContaCorrente: Conta {
    var titular: String = ""
    var numeroConta: Int = 0
    var saldo: Double = 0.0
        private set

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

    override fun transferir(valor: Double, contaDestino: ContaCorrente): String {

        return if (this.saldo < valor) {
            "Saldo insuficiente para realizar transferência. Saldo atual: ${this.saldo}"
        } else {
            contaDestino.depositar(valor)
            this.saldo -= valor
            "Valor transferido! Saldo atual: ${this.saldo}."
        }
    }
}

