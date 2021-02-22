package Exercicio02

fun main() {
    var agendaNames: MutableList<String> = mutableListOf()
    var agendaTel: MutableList<String> = mutableListOf()
    var i: Int = 0

    fun salveContact() {
        var a: Int = 1
        do {
            print("Insira o nome do ${a} º contato: ")
            var name = readLine().toString()
            agendaNames.add(name)

            print("Insira o ${a} º telefone: ")
            var phone = readLine().toString()
            agendaTel.add(phone)

            print("Gostaria de cadastrar mais um contato? Y/N ")
            var answer = readLine().toString()

            a += 1

        } while (answer != "n" && a <= 10) //não consegui inserir um || para answer != "N" e também não consegui fazer com answer = "y"
    }

    fun deleteContact() {
        print("Informe qual nome deseja deletar: ")
        var delete = readLine().toString()

        if (delete in agendaNames) {
            println("Contato removido com sucesso")
            for (i in 0..9) {
                if (agendaNames[i] != delete) { //não entrou nessa condição e encerra o programa
                } else {
                    agendaNames[i] = "0"
                    agendaTel[i] = "0"
                }
            }
        } else {
            println("Contato não localizado") //funciona certinho e segue com o programa
        }
    }

    fun searchContact(){
        print("Digite o nome que deseja buscar: ")
        var search = readLine().toString()
        if (search in agendaNames) {
            for (i in 0..9) {
                if (agendaNames[i] != search) {
                } else {
                    println("Nome: ${agendaNames[i]} e telefone: ${agendaTel[i]}") //funcionou porém não segue com o programa
                }
            }
        } else {
            println("Contato não localizado") //funciona certinho e segue com o programa
        }
    }

    fun showContacts() {
        println("Contatos salvos")
        for (i in 0..9) {
            println("${i} - Nome:${agendaNames[i]} - Tel:${agendaTel[i]}")
        }
    }

    salveContact()
    println("=================================") //Não consegui usar o abstract fun clear() para limpar a tela... :(
    deleteContact()
    println("=================================")
    searchContact()
    println("=================================")
    showContacts()
}