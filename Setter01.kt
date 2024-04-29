class Retangulo {
    var largura: Int = 0
        set(value) {
            field = value
            atualizarArea()
        }

    var altura: Int = 0
        set(value) {
            field = value
            atualizarArea()
        }

    var area: Int = 0
        private set

    private fun atualizarArea() {
        area = largura * altura
    }
}

fun main() {
    val meuRetangulo = Retangulo()


    println("Área Inicial: ${meuRetangulo.area}")


    meuRetangulo.largura = 5
    meuRetangulo.altura = 10


    println("Nova Área: ${meuRetangulo.area}")
}
