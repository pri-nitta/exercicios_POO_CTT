package Exercicio03

fun main() {
    var employee = funcionario(
        nome = "",
        id = 0,
        salario = 0.0,
        cpf = "",
        posicao = "",
        salarioFinal = 0.0)

    do{
        print("O id do funcionário é: ${employee.id}" )

        print("Digite o nome do funcionário que deseja cadastrar: ")
        employee.nome = readLine().toString()

        print("Digite o cpf do funcionário que deseja cadastrar: ")
        employee.cpf = readLine().toString()

        print("Digite o salario do funcionário que deseja cadastrar: ")
        employee.salario = readLine()?.toDouble()!!

        print("O funcionário é um programador ou gestor? ")
        employee.posicao = readLine().toString()

        println("Funcionário salvo com sucesso")

        print("Deseja cadastrar outro funcionário? (S/N)?")
        var cadastro = readLine().toString()
        employee.id = employee.id + 1
    } while (cadastro == "S" || cadastro == "s")

    //=============================================================================//
println("")
    print("Digite o id que deseja buscar:")
    val idBusca: Int? = readLine()?.toInt()

    print("Deseja exibir os dados cadastrados? (S/N)")
    val confirma: String = readLine().toString()
    if (confirma == "S" || confirma == "s"){
        println(message = employee)
    } else {
        print("Deseja aumentar o salário? (S/N)")
        val confirma2: String = readLine().toString()
        if (confirma2 == "S" || confirma2 == "s"){
            if (employee.posicao == "Programador" || employee.posicao =="programador" ) {
                val dev = programador()
                print ("O salario reajustado de ${employee.nome} é ${dev.salarioAjustado(employee.salario})
                //employee.salarioFinal = employee.salario + employee.salario * 0.2
            } else {
                val mng = gestor()
               print ("O salario reajustado de ${employee.nome} é ${mng.salarioAjustado(employee.salario)})
                //employee.salarioFinal = employee.salario + employee.salario * 0.1
            }
        } else{
            println("Cancelamos a operação!")
        }
    }

}