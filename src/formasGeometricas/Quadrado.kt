package formasGeometricas

class Quadrado() : Forma {

    override var area: Double = 0.0
    override val tipoForma = "Quadrado"
    private var medidaQuadrado = 0.0

    override fun inserirDados() {
        println("----- CALCULE A ÁREA DO QUADRADO -----")
        print("Digite a base e altura: ")
        medidaQuadrado = readln().toDouble()
    }

    override fun calcularForma() {
        area = medidaQuadrado*medidaQuadrado
    }
}