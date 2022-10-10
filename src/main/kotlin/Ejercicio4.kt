fun main() {
    val materias= listOf(
        "Gestión de proyectos de Software" to 77, "Programación Web" to 89, "Programación Movil" to 63,
        "Taller de Investigación" to 71, "Enrutamiento de Redes" to 75,
        "Programación Lógica y funcional" to 95, "Internet de las cosas" to 70
    )
    println(calif(materias)+"\n")

}

fun calif(materias: List<Pair<String, Int>>): List<Pair<String, String>> {
    var calificaciones: MutableList<Pair<String, String>> = mutableListOf()
    for (i in materias.indices) {
        val d = when (materias[i].second) {
            in 0..69 -> "Desempeño insuficiente"
            in 70..74 -> "Suficiente"
            in 75..84 -> "Bueno"
            in 85..94 -> "Notable"
            in 95..100 -> "Excelente"
            else -> " "
        }
        calificaciones.add(Pair(materias[i].first,d))

    }
    return calificaciones
}