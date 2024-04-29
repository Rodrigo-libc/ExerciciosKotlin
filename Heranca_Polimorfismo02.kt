open class Animal {
    open fun fazerSom(nome: String) {
        println("$nome é do pai!")
    }
}
class Cachorro : Animal() {
    override fun fazerSom(nome: String) {
        println("$nome é do filho")
    }

}
class Gato: Animal(){
    override fun fazerSom(nome: String){
        println("$nome é da filha!")
    }
}
fun main() {
    val animalPai = Animal()
    animalPai.fazerSom("Lulu")
    val animal: Animal = Cachorro()
    animal.fazerSom("Thor")
    val animal2: Animal = Gato()
    animal2.fazerSom("Garfield")

}
