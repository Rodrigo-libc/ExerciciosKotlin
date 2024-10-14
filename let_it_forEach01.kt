// let it e forEach

fun main() {

    val listaCores: List<String> =  listOf("Amarelo","Rosa","Vermelho","Verde")


        listaCores.let {

             it.forEach { cor ->
                println("Cor: $cor")

            }
        }
                /*
                    Saida:
                    Cor: Amarelo
                    Cor: Rosa
                    Cor: Vermelho
                    Cor: Verde
                 */

    /* val listaCores: List<String>? = null

    listaCores?.let {

        it.forEach { cor ->
            println("Cor: $cor")

        }
        //Nada seria mostrado nesse exemplo, pois a lista é nula
    }*/

}



