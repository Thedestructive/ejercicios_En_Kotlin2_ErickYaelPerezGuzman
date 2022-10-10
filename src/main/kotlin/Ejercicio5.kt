fun main() {
    val Casas = listOf(
        Casa(2000, 100, 3, true, 'A'),
        Casa(2011, 60, 2, true, 'B'),
        Casa(1980, 120, 4, false, 'A'),
        Casa(2005, 75, 3, true, 'B'),
        Casa(2015, 90, 2, false, 'A')
    )

    println(precio(Casas, 260000000.0)+"\n")
}

class Casa(var y: Int, var m: Int, var h: Int, var g: Boolean, var z: Char)

fun precio(houses: List<Casa>, precio: Double): List<Pair<String, Double>> {
    val precioCasas: MutableList<Pair<String, Double>> = mutableListOf()
    var p = 0.0
    for (i in houses.indices) {
        if (houses[i].z == 'A') {
            p = if (houses[i].g) {
                ((houses[i].m * 1000 + houses[i].h * 5000 + 15000) * (2022 - houses[i].y / 100)).toDouble()
            } else {
                ((houses[i].m * 1000 + houses[i].h * 5000) * (2022 - houses[i].y / 100)).toDouble()
            }
        } else if (houses[i].z == 'B') {
            p = if (houses[i].g) {
                (houses[i].m * 1000 + houses[i].h * 5000 + 15000) * (2022 - houses[i].y / 100) * 1.5
            } else {
                (houses[i].m * 1000 + houses[i].h * 5000) * (2022 - houses[i].y / 100) * 1.5
            }
        }
        if (p <= precio) {
            val cad= "Habitaciones: "+houses[i].h.toString()+", "+"Año: "+houses[i].y.toString()+", "+"Garage: "+houses[i].g.toString()+", "+"Zona: "+houses[i].z.toString()+", "+"Metros: "+houses[i].m.toString()+", Precio Total:"
            precioCasas.add(Pair(cad, p))
        }
    }
    return precioCasas
}