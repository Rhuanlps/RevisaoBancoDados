package org.example.entidades

import org.example.enumeradores.Genero
import java.math.BigDecimal

open class Pessoa(
    val nome: String,
    val idade: Int,
    val cpf: String,
    val genero: Genero
) {
    open fun receberConta(conta: Conta, aReceber : BigDecimal) {
        conta.saldo = conta.saldo.add(aReceber)

    }

}