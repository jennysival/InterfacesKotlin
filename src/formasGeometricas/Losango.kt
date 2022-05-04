package formasGeometricas

class Losango() : Forma {

    override val tipoForma = "Losango"
    override var area = 0.0

    private var diagMaior = 0.0
    private var diagMenor = 0.0

    override fun inserirDados() {
        println("----- CALCULE A ÁREA DO LOSANGO -----")
        print("Digite a diagonal maior: ")
        diagMaior = readln().toDouble()
        print("Digite a diagonal menor: ")
        diagMenor = readln().toDouble()
    }

    override fun calcularForma() {
        area = (diagMaior*diagMenor)/2
    }
}