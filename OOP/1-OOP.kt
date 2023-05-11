// Programming Paradigm: Style in writing program. Examples:
// - imperative
// - object-oriented
// - procedural
// - functional

// SOLID Paradigm is a guide to develop a system in OOP
// it makes the system easy to re-developed & sturdy

// 'Class' is a 'blueprint' that could be instantiated to 'Object'
// it define the 'behavior' of the function ('property' or 'function')

/* Class in Kotlin:
data class Kucing(
    var color: String = "", 
    var height: Double = 0.0, 
    var length: Double = 0.0, 
    var weight: Double = 0.0
)*/

/* Instantiating class in Kotlin:
fun main() {
    val persian = Kucing()
    persian.color = "Putih"
    persian.height = 24.0
    persian.length = 46.0
    persian.weight = 2.0
    val bengal = Kucing("Coklat", 22.0, 39.0, 2.3)
    val anggora = Kucing("Abu-abu", 25.0, 41.0, 2.4)
}*/

// 'Property'/'Attribute' is data inside a class that represents the characteristics of the class

/* Property in Kotlin:
class Kucing (
    private var color: String,         
    private var height: Double, 
    var length: Double,
    var weight: Double
)*/

/* Writing 'Function'/'Method' in Kotlin:
class Cat (
    var color: String,         
    var height: Double, 
    var length: Double,
    var weight: Double
) {
    
    fun purring() {
        println("Meow ..")
    }
    
    fun eat() {
        weight = weight + 1
    }
}*/

// 4 Pillars in OOP:
// - Inheritance
// - Encapsulation
// - Abstraction
// - Polymorphism