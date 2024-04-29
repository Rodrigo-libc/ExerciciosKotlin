class Carro(val marca: String, val modelo: String) {
    var ano: Int = 0

    // Construtor secundário
    constructor(marca: String, modelo: String, ano: Int) : this(marca, modelo) {
        this.ano = ano
    }
}

fun main(){
    val carro1 = Carro("Fiat","Fiat500e")
    val carro2 = Carro("Gol", "G1", 1980)

    println("Marca: ${carro1.marca} \nModelo: ${carro1.modelo}\n")
    println("Marca: ${carro2.marca} \nModelo: ${carro2.modelo} \nAno: ${carro2.ano}")

}
