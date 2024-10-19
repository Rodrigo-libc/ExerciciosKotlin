//Uso do .apply{}
class Pessoa {
    var nome: String = ""
    var idade: Int = 0

    fun saudacao(){
        println("Meu nome é $nome e tenho $idade anos de idade.")
    }
}

fun main() {
    val pessoa = Pessoa().apply {
        nome = "Rodrigo"
        idade = 29
    }
    pessoa.saudacao()
}
