package acuario

interface AccionPez {
    fun comer()
}

abstract class Pez {
    abstract val color: String
}

class Tiburon : Pez(), AccionPez {
    override val color: String
        get() = "gris"

    override fun comer() {
        println("El Tiburón: cazar y comer peces")
    }
}

class PezPayaso : Pez(), AccionPez {
    override val color: String
        get() = "dorado"

    override fun comer() {
        println("El Pez Payaso: comer algas")
    }
}

