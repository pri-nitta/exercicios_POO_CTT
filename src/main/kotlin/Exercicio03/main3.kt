package Exercicio03

fun main() {
    var employee = funcionario(
        nome = "",
        id = 0,
        salario = 0.0,
        cpf = "",
        posicao = "",
        salarioFinal = 0.0)

    val listaFuncionarios : MutableList<funcionario> = mutableListOf()

    do{
        println("O id do funcionário é: ${employee.id}" )

        print("Digite o nome do funcionário que deseja cadastrar: ")
        employee.nome = readLine().toString()

        print("Digite o cpf do funcionário que deseja cadastrar: ")
        employee.cpf = readLine().toString()

        print("Digite o salario do funcionário que deseja cadastrar: ")
        employee.salario = readLine()?.toDouble()!!

        print("O funcionário é um programador ou gestor? ")
        employee.posicao = readLine().toString()
        
        listaFuncionarios.add(employee.nome, employee.id,employee.posicao,employee.cpf,employee.salario,employee.salarioFinal)
        println("Funcionário salvo com sucesso")

        print("Deseja cadastrar outro funcionário? (S/N)? ")
        var cadastro = readLine().toString()
        employee.id = employee.id + 1
    } while (cadastro == "S" || cadastro == "s")

println("")
    print("Digite o id que deseja buscar: ")
    val idBusca: Int = readLine()!!.toInt()

    print("Deseja exibir os dados cadastrados? (S/N) ")
    val confirma: String = readLine().toString()
    if (confirma == "S" || confirma == "s"){
        //essa parte não funcionou :( não sei como salvar as informações em uma mutable list e exibi-las na busca usando a classe
        println( println("Nome: ${employee.nome}, CPF: ${employee.cpf}, Cargo: ${employee.posicao}, Salário: ${employee.salario}"))
    } else {
        print("Deseja aumentar o salário? (S/N) ")
        val confirma2: String = readLine().toString()
        if (confirma2 == "S" || confirma2 == "s"){
            if (employee.posicao == "Programador" || employee.posicao =="programador" ) {
                val dev = programador()
                print ("O salario reajustado de ${employee.nome} é ${dev.salarioAjustado(employee.salario)}")
            } else {
                val mng = gestor()
               print ("O salario reajustado de ${employee.nome} é ${mng.salarioAjustado(employee.salario)}")
            }
        } else{
            println("Cancelamos a operação!")
        }
    }

}

private fun <E> MutableList<E>.add(nome: String, id: Int, posicao: String, cpf: String, salario: Double, salarioFinal: Double) {

}
