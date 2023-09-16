/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package functional

fun main() {
    //    val fullName = getFullName(first = "Taufik", last = "Hidayat")
    //    println(fullName)

    //    val number = sumNumbers(10, 20, 30, 40)
    //    println(number)

    //    val number = getNumberSize(10, 20, 30, 40, 50)
    //    println(number)

    //    69.printInt()
    //    println(10.plusThree())
    //    println(10.slice)
    //    val value: Int? = null
    //    println(value.slice)
    //    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    //    val multiply: Arithmetic = { valueA, valueB -> valueA + valueB }
    //
    //    val sumResult = sum?.invoke(10, 10)
    //    val multiplyResult = multiply?.invoke(20, 20)
    //
    //    println("Sum        : $sumResult")
    //    println("Multiply   : $multiplyResult")

    //    val message = { println("Hello from lambda") }
    //    message()

    //    val printMessage = { message: String -> println(message) }
    //    printMessage("Hello world")

    //    val messageLength = { message: String -> message.length }
    //    val length = messageLength("Hello from lambda")
    //    println("Message length: $length")

    //    printResult(10) { value ->
    //        value + value
    //    }
    //
    //    printResult(20) { value ->
    //        value + value
    //    }

    //    val message = buildString {
    //        append("Hello ")
    //        append("from ")
    //        append("lambda")
    //    }
    //
    //    println(message)

    //    apply
    //    val buildString = StringBuilder().apply {
    //        append("Hello ")
    //        append("Kotlin")
    //    }
    //    println(buildString.toString())
    //
    // //    let
    //    val text = "Hello"
    //    text.let {
    //        val message = "$it Kotlin"
    //        println(message)
    //    }
    //
    // //    run
    //    val text2 = "Hello"
    //    val result = text2.run {
    //        val from = this
    //        val to = this.replace("Hello", "Kotlin")
    //        "replace text from $from to $to"
    //    }
    //    println("Result: $result")
    //
    // //    with
    //    val message = "Hello Kotlin!"
    //    val result2 = with(message) {
    //        "First characters is ${this[0]}" +
    //                " and last character is ${this[this.length - 1]}"
    //    }
    //    println(result2)

    //    val message: String? = null
    //    message?.let {
    //        val length = it.length * 2
    //        val text = "text length $length"
    //        println(text)
    //    } ?: run {
    //        val text = "message is null"
    //        println(text)
    //    }
    //
    //    val text = "Hello Kotlin"
    //    val result = text.also {
    //        println("value length -> ${it.length}")
    //    }
    //    println("text -> $result")

    //    val sum: (Int, Int) -> Int = ::count
    //
    //    val numbers = 1.rangeTo(10)
    //    val evenNumbers = numbers.filter(Int::isEvenNumber)
    //    println(evenNumbers)
    //
    //    println(::message.name)
    //    println(::message.get())
    //    ::message.set("Kotlin Academy")
    //    println(::message.get())

    //    setWord("Hello world!")
    // val sumResult = sum(1, 2, 3)
    // println(sumResult)
    // println("Hello world")

    //  val numbers = listOf(1, 2, 3)
    //  val fold =
    //      numbers.foldRight(10) { item, current ->
    //        println("current $current")
    //        println("item $item")
    //        println()
    //        current + item
    //      }
    //  println("Fold result: $fold")

    // val number = listOf(1, 2, 3, 4, 5, 6)
    // val drop = number.dropLast(3)
    // println(drop)

    // val total = listOf(1, 2, 3, 4, 5, 6)
    // val take = total.take(3)
    // println(take)

//    val index = listOf(2, 3, 5, 8)
//    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val slice = total.slice(index)
//    println(slice)

//    val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
//    val distinct = total.distinct()
//    println(distinct)

//    val items = listOf(
//        Item("1", "Kotlin"),
//        Item("2", "is"),
//        Item("3", "Awesome"),
//        Item("3", "as"),
//        Item("3", "Programming"),
//        Item("3", "Language"),
//    )
//
//    val distinctItems = items.distinctBy { it.key }
//    distinctItems.forEach {
//        println("${it.key} with value ${it.value}")
//    }
//
//    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
//    val distinct = text.distinctBy {
//        it.length
//    }
//    println(distinct)
//
//    val word = "QWERTY"
//    val chunked = word.chunked(3) {
//        it.toString().lowercase()
//    }
//    println(chunked)

    println("Factorial 9999 is: ${factorial(9999)}")
}

tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}

//data class Item(val key: String, val value: Any)

// fun sum(
//     valueA: Int,
//     valueB: Int,
//     valueC: Int,
// ): Int {
//   fun Int.validateNumber() {
//     if (this == 0) throw IllegalArgumentException("valueA must be better than 0")
//   }
//   valueA.validateNumber()
//   valueB.validateNumber()
//   valueC.validateNumber()
//   return valueA + valueB + valueC
// }

// fun setWord(message: String) {
//    fun printMessage() {
//        println(message)
//    }
//    printMessage()
// }

// var message = "Kotlin"
// fun Int.isEvenNumber() = this % 2 == 0

// fun isEvenNumber(number: Int) = number % 2 == 0

// fun count(valueA: Int, valueB: Int): Int {
//    return valueA + valueB
// }

// fun buildString(action: StringBuilder.() -> Unit): String {
//    val stringBuilder = StringBuilder()
//    stringBuilder.action()
//    return stringBuilder.toString()
// }

// var sum: (Int) -> Int = { value -> value + value }
//
// inline fun printResult(value: Int, sum: (Int) -> Int) {
//    val result = sum(value)
//    println(result)
// }

// typealias Arithmetic = ((Int, Int) -> Int)?
// val Int?.slice: Int
//    get() = this?.div(2) ?: 0
//
//
// fun Int.printInt() {
//    print("value $this")
// }
//
// fun Int.plusThree(): Int {
//    return this + 3
// }

// fun getFullName(first: String, middle: String = "bin", last: String): String {
//    return "$first $middle $last"
// }
//
// fun sumNumbers(vararg number: Int): Int {
//    return number.sum()
// }
//
// fun <T> asList(vararg input: T): List<T> {
//    val result = ArrayList<T>()
//    for (item in input)
//        result.add(item)
//    return result
// }
//
// fun getNumberSize(vararg number: Int): Int {
//    return number.size
// }