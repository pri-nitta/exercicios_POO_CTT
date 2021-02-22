package Exercicio01

fun main() {
    var p1 = Person(
        nome = "Priscila",
        dia = 13,
        mes = 9,
        ano = 1990,
        altura = 1.65
    )
    fun age(): Int {
        return 2021 - p1.bdayYear
    }

    fun frase(): String {
        return "${p1.name} nasceu em ${p1.bday}/${p1.bdayMonth}/${p1.bdayYear}, tem ${age()} anos e possui ${p1.height} de altura."
    }
println (frase())

}