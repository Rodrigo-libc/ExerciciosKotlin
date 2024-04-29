abstract class FormaPagamento{
    abstract val pix: Double
    abstract val boleto: Double
    abstract fun metodoPag()
}

class PagamentoPix: FormaPagamento(){
    override val pix = 50.0
    override val boleto = 0.0
    override fun metodoPag() {
        println("Pagamento realizado via pix valor: R$$pix")
    }
}

class PagamentoBoleto: FormaPagamento(){
    override val pix = 0.0
    override val boleto = 100.00
    override fun metodoPag() {
        println("Pagamento realizado via boleto bancario valor: R$$boleto")
    }
}
fun main(){

    val pagpix: FormaPagamento = PagamentoPix()
    pagpix.metodoPag()

    val pagbol: FormaPagamento = PagamentoBoleto()
    pagbol.metodoPag()
}
