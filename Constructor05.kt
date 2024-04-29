class Carro(val marca: String, val modelo: String) {
    var ano: Int = 0
    var estado: String = "Velho"

    // Construtor secundário
     constructor(marca: String, modelo: String, ano: Int) : this(marca, modelo) {
         this.ano = ano

         }
     constructor(marca: String, modelo: String, ano: Int, estado: String) : this(marca, modelo, ano) {
         this.estado = estado
         }
     constructor(marca: String) : this(marca,"",0,""){

         }
}

fun main(){
     val carro1 = Carro("Fiat","Fiat500e")
     val carro2 = Carro("Gol", "G1", 1980)
     val carro3 = Carro("Mattel", "Uno Mille", 1984, "Novo")
     val carro4 = Carro("Audi")

     println("Marca: ${carro1.marca} \nModelo: ${carro1.modelo}\n")
     println("Marca: ${carro2.marca} \nModelo: ${carro2.modelo} \nAno: ${carro2.ano}\n")
     println("Marca: ${carro3.marca} \nModelo: ${carro3.modelo} \nAno: ${carro3.ano} \nEstado: ${carro3.estado}\n")
     println("Marca: ${carro4.marca}")
}
