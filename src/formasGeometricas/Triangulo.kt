package formasGeometricas

class Triangulo: Forma {

    override var area: Double = 0.0
    override val tipoForma = "Triângulo"
    private var base = 0.0
    private var altura = 0.0

    override fun inserirDados() {
        println("----- CALCULE A ÁREA DO TRIÂNGULO -----")
        print("Digite a base: ")
        base = readln().toDouble()
        print("Digite a altura: ")
        altura = readln().toDouble()
    }

    override fun calcularForma() {
        area = (base*altura)/2
    }
}