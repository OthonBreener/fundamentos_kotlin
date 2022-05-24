package fundamentos

import java.io.BufferedReader
import java.io.StringReader

fun main() {
    // lancando_execessoes_1(8)
    //lancando_excessoes_2(11)

/*
A classe Java StringReader permite que você transforme uma String comum em um Reader.
Isso é útil se você tiver dados como uma String, mas precisar passar essa String para
um componente que aceite apenas um Reader.
*/
    val reader = BufferedReader(StringReader("239"))
    //println(lancando_excecoes_3(reader))
    println(lancando_excecoes_4(reader))

}

fun lancando_execessoes_1(numero: Int) {
    if (numero !in 0..100 step 2) {
        throw IllegalArgumentException(
            "O numero $numero deve estar dentro do intervalo"
        )
    }
}

fun lancando_excessoes_2(numero: Int) {
    if (numero in 1..10) {
        println(numero)
    }
    else {
        throw IllegalArgumentException(
            "O valor deve estar no intervalo de 1 a 10"
        )
    }
}

// BufferedReader classe para ler arquivos
fun lancando_excecoes_3(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()

        // Integer.parseInt: transforma um numero no formato string para int
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

fun lancando_excecoes_4(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }
    catch (e: NumberFormatException) {
        null
    }
    println(number)
}