//Uso do let com It e forEach

fun main() {

    val listCores: List<String> =  listOf("Amarelo","Rosa","Vermelho","Verde")

    val listaCoresMutavel = listCores.toMutableList() //Transformando em uma lista mutável

        listaCoresMutavel.let {
            it.forEach { Cor ->
                println("Fruta: $Cor")
                /*
                    Saida:
                    Fruta: Amarelo
                    Fruta: Rosa
                    Fruta: Vermelho
                    Fruta: Verde
                 */
            }

            it.clear() //Limpando a lista
        }
        
            if (listaCoresMutavel.isEmpty()){
                println(listaCoresMutavel) //Mostra a lista vazia -> []
                println("A lista foi esvaziada...")
            }

}



