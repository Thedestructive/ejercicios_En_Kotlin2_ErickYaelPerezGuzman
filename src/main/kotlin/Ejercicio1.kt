import kotlin.math.*

fun main(args: Array<String>) {
    println("Favor inserte su número")
    var num = readLine()!!.toInt()
    println("Favor ingresa la función que quieres usar\nSeno(sin)\nCoseno(cos)\nTangente(tan)\nExponencial(exp)\nLogaritmo(ln)\n")
    var func = readLine().toString()
    funciones(num, func)

}

fun funciones(num: Int, funcion: String) {
    for (i in 1..num) {
        val v = when (funcion) {
            "sin" -> sin(i.toDouble())
            "cos" -> cos(i.toDouble())
            "tan" -> tan(i.toDouble())
            "exp" -> exp(i.toDouble())
            "ln" -> ln(i.toDouble())
            else -> 0.0
        }
        if (v < 0) {
            println("$i-> $v")
        } else {
            println("$i ->  $v")
        }
    }
}