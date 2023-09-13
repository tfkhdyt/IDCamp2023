package dataclass

class User(val name: String, val age: Int)

data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}
