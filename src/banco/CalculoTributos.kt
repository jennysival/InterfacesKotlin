package banco

interface CalculoTributos {
    var tributo: Double
    val tipoDeServico: String

    fun exibirTributos(){
        println("-----------------------")
        println("Serviço: $tipoDeServico")
        println("Tributo: R$$tributo")
    }
}