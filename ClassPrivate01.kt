private class TesteClass(){
    val msg = "Hello, World!"
    private val msgPrivada = "Mensagem privada"
}

fun main(){
    val mensagem = TesteClass()
    println(mensagem.msg)
    println(mensagem.msgPrivada) //Erro de compilação porque a variável é privada!
}
