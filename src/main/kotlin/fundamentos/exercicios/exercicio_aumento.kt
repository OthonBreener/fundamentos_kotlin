package fundamentos.exercicios

fun main() {
    println(calcular_aumento())
    println(calcular_aumento_2())
    println(calcular_aumento_3())
    println(calcular_aumento_4())
    val salarios = listOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    println(media_3_maiores_salarios(salarios))
}

fun calcular_aumento(): List<Double> {

    val salarios = mutableListOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    for (salario in salarios) {
        val index = salarios.indexOf(salario)
        salarios[index] = salario + salario * 0.1
    }
    return salarios
}

fun calcular_aumento_2(): List<Double>{

    val salarios = mutableListOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario + salario * 0.1
    }
    return salarios
}

fun calcular_aumento_3(): List<Double> {
    // aumento mínimo de 500 reais
    val salarios = mutableListOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    salarios.forEachIndexed {index, salario ->
        var aumento = salario * 0.1
        if (aumento < 500.0) {
            aumento = 500.0
        }
        salarios[index] = salario + aumento
    }
    return salarios
}

fun calcular_aumento_4(): String {

    val gastoMensalComAumento = calcular_aumento_3().sum()
    val gastoSemestral = gastoMensalComAumento * 6

    return "Gasto em um mês: $gastoMensalComAumento, gasto semestral: $gastoSemestral"
}

fun media_3_maiores_salarios(salarios: List<Double>): Double {

    val salarios_ordenados = salarios.sortedBy { it }

    // pega os três ultimos valores de uma lista/array
    val tres_maiores = salarios_ordenados.takeLast(3)

    return tres_maiores.average()
}
