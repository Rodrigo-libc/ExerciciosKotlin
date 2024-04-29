enum class TipoDeComida(val descricao: String) {
     PIZZA("Pizza"),
     HAMBURGUER("Hambúrguer"),
     SALADA("Salada"),
     SOBREMESA("Sobremesa")
}

fun main() {
     val minhaComidaFavorita = TipoDeComida.PIZZA
     println("Minha comida favorita é ${minhaComidaFavorita.descricao}")

     val comidaSaudavel = TipoDeComida.SALADA
     println("Uma opção saudável é ${comidaSaudavel.descricao}")
}
