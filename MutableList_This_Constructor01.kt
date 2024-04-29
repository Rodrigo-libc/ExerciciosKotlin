class Pet(val name: String)
{
    override fun toString(): String {
        return name
    }
}
class Person(val name: String) {
    val pets: MutableList<Pet> = mutableListOf()
        constructor(name: String, age: Int) : this(name) {
         println("A pessoa se chama $name e tem $age anos.")
    }
    fun addPet(pet: Pet) {
            pets.add(pet)
    }
}

fun main() {
    val alice = Person("Alice")
    val bob = Person("Bob", 30)
    val Leon = Pet("Leon")

        alice.addPet(Leon)
    val fluffy = Pet("Fluffy")
        bob.addPet(fluffy)

            println("Pets de Alice: ${alice.pets}")
            println("Pets de Bob: ${bob.pets}")
}
