class Direcoes {
     enum class DiaDaSemana {
         DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
         }

     enum class PontosCardeais {
         NORTE, SUL, LESTE, OESTE
         }
}

fun main() {

     // Acessando os dias da semana
     val dia = Direcoes.DiaDaSemana.SEGUNDA
     println("Hoje é $dia")

     // Acessando os pontos cardeais
     val pontoCardeal = Direcoes.PontosCardeais.NORTE
     println("A direção é $pontoCardeal")
    
}
