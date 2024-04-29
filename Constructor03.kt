class Carro(val marca: String, val modelo: String) {
    var ano = 0
    var preco = 0.0

    fun formatarValor (): String{
        return String.format("R$%.3f", preco)
    }
    // Construtor secundário
    constructor(marca: String, modelo: String, ano: Int, preco: Double) : this(marca, modelo) {
        this.ano = ano
        this.preco = preco
    }
}

fun main(){
    val carro1 = Carro("Fiat","Fiat 500e ",2020, 45.000)
    val carro2 = Carro("Gol", "G1")

    println("Marca: ${carro1.marca} \nModelo: ${carro1.modelo}\nAno: ${carro1.ano} \nPreço: ${carro1.formatarValor()}\n")
    println("Marca: ${carro2.marca} \nModelo: ${carro2.modelo}")

}
