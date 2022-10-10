fun main() {
    val numeros = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    println(comprobar(numeros))
}

fun comprobar(numeros: List<Int>): MutableList<Int> {
    var numcomprobada: MutableList<Int> = mutableListOf()
    for (i in 1..numeros.size-1){
        if(validar(numeros[i])){
            numcomprobada.add(numeros[i])
        }
    }
    return numcomprobada
}
fun validar(numero:Int): Boolean {
    if (numero%3==0){
        return true;
    }
    return false;
}