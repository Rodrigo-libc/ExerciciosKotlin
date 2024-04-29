data class Pessoa(val nome: String, val idade: Int)

fun main() {
     val pessoa = Pessoa("Lizandra", 26)

     when (pessoa) {
         Pessoa("Rodrigo", 28) -> println("Este é Rodrigo")
         Pessoa("Aline", 25) -> println("Esta é Aline")
         else -> println("Pessoa não reconhecida")
         }
}
