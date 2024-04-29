class Pessoa {
    var idade: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}

fun main() {
    val pessoa = Pessoa()

    println("Idade inicial: ${pessoa.idade}")

    pessoa.idade = 30
    println("Idade após atribuição: ${pessoa.idade}")

    pessoa.idade = -5
    println("Idade após atribuição inválida: ${pessoa.idade}")
}
