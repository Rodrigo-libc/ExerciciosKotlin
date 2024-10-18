//Tipos de For()

fun main() {
    val numeros =  arrayOf(10,20,30)

    for (i in numeros.indices){
        println("Posição ${i + 1}: ${numeros[i]}") //Opção mais recomendada pra esse caso

    }

    println()

    for (n in 0 until numeros.size) { //until elimina a ultima posição do array

        println("Posição ${n+1}: ${numeros[n]}")
    }

    println()

    for (n in 0.. numeros.size) { //Error ao tentar acessar uma ultima posição no array que não existe.

        println("Posição ${n+1}: ${numeros[n]}")
    }

        /*  Saida:
            Posição 1: 10
            Posição 2: 20
            Posição 3: 30

            Posição 1: 10
            Posição 2: 20
            Posição 3: 30

            Posição 1: 10
            Posição 2: 20
            Posição 3: 30
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            at MainKt.main(Main.kt:20)
            at MainKt.main(Main.kt)
        */
}







