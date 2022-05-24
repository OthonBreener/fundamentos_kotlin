package fundamentos

fun main() {
    //exibe_valores(2, 10)
    //laco_while()
    //laco_do_while()
    //test_when(5)
    println(verifica_comeco_da_string("oi othon"))
}

fun exibe_valores(inicio: Int, fim: Int) {
    // Para criar um range de 1 a n, basta usar 1..n
    for(numero in 1..10){
        println(numero)
    }
    // Para criar um range decrescente use downTo
    for(numero in 10 downTo 1){
        println(numero)
    }
    // Para pular um numero na sequencia
    for(numero in inicio .. fim step 2) {
        println(numero)
    }
}

// while verifica se a condição é válida antes de rodar
fun laco_while() {
    var x = 0
    while(x < 10) {
        println(x)
        x += 1
    }
}

// do While, roda primeiro e depois verifica a condição
fun laco_do_while() {
    var x = 10
    do {
        println(x)
        x += 1
    } while(x<10)
}

// Estrutura when

fun test_when(x: Int) {
    // when é parecido com um if, se lê:
    // quando x=5 executa(->) tal coisa
    when(x){
        5 -> println("x é 5")
        8 -> println("x é 8")
        10 -> {
            // quando x for 10 tudo dentro do bloco é executado
            println("x é 10")
        }
        // é possível fazer varias validações
        6, -6 -> {
            println("é 6 e -6")
            println("Ao mesmo tempo...")
        }
        // é possível usar o in para dizer que o valor está
        // dentro de um range
        in 11..18 -> println("Está entre 11 e 18")
    }
}

fun verifica_comeco_da_string(x: Any): Boolean {
    return when(x) {
        // startsWith verifica se começa com um prefixo
        is String -> x.startsWith("oi")
        else -> false
    }
}

