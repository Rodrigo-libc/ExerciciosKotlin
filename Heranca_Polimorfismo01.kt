open class Animal {
    open fun fazerSom() {
        println("O animal late!")
    }
}
class Cachorro : Animal() {
    override fun fazerSom() {
        println("O cachorro late!")
    }

}
class Gato: Animal(){
    override fun fazerSom(){
        println("O gato mia!")
    }
}
fun main() {

    val animal: Animal = Cachorro()
    animal.fazerSom()
    val animal2: Animal = Gato()
    animal2.fazerSom()

}
