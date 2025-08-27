package org.example.crud

import org.example.entidades.CaixaDAgua
import org.example.enumeradores.Material

fun cadastrarCaixa(){

    println("Escolha o material do qual a caixa é feita")
    println("1 - Fibra")
    println("2 - PVC")
    println("3 - Poliestileno")
    val opcao = readln().toInt()

    var material : Material
    when(opcao){
        1 -> material = Material.FIBRA
        2 -> material = Material.PVC
        3 -> material = Material.POLIESTILENO
        else -> material = Material.FIBRA

    }

    println("Qual a capacidade da Caixa?")
    val capacidade = readln().toInt()

    println("Qual a cor da Caixa?")
    val cor = readln()

    println("Qual a altura da Caixa?")
    val altura = readln().toDouble()

    println("Qual a diametro da Caixa?")
    val diametro = readln().toDouble()

    println("Qual a Largura da Caixa?")
    val largura = readln().toDouble()

    println("Qual a Largura da Caixa?")
    val preco = readln().toBigDecimal()

    CaixaDAgua(
        material = material,
        capacidade = capacidade,
        cor = cor,
        altura = altura,
        diametro = diametro,
        largura = largura,
        preco = preco,
    )
}

fun editarCaixa(){

}

fun listarCaixa(){

}

fun excluirCaixa(){

}