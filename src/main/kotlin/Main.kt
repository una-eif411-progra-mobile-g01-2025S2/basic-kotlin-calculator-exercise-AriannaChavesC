package org.example

fun main() {
    val calculator = Calculator()

    println("=== Kotlin Calculator ===")

    print("Ingrese el primer número: ")
    val inputA = readLine()?.toDoubleOrNull()
    print("Ingrese el segundo número: ")
    val inputB = readLine()?.toDoubleOrNull()

    if (inputA == null || inputB == null) {
        println("Entrada inválida. Por favor ingrese números válidos.")
        return
    }

    val a = inputA
    val b = inputB

    println("Suma: $a + $b = ${calculator.add(a, b)}")
    println("Resta: $a - $b = ${calculator.subtract(a, b)}")
    println("Multiplicación: $a * $b = ${calculator.multiply(a, b)}")

    try {
        println("División: $a / $b = ${calculator.divide(a, b)}")
    } catch (e: IllegalArgumentException) {
        println("Error en división: ${e.message}")
    }
}
