//False, True Algoritimo

fun dobrar(){
    var result = 0
    var errorDobrar =  false

    print("Digite o valor para ser dobrado: ")
    val dobrarVar = readlnOrNull()?.toInt()

    if (dobrarVar == null || dobrarVar < 0) {
        println("Error, o valor não pode ser dobrado. ")
        errorDobrar = true

    } else if (dobrarVar > 10){
        println("Valor ultrapassa o limite permitido. ")
        errorDobrar = true
    } else {
        result += dobrarVar * 2
    }

    if (!errorDobrar && result > 0){
        println("Valor dobrado = $result")
    }
}

fun main() {
   dobrar()
}
