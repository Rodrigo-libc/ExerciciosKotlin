class Pessoa(private val nome: String) {
    private fun saudacao() {
        println("Olá, meu nome é $nome")
    }

    fun apresentacao() {
        saudacao() // Chama o método saudacao() desta classe
        println("Eu sou um objeto da classe Pessoa")
    }

    fun compararNomes(outraPessoa: Pessoa): Boolean {
        return this.nome == outraPessoa.nome // Usa 'this' para se referir ao nome desta instância
    }
}

fun main() {
    val pessoa1 = Pessoa("Rodrigo")
    val pessoa2 = Pessoa("Aline")

    pessoa1.apresentacao()
    pessoa2.apresentacao()

    println(pessoa1.compararNomes(pessoa2))
}
