package fundamentos.exercicios

fun main() {
    println(calcular_aumento())
    println(calcular_aumento_2())
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