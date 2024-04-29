class Pet(val name: String)

class Pessoa(val pets: MutableList<Pet> = mutableListOf()) {
    fun addPet(pet: Pet) {
        pets.add(pet)
    }
}
fun main() {
    val pessoa = Pessoa()
    val animal = Pet("Garfield")
        pessoa.addPet(animal)
        println("Os animais de Bob: ${pessoa.pets.map {it.name}}")
}
