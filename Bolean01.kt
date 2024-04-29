class Treino(val nome: String, val treino:Boolean)

fun foiTreinar(treinoParametro: Treino) {
    if (treinoParametro.treino) {
        println("${treinoParametro.nome} treinou hoje")
    } else {
        println("${treinoParametro.nome} não treinou hoje")
    }
}
fun main() {
    val treino = Treino("Rodrigo",false)
    val treino2 = Treino("Aline",true)

    foiTreinar(treino)
    foiTreinar(treino2)
}
