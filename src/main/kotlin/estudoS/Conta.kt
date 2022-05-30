package estudoS

class Conta(
    var titular: String,
    val numero: Int,
) {
    var saldo = 0.0
        private set

    fun depositar(conta: Int, valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.depositar(conta = 123, valor = 87.87)
            return true
        }
        return false
    }

}