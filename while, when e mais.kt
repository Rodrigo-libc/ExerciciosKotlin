fun main() {
    var continuar = true

    val produtos = mutableListOf("Arroz", "Feijao", "Macarrão", "Leite")

    while (continuar) {
        println(
            """
                
            Digite uma das opções a seguir:
            1 - Ver lista de produtos
            2 - Adicionar produto
            3 - Remover produto
            sair - Encerrar programa
            """.trimIndent()
        )

        print("Opção: ")

        val opcao = readln().trim()
        println()

        when (opcao) {
            "1" -> {
                println("Produtos disponíveis:")
                produtos.forEachIndexed { index, item -> println("${index+1}: $item")}}
            "2" -> {
                println("Digite o nome do produto que deseja adicionar: ")
                val produto = readln().trim()
                if (produto.isNotEmpty()){
                    produtos.add(produto)
                    println("$produto adicionado com sucesso.")

                } else println("Produto vazio não pode ser adicionado, tente novamente...")
            }
            "3" -> {

                if (produtos.isEmpty()){
                    println("Lista vazia, não há nada pra remover")
                }
                println("Produtos disponíveis para remover:")
                produtos.forEachIndexed { index, item ->
                    println("${index+1}: - $item ")
                }
                println("Digite o número do produto que deseja remover: ")
                val entrada = readln().trim()
                val indice =  entrada.toIntOrNull()

                if (indice != null && indice in 1..produtos.size){
                    val removido = produtos.removeAt(indice - 1)
                    println("Produto \"$removido\" removido com sucesso.")
                } else {
                    println("Número inválido.")
        }

            }
            "sair" -> {
                println("Encerrando o programa...")
                continuar = false
            }
            else -> println("Opção inválida, tente novamente.")
        }

    }
}
