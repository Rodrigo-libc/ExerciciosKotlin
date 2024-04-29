interface Trabalhavel {
    fun trabalhar()
}

class Empresa(private val nome: String) {

    inner class Funcionario(private val nome: String) : Trabalhavel {
        override fun trabalhar() {
            println("$nome está trabalhando na $nomeEmpresa")
        }
    }

    val nomeEmpresa: String
        get() = this.nome
}
fun main() {
    val empresa = Empresa("JetBrains.")
    val funcionario = empresa.Funcionario("Rodrigo")

    funcionario.trabalhar()
}
