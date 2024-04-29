open class Game{
    protected val vidas = 0
    protected val gamerover = 10
    protected fun score(){
        println("Scores:\n"+
                "1st. 107400 ROD\n"+
                "2nd. 86400 LIZ\n"+
                "3rd. 75045 ALI"
        )
    }
}

class SpaceGame: Game(){
    fun dead(){
        println("Gamer over \nNúmeros de vidas: $vidas")
    }

    fun over(){
        println("Você morreu $gamerover vezes!")
        score()
    }
}

fun main(){
    val game1 = SpaceGame()
    game1.dead()
    game1.over()
}
