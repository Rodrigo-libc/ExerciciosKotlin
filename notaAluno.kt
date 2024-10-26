//Nota Aluno

class Aluno{
    var error =  false

    val notas: MutableList<Double> = mutableListOf()

    fun notaAluno(){

        for (i in 0 until 5) {
            print("Digite a nota da disciplina ${i + 1 }: ")
            val inputNota = readln().toDoubleOrNull()
            if (inputNota != null && inputNota >= 0) {
            notas.add(inputNota)
            } else {
                println("Valor inválido, digite as notas corretamente.")
                error = true
                break
            }
        }
    }
}

fun main() {
    var soma = 0.0

    val aluno =  Aluno()
        aluno.notaAluno()

    for (nota in aluno.notas){
        soma += nota
    }

    if (!aluno.error && soma >= 30.0){
        println("\nAluno Aprovado: Sua nota é: %.2f".format(soma))

    } else if (soma < 30.0 && !aluno.error){
        println("\nAluno Reprovado: Sua nota foi: %.2f".format(soma))
    }

}
