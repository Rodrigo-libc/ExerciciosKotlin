//Algoritimo soma das notas

fun calcular(){

    val notas: List<String> = listOf("7.5", "10", "8.2", "10")

    var soma = 0.0
    var error = false

    notas.forEach { notaText ->

        if (notaText.isBlank()){
            println("Digite todas as notas primeiro")
            error = true
        } else {
            val nota = notaText.toDoubleOrNull()

            if (nota == null || nota < 0 || nota > 10){
                println("Nota: $nota invalida, somente notas entre (0-10)")
                error = true
            }
            else {
                soma += nota
            }
        }
    }

    if (!error && soma > 0.0){
        println("Valor da soma = $soma")
    } else{ println("Valor é invalido para a soma") }
}

fun main() {

    calcular()
    
    //Saida Valor da soma = 35.7

}
