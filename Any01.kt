fun exemplo(any: Any) {
     when (any) {
         is String -> println(any.length) // Kotlin trata any como String dentro deste bloco
         is Int -> println(any * 2) // Kotlin trata any como Int dentro deste bloco
         }
}

fun main() {
     exemplo("Lizandra")
}
