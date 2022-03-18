package fundamentos

// Para acessar atributos de uma classe utilize as palavras reservadas
// val: imutável, var: mutavel

data class Dono(var nome: String, var idade: Int) {
}

class Carro(var cor: String, var ano: Int, val dono: Dono) {

}

fun main() {
    // é a função que é executada quando o arquivo é executado

    var dono = Dono("Othon", 21)
    var carro = Carro("Branco", 2021, dono)
    println(carro.cor)
    println(carro.ano)
    carro.ano = 2022
    println(carro.ano)
    println(carro.dono)
}