//False, True 2

fun main() {
    var encontrouItem = false

    val frutas =  listOf("Banana","Maça","Manga")
        for (f in frutas){
            if (f == "Maça"){
                encontrouItem = true
            }
        }

    if (encontrouItem){
        println("Fruta encontrada")
    } else
        println("Fruta não encontrada")

}
