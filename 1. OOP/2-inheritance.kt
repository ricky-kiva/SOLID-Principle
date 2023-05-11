// Inheritance enable us to define 'parent class' to 'child class'
// it allows us to use members of inherited class

/* Inherit/Extending class in Kotlin:
class SubClass: SuperClass()
*/

// terms in Inheritance:
// - SuperClass: Class that will be inherited
// - SubClass: Class that inherits the SuperClass. It could also make it's own members

// Types of Inheritance:

// - Single Inheritance: 1 class inheriting another 1 class
/* --- Example in Kotlin:
open class Animal {
    open fun walk() {
        println("${javaClass.simpleName} walk!")
    }
}
    
class Cat : Animal(){
    override fun walk() {
        println("Yeay! ${javaClass.simpleName} walked!")
    }
}*/

// - Multilevel Inheritance: A SubClass being a SuperClass for another SubClass
/* --- Example in Kotlin:
open class Animal{
    fun walk(){
        println("${javaClass.simpleName} walk!")
    }
}
    
open class Carnivore: Animal(){
    fun eat(){
        println("${javaClass.simpleName} eat!")
    }
}
    
class Cat: Carnivore()
*/

// - Multiple Inheritance: A SubClass inheriting multiple SuperClass
// - it is rare to use this kind of inheritance because it has potential to hinder app development
/* --- Example in Kotlin:
interface Ovipar
    
interface Vivipar
    
interface Ovovivipar: Ovipar, Vivipar
    
class Snake: Ovovivipar
*/

// Hierarchial Inheritance: A SuperClass inherited by multiple SubClass
/* --- Example in Kotlin:
open class Animal{
    fun walk(){
        println("${javaClass.simpleName} walk!")
    }
}
    
open class Carnivore: Animal(){
    fun eat(){
        println("${javaClass.simpleName} eat!")
    }
}
    
class Cat: Carnivore()
    
class Lion: Carnivore()
    
class Dog: Carnivore()
*/

// Hybrid Inheritance: A mix of Multiply Inheritance & Hierarchial Inheritance