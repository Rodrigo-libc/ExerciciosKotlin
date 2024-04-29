class Motocicleta(val objeto: String, val cor: String, val vendida: Boolean)

class MotoVendidaExeption(message: String): Exception(message)

fun comprarMoto(motocicleta: Motocicleta) {

    if (motocicleta.vendida) {
        throw MotoVendidaExeption("A moto ${motocicleta.objeto} ja foi vendida")}
    else {
        println("A moto ${motocicleta.objeto}"+
                " de cor ${motocicleta.cor} seria outra opção")
    }

}

fun main(){

    val motoA= Motocicleta("Fazzer 150","Azul", true)

    val motoB = Motocicleta("CB 300","Vermelha", false)

    try{
        comprarMoto(motoA)
        comprarMoto(motoB)
    }catch(ex:MotoVendidaExeption){    println("Erro: ${ex.message}")

    }

}
