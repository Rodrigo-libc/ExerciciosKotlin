class Pessoa(val nome: String) {

    inner class Endereco(private val rua: String, private val cidade: String, private val estado: String) {
        fun detalhesEndereco() {
            println("Rua: $rua, Cidade: $cidade, Estado: $estado")
        }
    }
}
fun main() {
    val pessoa = Pessoa("Rodrigo")
    val endereco = pessoa.Endereco("Rua Principal", "Munique", "Baviera")

    println("Nome: ${pessoa.nome}")
    endereco.detalhesEndereco()
}
