package formasGeometricas

interface Forma {
    val area: Double
    val tipoForma: String

    fun inserirDados()

    fun calcularForma()

}