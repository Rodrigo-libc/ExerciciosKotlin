//Exemplo forEachIndexed Kotlin

data class Pessoa(val nome: String, val idade: Int)

fun main() {

val frutas =  arrayOf("Maça", "Banana", "Manga", "Acerola")

    frutas.forEachIndexed { index, fruta ->

        println("Mostrando fruta ${index +1} : $fruta")
    }
                /*
                Saida:
                Mostrando fruta 1 : Maça
                Mostrando fruta 2 : Banana
                Mostrando fruta 3 : Manga
                Mostrando fruta 4 : Acerola
                */

    val numeros = mutableListOf(10, 20, 30, 40)
        numeros.forEachIndexed{index, numero ->

            numeros[index] =  numero * index
                //Saida: [0, 20, 60, 120]
        }

    println(numeros)

val pessoas = listOf(
    Pessoa("Rodrigo",30),
    Pessoa("Lizandra",27),
    Pessoa("Edjane",50)
)

 pessoas.forEachIndexed{index, pessoa ->
        println("Pessoa ${index + 1}: Nome = ${pessoa.nome}, Idade = ${pessoa.idade}")

    }
                    /*
                    Saida:
                    Pessoa 1: Nome = Rodrigo, Idade = 30
                    Pessoa 2: Nome = Lizandra, Idade = 27
                    Pessoa 3: Nome = Edjane, Idade = 50
                    */
}
