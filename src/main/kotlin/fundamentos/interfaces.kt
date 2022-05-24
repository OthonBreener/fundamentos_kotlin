package fundamentos

fun main(){
    //Button().click()
    //Button().exibir()
    //Button().configurandoFoco(false)
}

/*
Uma interface declara um método abstrato, todas as classes não abstratas
que implementão essa interface devem prover uma implementação do metodo abstrato
*/
interface Clicavel {
    fun click()
    // método de interface com implementação default
    fun exibir() = println("Eu cliquei sem clicar")
}

interface Focavel {
    fun configurandoFoco(b: Boolean) {
        return println("Eu estou ${if (b) "focado" else "desfocado"}")
    }
    fun exibir() = println("Eu estou focado")
}

// Implementação de uma interface
class Button: Clicavel, Focavel {
    override fun click() = println("Eu cliquei aqui")
    override fun exibir() {
        super<Focavel>.exibir()
    }
}

/*
Modificadores de acesso.

Por padrão as classes em Kotlin são marcadas como 'final',
ou seja, não é possível criar uma subclasse apartir de uma
classe padrão. Para permitir a herança entre classes, a classe
deve começar com 'open'.

Além disso, é necessário marcar todos os métodos que podem ser
sobscritos com o operador open.
 */

open class ClasseMae: Clicavel {
    override fun click() {
        return println("Classe mãe clica aqui!")
    }
    fun metodoFechado() = println("Eu não posso ser sobscrito na herança!")
    open fun metodoAberto() = println("Eu posso ser sobscrito na herança!")
}

class ClasseFilha: ClasseMae() {
    override fun click() = println("Click da classe filha")
    override fun metodoAberto() = println("Eu fui sobscrito!")
}

/*
Classe abstrata

Uma classe marcada com 'abstract' não pode ser
instânciada. Classes abstratas possuem membros
ahstratos que não tem implementações e devem ser
sobscritos.
Membros abstratos são sempre abertos.
 */

abstract class Animacao {
    abstract fun animando() // método abstrato, deve ser sobscrito
    open fun pararAnimacao() { // funções nao abstratas podem ser marcadas como open, mas sao final por default
    }
    fun reanimar() {}
}