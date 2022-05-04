package banco

class ContaCorrente(valorConta: Double): CalculoTributos {
    override var tributo = (1.0/100.0)*valorConta
    override val tipoDeServico = "Conta Corrente"

    override fun exibirTributos() {
        super.exibirTributos()
    }


}