package formasGeometricas

import kotlin.system.exitProcess

class Menu {

    fun menuSelecionarForma(){
        println("--------------------------")
        println("Escolha a forma geométrica")
        println("[1] Losango")
        println("[2] Quadrado")
        println("[3] Retângulo")
        println("[4] Triângulo")
        println("[5] Fim")
        print("Digite o º da forma escolhida: ")
        when(readln().toInt()){
            1 -> {
                val novoLosango: Forma = Losango()
                novoLosango.inserirDados()
                novoLosango.calcularForma()
                exibirAreaFormas(novoLosango)
                menuContinuar()
            }
            2 -> {
                val novoQuadrado: Forma = Quadrado()
                novoQuadrado.inserirDados()
                novoQuadrado.calcularForma()
                exibirAreaFormas(novoQuadrado)
                menuContinuar()
            }
            3 -> {
                val novoRetangulo: Forma = Retangulo()
                novoRetangulo.inserirDados()
                novoRetangulo.calcularForma()
                exibirAreaFormas(novoRetangulo)
                menuContinuar()
            }
            4 -> {
                val novoTriangulo: Forma = Triangulo()
                novoTriangulo.inserirDados()
                novoTriangulo.calcularForma()
                exibirAreaFormas(novoTriangulo)
                menuContinuar()
            }
            5 -> exitProcess(0)
            else -> {
                println("--------------")
                println("Opção inválida")
                println("--------------")
                menuSelecionarForma()
            }
        }
    }

    fun exibirAreaFormas(forma: Forma){
        println("A área do ${forma.tipoForma} é: ${forma.area}")
    }

    fun menuContinuar(){
        println("--------------------------")
        println("Deseja calcular novamente?")
        println("[1] SIM")
        println("[2] NÃO")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> menuSelecionarForma()
            2 -> exitProcess(0)
            else -> {
                println("--------------")
                println("Opção inválida")
                println("--------------")
                menuContinuar()
            }
        }

    }

}