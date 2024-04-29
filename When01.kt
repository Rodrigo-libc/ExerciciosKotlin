fun descricao(obj: Any): String {
    return when (obj) {
        is String -> "É uma String"
        is Int -> "É um Inteiro"
        is Double -> "É um Double"
        else -> "Tipo desconhecido"
    }
}
fun main() {
    println(descricao(28))
}
