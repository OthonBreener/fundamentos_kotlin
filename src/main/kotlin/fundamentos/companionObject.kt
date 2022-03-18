package fundamentos

fun main() {
    // companion object permite criar a classe sem instânciar
    var primeiraclasse = PrimeiraClasse.criaClasse()

    // precisa instânciar para criar a classe
    var segundaclasse = SegundaClasse(
        "Teste", "teste", 21
    ).criaClasse()
}

class PrimeiraClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criaClasse(): PrimeiraClasse {
            return PrimeiraClasse(
                "Othon", "3895000", 24
            )
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criaClasse(): SegundaClasse {
        return SegundaClasse(
            "Othon", "3895000", 24
        )
    }
}
