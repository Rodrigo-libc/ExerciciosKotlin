open class Funcionario( val nome: String, val salarioBase: Double){
    open fun calcularSalario(): Double{
        return salarioBase
    }

}
class Desenvolvedor( nome: String,  salarioBase: Double):Funcionario(nome, salarioBase){
    override fun calcularSalario(): Double{
        return salarioBase * 1.2
    }

}

class Gerente( nome: String,  salarioBase: Double, private val bonus: Double):Funcionario(nome, salarioBase) {
    override fun calcularSalario(): Double {
        return salarioBase + bonus
    }
}

fun main() {
    val funcionario1: Funcionario = Desenvolvedor("Liza",5000.0)
    val funcionario2: Funcionario = Gerente("Rodrigo",6000.0, 2000.0)
    println("O salario de ${funcionario1.nome} é R$${funcionario1.calcularSalario()}")
    println("O salario de ${funcionario2.nome} é R$${funcionario2.calcularSalario()}")
}
