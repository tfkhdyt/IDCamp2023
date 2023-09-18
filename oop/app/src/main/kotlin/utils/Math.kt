package utils

fun sayHello() = println("Hello from package utils")

const val PI = 3.14

fun pow(num: Double, power: Double): Double {
    var result = 1.0
    var counter = power
    while (counter > 0) {
        result *= num
        counter--
    }
    return result
}

fun factorial(number: Double): Double {
    var result = 1.0
    var counter = 1.0
    while (counter <= number) {
        result *= counter
        counter++
    }
    return result
}

fun areaOfCircle(radius: Double): Double {
    return PI * 2 * radius
}