class Livro(val titulo: String, var emprestado: Boolean)

class LivroIndisponivelException(message: String) : Exception(message)

fun emprestarLivro(livro: Livro) {
    if (livro.emprestado) {
        throw LivroIndisponivelException("O livro '${livro.titulo}' já está emprestado.")
    } else {
        println("Livro '${livro.titulo}' emprestado com sucesso.")
    }
}

fun main() {
    val livro1 = Livro("Aventuras no Espaço", true)
    val livro2 = Livro("Histórias de Fantasia", true)

    try {
        emprestarLivro(livro1)
        emprestarLivro(livro2)
    } catch (ex: LivroIndisponivelException) {
        println("Erro: ${ex.message}")
    }
}
