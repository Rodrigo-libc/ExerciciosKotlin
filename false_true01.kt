//False, True

fun main() {

var error = false

    print("Digite algum valor: ")
    val input = readlnOrNull() ?: ""

    if (input.isBlank()){
        error = true
    }

    if (!error){
        println("Entrada valida")
    } else {
        println("Entrada invalida")
    }
}







