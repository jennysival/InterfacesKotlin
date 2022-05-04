package banco

import kotlin.system.exitProcess

class Menu {

    fun menuSelecaoDeServicos(){
        println("---------------------------")
        println("Escolha o serviço desejado:")
        println("[1] Conta Poupança")
        println("[2] Conta Corrente")
        println("[3] Seguro de Vida")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> {
                val calculoPoupanca: CalculoTributos = ContaPoupanca()
                calculoPoupanca.exibirTributos()
                menuNovaConsulta()
            }
            2 -> {
                print("Digite o valor da conta que deseja calcular tributos: ")
                val valor = readln().toDouble()
                val calculoCorrente: CalculoTributos = ContaCorrente(valor)
                calculoCorrente.exibirTributos()
                menuNovaConsulta()
            }
            3 -> {
                val calculoSeguro: CalculoTributos = SeguroDeVida()
                calculoSeguro.exibirTributos()
                menuNovaConsulta()
            }
            else -> {
                println("---------------------------")
                println("       Opção inválida      ")
                println("---------------------------")
                menuSelecaoDeServicos()
            }
        }
    }

    private fun menuNovaConsulta(){
        println("---------------------------")
        println("Deseja consultar novamente?")
        println("[1] SIM")
        println("[2] NÃO")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> menuSelecaoDeServicos()
            2 -> exitProcess(0)
            else -> {
                println("---------------------------")
                println("       Opção inválida      ")
                println("---------------------------")
            }
        }
    }
}