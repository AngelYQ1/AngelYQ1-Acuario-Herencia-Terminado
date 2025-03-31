package acuario
import acuario.Tiburon
import acuario.PezPayaso

fun construirAcuario() {
    val acuario1 = Acuario()
    acuario1.imprimirTamano()

    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()

    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()

    val acuario5 = Acuario(numeroDePeces = 29)
    acuario5.imprimirTamano()

    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    fun construirAcuario() {
        val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
        miAcuario.imprimirTamano()

        val miTorre = TanqueTorre(diametro = 25, alto = 40)
        miTorre.imprimirTamano()
    }
}


fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El color del Tiburón es: ${tiburon.color}")
    tiburon.comer()

    println("El color del Pez Payaso es: ${pezPayaso.color}")
    pezPayaso.comer()
}


fun main() {
    construirAcuario()
    crearPeces()
}