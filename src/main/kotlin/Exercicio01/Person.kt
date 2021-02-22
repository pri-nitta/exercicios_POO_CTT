package Exercicio01

class Person(
    private var name: String,
    private var bdayYear: Int,
    private var bdayMonth: Int,
    private var bday: Int,
    private var height: Double
) {
    fun age(): Int {
        return 2021 - bdayYear
    }

    fun frase(): String {
        return "${name} nasceu em ${bday}/${bdayMonth}/${bdayYear}, tem ${age()} anos e possui ${height} de altura."
    }
}
