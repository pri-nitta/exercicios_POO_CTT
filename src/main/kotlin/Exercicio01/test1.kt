package Exercicio01

fun main() {

    //testando se a classe funcionou!
    var p1 = Person(
        name="Amanda",
        bdayYear=1989,
        bdayMonth=8,
        bday = 16,
        height = 1.70)
    println(p1.frase())

    var p2 = Person(
        name = "Isabel",
        bdayYear = 1987,
        bdayMonth = 3,
        bday = 10,
        height = 1.64)
    println(p2.frase())
}