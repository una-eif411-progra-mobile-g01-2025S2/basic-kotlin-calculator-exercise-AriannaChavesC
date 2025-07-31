package org.example

class Calculator {
    fun add(a: Double, b: Double): Double{
        return a + b
    }
    fun subtract(a: Double, b: Double): Double{
        return a - b
    }
    fun multiply(a: Double, b: Double): Double{
        return a * b
    }
    fun divide(a: Double, b: Double): Double{
        if(b == 0.0) {
            throw IllegalArgumentException("Divisor cannot be 0")}
        return a / b
    }
}