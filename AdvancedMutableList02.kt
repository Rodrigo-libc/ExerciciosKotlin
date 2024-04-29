class Pet(private val name: String) {
    override fun toString(): String {
        return name
    }
}
class Pessoa(val name: String) {
    private val pets: MutableList<Pet> = mutableListOf()
        constructor(name: String, age: Int, pets: List<Pet>) : this(name) {
            println("A pessoa se chama $name tem $age anos e possui os seguintes pets: $pets.")
    }
    fun addPet(pet: Pet) {
        pets.add(pet)
    }
}

fun main() {
    val leon = Pet("Leon")
    val fluffy = Pet("Fluffy")
    val petsParaBob = listOf(leon, fluffy)
    val bob = Pessoa("Bob", 30,petsParaBob)
        bob.addPet(fluffy)
        bob.addPet(leon)
}
