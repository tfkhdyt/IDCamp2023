/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package controlflow

fun main() {
//    val color = Color.RED
//    print(color)
//    color.printValue()

//    val colors: Array<Color> = Color.values()
//    colors.forEach { color ->
//        print("$color ")
//     }

//    val color = Color.RED
//    println("Color is $color")
//    println("Color value is ${color.value.toString(16)}")

//    val colors = enumValues<Color>()
//    colors.forEach { color ->
//        println(color)
//    }
//
//    val color = enumValueOf<Color>("RED")
//    println("Color is $color")

//    val color = Color.GREEN
////    println("Position GREEN is ${green.ordinal}")
//    when(color) {
//        Color.RED -> print("Color is Red")
//        Color.BLUE -> print("Color is Blue")
//        Color.GREEN -> print("Color is Green")
//    }

//    val openOffice = 7
//    val now = 8
//    val office = if (now > openOffice) "Office already open" else "Office close"
//    println(office)

//    print(sum(1, 1 * 4))

//    val value = 6
//    val stringOfValue = when (value) {
//        6 -> {
//            println("Six")
//            "value is 6"
//        }
//        7 -> "value is 7"
//        8 -> "value is 8"
//        else -> "value cannot be reached"
//    }
//    println(stringOfValue)

//    val anyType: Any = 100L
//    when(anyType) {
//        is Long -> println("the value has a Long type")
//        is String -> println("the value has a String type")
//        else -> println("undefined")
//    }

//    val value = 27
//    val ranges = 10..50
//    when(value) {
//        in ranges -> println("value is in the range")
//        !in ranges -> println("value is outside the range")
//        else -> println("value undefined")
//    }

//    val registerNumber = when (val regis = getRegisterNumber()) {
//        in 1..50 -> 50 * regis
//        in 51..100 -> 100 * regis
//        else -> regis
//    }
//
//    println(registerNumber)

//    val anyType: Any = 100L
//    if (anyType is Long) {
//        println("the value has a Long type")
//    } else {
//        println("the value is not Long type")
//    }
//    when (anyType) {
//        is Long -> println("the value has a Long type")
//        is Int -> println("the value has a Int type")
//        is Double -> println("the value has a Double type")
//        else -> println("undefined")
//    }

//    var counter = 1
//    while (counter <= 7) {
//        println("Hello, World!")
//        counter++
//    }
//    do {
//        println("Hello, World!")
//        counter++
//    } while (counter <= 7)

//    val rangeInt = 1..10 step 2
//    rangeInt.forEach {
//        print("$it ")
//    }
//    println(rangeInt.step)
//
//    val tenToOne = 10.downTo(1)
//    if (7 in tenToOne) {
//        println("Value 7 available")
//    }
//    if (11 !in tenToOne) {
//        println("No value 11 in Range")
//    }

//    val rangeChar = 'A'.rangeTo('F')
//    println("Range char: $rangeChar")

//    val ranges = 1.rangeTo(10) step 3
//    ranges.forEachIndexed { index, _ ->
//        println("index $index")
//    }

//    break dan continue
//    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
//    for (i in listOfInt) {
//        if (i == null) break
//        print(i)
//    }

    loop@ for (i in 1..10) {
        println("Outside loop")

        for (j in 1..10) {
            println("Inside loop")
            if (j > 5) break@loop
        }
    }
}

//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}

//fun sum(value1: Int, value2: Int) = value1 + value2

//fun getRegisterNumber() = Random.nextInt(100)