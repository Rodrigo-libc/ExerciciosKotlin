class ExemploThis(private val nome: String, private val idade: Int){

    fun conflito(nome: String){
        println("Nome: ${this.nome} Idade: $idade")
        println(nome)

    }
}

fun main(){
    val exemplo= ExemploThis("Rodrigo", 28)
    exemplo.conflito("Aline")

}
