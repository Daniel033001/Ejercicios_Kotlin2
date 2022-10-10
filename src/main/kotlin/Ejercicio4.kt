fun resultados(nota: Int): String {
    if (nota <= 100 && nota >= 95) {
        return ": Excelente"
    } else if (nota <= 94 && nota >= 85) {
        return ": Notable"
    } else if (nota <= 84 && nota >= 75) {
        return ": Bueno"
    } else if (nota <= 74 && nota >= 70) {
        return ": Suficiente"
    } else return ": Desempeño insuficiente"
}
fun main() {
    val asignaturas = arrayOf<String>(
        "Programacion web", "Programacion movil", "Porgramacion Logica",
        "Base de datos", "Redes"
    )
    val notas = arrayOf<Int>(70, 79, 80, 90, 69)
    calificaciones(asignaturas, notas)
}

fun calificaciones(asignaturas: Array<String>, notas: Array<Int>) {
    for (i in 0..asignaturas.size - 1) {
        println(asignaturas.get(i).toUpperCase() + " " + resultados(notas.get(i)))
    }
}




