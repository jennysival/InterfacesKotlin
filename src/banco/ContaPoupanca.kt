package banco

class ContaPoupanca : CalculoTributos {

    override var tributo = 0.0
    override val tipoDeServico = "Conta Poupança"

    override fun exibirTributos() {
        super.exibirTributos()
    }
}