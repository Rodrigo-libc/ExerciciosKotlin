abstract class MetodoPagamento{
    abstract fun pagamento(valor: Double)
}

class PagamentoPix: MetodoPagamento(){

    override fun pagamento(valor: Double){
        println("\nPagamento realizado via Pix valor:${FormatPag.formatar(valor)}")
    }
}

class PagamentoBoleto: MetodoPagamento(){
    override fun pagamento(valor: Double) {
        println("\nPagamento realizado via Boleto valor:${FormatPag.formatar(valor)}")
    }

}

class FormatPag{
    companion object{
        fun formatar(valor: Double):String{
            return String.format("R$%.2f",valor)
        }
    }
}

fun main(){
    val pix: MetodoPagamento = PagamentoPix()
    pix.pagamento(50.0)
    val boleto: MetodoPagamento = PagamentoBoleto()
    boleto.pagamento(100.00)
}
