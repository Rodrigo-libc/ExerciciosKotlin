abstract class Cadastro(val nome: String) {
    abstract fun iniciar()

}
class Federal(nome: String): Cadastro(nome) {
    override fun iniciar(){
        println(" Aluno $nome cadastrado com sucesso")

    }
}

class Militar(nome: String): Cadastro(nome) {
    override fun iniciar(){
        println(" Aluno $nome cadastrado com sucesso ")

    }
}

fun main(){

    val federal= Federal("William")
    val militar = Militar("Pedro")
    federal.iniciar()
    militar.iniciar()

}
