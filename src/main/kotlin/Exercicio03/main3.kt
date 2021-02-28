package Exercicio03

fun main() {
    var employee = funcionario(
        nome = "",
        id = 0,
        salario = 0.0,
        cpf = "",
        posicao = "",
        salarioFinal = 0.0)

    print("Digite o nome do funcionário que deseja cadastrar: ")
    employee.nome = readLine().toString()

    print("Digite o id do funcionário que deseja cadastrar: ")
    employee.id = readLine()?.toInt()!!

    print("Digite o cpf do funcionário que deseja cadastrar: ")
    employee.cpf = readLine().toString()

    print("Digite o salario do funcionário que deseja cadastrar: ")
    employee.salario = readLine()?.toDouble()!!

    print("O funcionário é um programador ou gestor? ")
    employee.posicao = readLine().toString()

    if (employee.posicao == "Programador" || employee.posicao =="programador" ) {
            employee.salarioFinal = employee.salario + employee.salario * 0.2
    } else {
        employee.salarioFinal = employee.salario + employee.salario * 0.1
    }
    print ("O salario reajustado de ${employee.nome} é ${employee.salarioFinal}")
}