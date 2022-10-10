fun main() {
    val materias = listOf(77, 89, 63, 71, 75, 95, 70)
    println(valor(materias) + "\n")

}

fun valor(materias: List<Int>): List<Pair<Int, String>> {
    var calificaciones: MutableList<Pair<Int, String>> = mutableListOf()
    for (i in materias.indices) {
        val d = when (materias[i]) {
            in 0..69 -> "Desempeño insuficiente"
            in 70..74 -> "Suficiente"
            in 75..84 -> "Bueno"
            in 85..94 -> "Notable"
            in 95..100 -> "Excelente"
            else -> " "
        }
        calificaciones.add(Pair(materias[i], d))

    }
    return calificaciones
}