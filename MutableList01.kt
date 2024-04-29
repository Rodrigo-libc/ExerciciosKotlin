fun main(){
  val mutavelList: MutableList<String> = mutableListOf("Maçã", "Banana", "Laranja")
        println(mutavelList[1])

        mutavelList[1] = "Manga"
            println(mutavelList.joinToString(","))
}
