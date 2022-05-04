package formasGeometricas

class Retangulo: Forma {

    override var area: Double = 0.0
    override val tipoForma = "Retângulo"
    private var base = 0.0
    private var altura = 0.0

    override fun inserirDados() {
        println("----- CALCULE A ÁREA DO RETÂNGULO -----")
        print("Digite a base: ")
        base = readln().toDouble()
        print("Digite a altura: ")
        altura = readln().toDouble()
    }

    override fun calcularForma() {
        area = base*altura
    }
}