/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package oop

fun main() {
//    object everywhere
//    val someString = "Taufik"
//    println(someString.reversed())
//    println(someString.uppercase())
//    println(someString.lowercase())

//    val someString = "123"
//    val someInt = someString.toInt()
//    val someOtherString = "12.34"
//    val someDouble = someOtherString.toDouble()
//    println(someInt is Int)
//    println(someDouble is Double)

//    membuat kelas
//    val dicodingCat = Animal("Dicoding Asep", 4.2, 2, true)
//    println(
//        """
//        Nama: ${dicodingCat.name}
//        Berat: ${dicodingCat.weight}
//        Umur: ${dicodingCat.age}
//        Mamalia: ${dicodingCat.isMammal}
//    """.trimIndent()
//    )
//    dicodingCat.eat()
//    dicodingCat.sleep()
//    println("Nama: ${dicodingCat.name}")
//    dicodingCat.name = "Goose"
//    println("Nama: ${dicodingCat.name}")
//    val dicodingCat = Animal()
//    println("Nama: ${dicodingCat.name}")
//    dicodingCat.name = "Goose"
//    println("Nama: ${dicodingCat.name}")

//    property delegation
//    val animal = Animal()
//    animal.name = "Dicoding Miaw"
//    println("Nama hewan: ${animal.name}")
//
//    val person = Person()
//    person.name = "Dimas"
//    println("Nama orang: ${person.name}")
//
//    val hero = Hero()
//    hero.name = "Gatotkaca"
//    println("Nama pahlawan: ${hero.name}")

//    val animal = Animal()
//    animal.name = "Cat"
//    animal.weight = 6.2
//    animal.age = 1
//    println("Nama: ${animal.name}")
//    println("Berat: ${animal.weight}")
//    println("Umur: ${animal.age} Tahun")

//    extension properties
//    val cat = Animal("Cat", 5.0, 2, true)
//    println(cat.getAnimalInfo)

//    secondary constructor
//    val cat = Animal("Sumbul", 2.5, 2, true)
//    println("Nama: ${cat.name}, Berat: ${cat.weight}, Umur: ${cat.age}, Mamalia: ${cat.isMammal}")
//
//    val bird = Animal("X", 0.5, 1)
//    println("Nama: ${bird.name}, Berat: ${bird.weight}, Umur: ${bird.age}, Mamalia: ${bird.isMammal}")

//    visibility modifiers
//    val cat = Animal("Miaw", 2.5, 2)
//    println("Nama: ${cat.getName()}")
//    cat.setName("Goose")
//    println("Nama: ${cat.getName()}")

//    val cat = Cat("Miaw", 2.0)
//    println("Nama kucing: ${cat.name}")
//    println("Berat kucing: ${cat.getWeight()}")

//    val cat = Cat("Miaw", 3.2, 2, true, "Brown", 4)
//
//    cat.playWithHuman()
//    cat.eat()
//    cat.eat("Ikan tuna")
//    cat.eat("Ikan tuna", 450.0)
//    cat.sleep()

//    val calc = Calculator()
//    println(calc.add(2, 4))
//    println(calc.add(2.5, 2.2))
//    println(calc.add(6f, 7f))
//    println(calc.add(1, 2, 3))
//    println(calc.min(9, 2))
//    println(calc.min(17.2, 18.3))

//    val animal = Animal("Animal", 2.6, 1, true)

//    flyWithWings(object : Fly {
//        override fun fly() {
//            if (numberOfWings > 0) println("Flying with $numberOfWings wings")
//            else println("I'm flying without wings")
//        }
//
//        override val numberOfWings: Int
//            get() = 2
//    })

//    val someInt = Random(0).nextInt(1, 10)
//    println(someInt)
//    println(PI)
//    println(cos(120.0))
//    println(sqrt(9.0))

//    sayHello()
//    println(factorial(4.0))
//    println(pow(3.0, 2.0))
//    println(PI)
//    println(areaOfCircle(13.0))

//    exception
//    val someValue = 6
//    println(someValue / 0)
//    val someStringValue = "18.0"
//    println(someStringValue.toInt())
//    val someNullValue: String? = null
//    val someMustNotNullValue: String = someNullValue!!
//    println(someMustNotNullValue)

    val someStringValue: String? = null
    var someIntValue = 0
    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when (someIntValue) {
            0 -> println("Catch block NullPointerException terpanggil!")
            -1 -> println("Catch block NumberFormatException terpanggil!")
            else -> println(someIntValue)
        }
    }
}

