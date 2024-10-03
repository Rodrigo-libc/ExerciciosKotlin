package org.example

open class Funcionarios{
    fun teste(){
        println("Posso ser acessado...")
    }
    open fun trabalho(){
        println("O funcionario está trabalhando...")

    }
}

class Programador: Funcionarios(){

    override fun trabalho(){
        super.trabalho()
        println("O programador está codando...")
    }
}

class Editor: Funcionarios(){

    override fun trabalho() {
        super.trabalho()
        super.teste()
        println("O Editor está editando...")
    }
}

fun main() {

    val funcionario1: Funcionarios = Programador()
    val funcionario2: Funcionarios = Editor()

    funcionario1.trabalho()
    funcionario2.trabalho()
    funcionario2.teste() //funcionario2.teste() // O objeto 'funcionario2', uma instância de 'Editor',
                        //pode acessar métodos herdados da classe base 'Funcionarios'.

}
