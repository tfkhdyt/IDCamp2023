/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package generics

//interface List<T> {
//    operator fun get(index: Int): T
//}
//
//class LongList : List<Long> {
//    override fun get(index: Int): Long {
//        return this[index]
//    }
//}
//
//class ArrayList<T> : List<T> {
//    override fun get(index: Int): T {
//        return this[index]
//    }
//}

//class ListNumber<T : Number> : List<T> {
//    override fun get(index: Int): T {
//        return this[index]
//    }
//}
//
//fun <T : Number> List<T>.sumNumber(): T {
//    /* .. */
//    return 123
//}

fun main() {
//    val contributors = listOf<String>()
//    val points = mapOf<String, Int>("alfian" to 10, "dimas" to 20)

//    val longArrayList = ArrayList<Long>()
//    val firstLong = longArrayList.get(0)

//    val numbers = (1..100).toList()
//    println(numbers.slice(1..10))

//    val numbers = ListNumber<Long>()
//    val numbers2 = ListNumber<Int>()
//    val numbers3 = ListNumber<String>()

//    val numbers = listOf(1, 2, 3, 4, 5)
//    numbers.sumNumber()
//    val names = listOf("dicoding", "academy")
//    names.sumNumber()

    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle

    val carList = listOf(Car(100), Car(120))
    val vehicleList = carList
}

interface List<out E> : Collection<E> {
    operator fun get(index: Int): E
}

interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)