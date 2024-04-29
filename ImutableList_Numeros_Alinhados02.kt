fun main() {
    val listaNumeros: List<Int> = listOf(1, 2, 3, 4, 5)
    val numerosConcatenados = listaNumeros.joinToString(" ")
        println(numerosConcatenados) //A saída será do tipo String
}
