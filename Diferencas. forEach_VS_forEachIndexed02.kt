//Diferenças forEach vs forEachIndexed
fun main() {

    val cores =  listOf("Amarelo","Rosa","Vermelho","Verde")
    
        cores.forEach { cor ->
            println("Mostrando a cor: $cor")

        }

        println()
    
        cores.forEachIndexed { index, cor ->
            println("Posição ${index+1}: Cor: $cor")
    }
                /*
                Saida:
                Mostrando a cor: Amarelo
                Mostrando a cor: Rosa
                Mostrando a cor: Vermelho
                Mostrando a cor: Verde
                
                Posição 1: Cor: Amarelo
                Posição 2: Cor: Rosa
                Posição 3: Cor: Vermelho
                Posição 4: Cor: Verde
                 */
}
