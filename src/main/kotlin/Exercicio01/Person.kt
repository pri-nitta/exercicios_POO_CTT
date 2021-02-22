package Exercicio01

class Person(
    private var name: String,
    private var bdayYear: Int,
    private var bdayMonth: Int,
    private var bday: Int,
    private var height: Double
) {
    fun nome(): String {
        return name
    }

    fun ano(): Int {
        return bdayYear
    }

    fun mes(): Int {
        return bdayMonth
    }

    fun dia(): Int {
        return bday
    }

    fun altura(): Double {
        return height
    }
}
