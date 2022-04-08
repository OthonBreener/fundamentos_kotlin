package fundamentos

fun main() {
    println(
        evalre(Soma(
                Soma(Numero(1), Numero(2)),
                Numero(4)
        )))

}

interface Expr

class Numero(val value: Int) : Expr
class Soma(val valor1: Expr, val valor2: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Numero) {
        return e.value
    }
    if (e is Soma) {
        return eval(e.valor1) + eval(e.valor2)
    }
    throw IllegalArgumentException("Expressão desconhecida")
}

// versão refatorada da eval

fun evalre(e: Expr): Int =
     when(e) {
         is Numero -> e.value
         is Soma -> evalre(e.valor1) + evalre(e.valor2)
         else -> throw IllegalArgumentException("Expressão desconhecida")
    }
