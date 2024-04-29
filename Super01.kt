open class Pai{
    open fun saudacao(){
        println("Eu sou o pai!")
    }
}

class Filha:Pai(){

    override fun saudacao() {
        super.saudacao()
        println("Eu sou a filha!")
    }

}

fun main() {
    val superExemplo = Filha()
    superExemplo.saudacao()
}
