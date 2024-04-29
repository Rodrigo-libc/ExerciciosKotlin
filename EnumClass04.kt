enum class OperacaoMatematica {
     SOMA {
         override fun calcular(a: Int, b: Int): Int {
             return a + b
             }
         },
     SUBTRACAO {
         override fun calcular(a: Int, b: Int): Int {
             return a - b
             }
         },
     MULTIPLICACAO {
         override fun calcular(a: Int, b: Int): Int {
             return a * b
             }
         },
     DIVISAO {
         override fun calcular(a: Int, b: Int): Int {
             require(b != 0) { "A divisão por zero não é permitida." }
             return a / b
             }
         };

     abstract fun calcular(a: Int, b: Int): Int
}

fun main() {
     val a = 10
     val b = 5

     val soma = OperacaoMatematica.SOMA.calcular(a, b)
     println("$a + $b = $soma")

     val subtracao = OperacaoMatematica.SUBTRACAO.calcular(a, b)
     println("$a - $b = $subtracao")

     val multiplicacao = OperacaoMatematica.MULTIPLICACAO.calcular(a, b)
     println("$a * $b = $multiplicacao")

     try {
         val divisao = OperacaoMatematica.DIVISAO.calcular(a, b)
         println("$a / 0 = $divisao")
         } catch (e: Exception) {
         println(e.message)
         }
}