//interfaces
//fun flyWithWings(bird: Fly) {
//    bird.fly()
//}
//
//class Bird(override val numberOfWings: Int) : Fly {
//    override fun fly() {
//        if (numberOfWings > 0) println("Flying with $numberOfWings wings")
//        else println("I flying without wings")
//    }
//}
//
//interface Fly {
//    val numberOfWings: Int
//    fun fly()
//}

//abstract class
//abstract class Animal(
//    var name: String, var weight: Double, var age: Int,
//    var isCarnivore: Boolean
//) {
//    fun eat() {
//        println("$name sedang makan!")
//    }
//
//    fun sleep() {
//        println("$name sedang tidur!")
//    }
//}

//overloading
//class Calculator {
//    fun add(value1: Int, value2: Int) = value1 + value2
//    fun add(value1: Int, value2: Int, value3: Int) = value1 + value2 + value3
//    fun add(value1: Double, value2: Double) = value1 + value2
//    fun add(value1: Float, value2: Float) = value1 + value2
//
//    fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2
//    fun min(value1: Double, value2: Double) =
//        if (value1 < value2) value1 else value2
//}

//inheritances
//class Cat(
//    name: String,
//    weight: Double,
//    age: Int,
//    isCarnivore: Boolean,
//    val furColor: String,
//    val numberOfFeet: Int
//) : Animal(name, weight, age, isCarnivore) {
//    fun playWithHuman() {
//        println("$name bermain bersama Manusia!")
//    }
//
//    override fun eat() {
//        println("$name sedang memakan ikan!")
//    }
//
//    override fun sleep() {
//        println("$name sedang tidur di bantal!")
//    }
//}
//
//open class Animal(
//    val name: String,
//    val weight: Double,
//    val age: Int,
//    val isCarnivore: Boolean
//) {
//    open fun eat() {
//        println("$name sedang makan!")
//    }
//
//    open fun eat(typeFood: String) {
//        println("$name memakan $typeFood!")
//    }
//
//    open fun eat(typeFood: String, quantity: Double) {
//        println("$name memakan $typeFood sebanyak $quantity grams!")
//    }
//
//    open fun sleep() {
//        println("$name sedang tidur!")
//    }
//}

//open class Animal(val name: String, protected val weight: Double)
//class Cat(name: String, weight: Double) : Animal(name, weight) {
//    fun getWeight(): Double {
//        return this.weight
//    }
//}

//visibility modifiers
//class Animal(
//    private var name: String,
//    private val weight: Double,
//    private val age: Int,
//    private val isMammal: Boolean = true,
//) {
//    fun getName(): String {
//        return name
//    }
//
//    fun setName(name: String) {
//        this.name = name
//    }
//}

//extension properties
//class Animal(
//    name: String,
//    weight: Double,
//    age: Int,
//) {
//    val name: String
//    val weight: Double
//    val age: Int
//    var isMammal: Boolean
//
//    init {
//        this.weight = if (weight < 0) 0.1 else weight
//        this.age = if (age < 0) 0 else age
//        this.name = name
//        this.isMammal = false
//    }
//
//    constructor(
//        name: String,
//        weight: Double,
//        age: Int,
//        isMammal: Boolean
//    ) : this(name, weight, age) {
//        this.isMammal = isMammal
//    }
//}
//
//val Animal.getAnimalInfo: String
//    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, Mamalia: ${this.isMammal}"

//property delegation
//class DelegateGenericClass {
//    private var value: Any = "Default"
//
//    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
//        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
//        return value
//    }
//
//    operator fun setValue(
//        classRef: Any,
//        property: KProperty<*>,
//        newValue: Any
//    ) {
//        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
//        value = newValue
//    }
//}
//
//class DelegateName {
//    private var value: String = "Default"
//
//    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
//        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
//        return value
//    }
//
//    operator fun setValue(
//        classRef: Any?,
//        property: KProperty<*>,
//        newValue: String
//    ) {
//        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
//        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
//        value = newValue
//    }
//}
//
//class Animal {
//    var name: Any by DelegateGenericClass()
//    var weight: Any by DelegateGenericClass()
//    var age: Any by DelegateGenericClass()
//}
//
//class Person {
//    var name: String by DelegateName()
//}
//
//class Hero {
//    var name: String by DelegateName()
//}

//membuat kelas
//class Animal {
//    var name: String = "Dicoding Miaw"
//        get() {
//            println("Fungsi Getter terpanggil")
//            return field
//        }
//        set(value) {
//            println("Fungsi Setter terpanggil")
//            field = value
//        }
//}
//class Animal(
//    var name: String = "Dicoding Miaw",
//    val weight: Double,
//    val age: Int,
//    val isMammal: Boolean
//) {
//    fun eat() {
//        println("$name makan!")
//    }
//
//    fun sleep() {
//        println("$name tidur!")
//    }
//}