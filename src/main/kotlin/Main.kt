fun main() {
    println("Bem vindo ao Bytebank")

    var conta = Conta()
    conta.titular = "Valdano"
    conta.numero = 3213
    conta.saldo = 157.52

    println("Depositando na conta")
    conta.deposita(conta, 50.5)

    println("titular ${conta.titular}")
    println("numedo da conta ${conta.numero}")
    println("saldo da conta ${conta.saldo}")

    println()

    var conta2 = Conta()
    conta2.titular = "Tatiana"
    conta2.numero = 547
    conta2.saldo = 78.47

    println("Depositando na conta2")
    conta2.deposita(conta2, 85.7)

    println("titular ${conta2.titular}")
    println("numedo da conta ${conta2.numero}")
    println("saldo da conta ${conta2.saldo}")

    // Conta().titular = "Valdano"
}

class Conta(
    var titular: String,
    var numero: Integer,
    var saldo: Double) {


    // private set

//        set(valor) {
//            if (valor > 0) {
//                field = valor
//            }
//        }
//        get(){
//            return field
//        }

    fun deposita(conta: Conta, valor: Double) {
        conta.saldo += valor
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            //destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double{
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0){
//            saldo = valor
//        } else{
//            println("Impossível, saldo menor que zero")
//        }
//    }
}

fun testaCopiaEReferencia() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX: $numeroX")
    println("numeroY: $numeroY")
}

//no kotlin quando passar um parametro em uma função, é obrigatório informa o tipo, neste caso DOUBLE
fun testaCondicoes(saldo: Double) {
    //extrutura condicional nas linguagens de programação
//    if(saldo > 0.0){
//        println("conta é positiva")
//    } else if(saldo == 0.0){
//        println("conta é neutra")
//    } else{
//        println("conta é negativa")
//    }

    //extrutura condicional no kotlin
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }

    fun testeLacos() {
        var i = 0
        while (i < 5) {
            val titular: String = "Valdano $i"
            val numeroConta = 3213 + i
            var saldo = i + 10.0

            println("titular: $titular")
            println("numedo da conta: $numeroConta")
            println("saldo da conta: $saldo")
            println()
            i++
        }

//    for no kotlin (for loop) usa range, só consegue caso o ultimo numero for maior que o primeiro 1..5, se fosse 5..1 não faz nada
//    para isso tem que colocar o downTo
//    for (i in 5 downTo 1) ele vai fazer ao contrário do primeiro exemplo, ou seja modo decrecente
//    para pular por exemplo de dois em dois usamos o step 2
//    caso queira para usar o if (i == 4) { break }

        for (i in 1..5 step 2) {
//    val não altera os valores da variáveis
            val titular = "Valdano $i"
            val numeroConta = 3213 + i
            var saldo = i + 10.0

//        var pode alterar os valores das variáveis
//        var saldo = 0.0
//        saldo2 = 98.78

//    para concatenar no kotlin usamos o $
            println("titular: $titular")
            println("numedo da conta: $numeroConta")
            println("saldo da conta: $saldo")
            println()

            testaCondicoes(saldo)
        }
    }
}
