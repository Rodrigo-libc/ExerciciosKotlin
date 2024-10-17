//Calculo notas, Exercício

class Principal{
    private var listaNotas: Array<Int>? = null

    fun calcular() {

        var result = 0.0
        var houveError = false

        println("Digite o número de notas: ")
        val numeroNotas = readln().toIntOrNull()

        if (numeroNotas == null || numeroNotas > 10){
            println("Error, valor inválido ou número de notas máximo excedido (Máximo 10)")
            return
        }

        //Armazena as notas no Array com base no número de notas fornecido
        listaNotas = Array(numeroNotas){ index ->
            print("Digite a nota ${index +1}: ")
            val nota = readln().toInt()
            nota
        }

        //Itera sobre as notas para validação de erros
        listaNotas?.forEach { nota ->
            val notaText = nota.toString()

            if (notaText.isBlank()){
                println("Valor é inválido, impossível somar")
                houveError = true

            } else {

                val notaFloat = notaText.toDoubleOrNull()

                if (notaFloat == null || notaFloat < 0 || notaFloat > 10) {
                    println("Error, nota $notaFloat ultrapassa o limite permitido")
                    houveError = true

                } else {
                    result += notaFloat
                }
            }
        }
        if (!houveError){
            println("\nA soma das notas é = $result") // Mostra o resultado caso não aja erros
        }
    }
}

fun main() {
    val principal = Principal()
    principal.calcular()
}







