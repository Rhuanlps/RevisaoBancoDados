package org.example.ui

fun menu(){
    do{
        println("1 - Cadastrar Caixa D'Água ")
        println("2 - Editar Caixa D'Água ")
        println("3 - Listar Caixa D'Água ")
        println("4 - Limpar Caixa D'Água ")
        println("0 - Sair ")

        var opcao = readLine()!!.toInt()
        when(opcao){
            0 -> println("Saindo...")
            1 -> println("Cadastrando caixa...")
            2 -> println("Editando caixa...")
            3 -> println("Listando caixa...")
            4 -> println("Limpando caixa...")
            else -> println("Opção incálida!")

        }
    } while (opcao != 0)


}
