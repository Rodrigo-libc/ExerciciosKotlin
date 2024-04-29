fun main(){
    val imutavelList: List<String> = listOf("Maçã", "Banana", "Laranja")

    println(imutavelList[1])
        imutavelList[1] = "Manga" //Erro, não é possível adcionar itens a lista

            println(imutavelList.joinToString(","))
}
