// Polymorphism is the ability of an object, variable, or function to take on multiple forms or behave differently in different contexts

// 2 type of Polymorphism:

// - Compile-time Polymorphism:
// --- a process where a method is being called when compiled
// --- it is achieved through `method overloading` where multiple methods with same name but different parameters are defined in a class, and the correct on is selected by the compiler based on the arguments
/* example in Kotlin:
open class Arithmetic {
    open fun add(valueA: Int, valueB: Int) = valueA + valueB
    open fun add(valueA: Long, valueB: Long) = valueA + valueB
    open fun add(valueA: Int, valueB: Long) = valueA + valueB
    open fun add(valueA: Long, valueB: Int) = valueA + valueB
}
    
class Add: Arithmetic(){
    override fun add(valueA: Int, valueB: Int): Int {
        println("Calculate!")
        return super.add(valueA, valueB)
    }
}
*/

// - Runtime Polymorphism:
// --- a process where method is being called in runtime. one of it's implementation is `method overriding`
// --- `method overriding` enables SubClass to specifically implement a method from its SuperClass. It will change the implementation from the SuperClass

/* example in Kotlin:
fun main() {
    val cat = Cat()
    cat.walk()
}
    
open class Animal {
    open fun walk() {
        println("${javaClass.simpleName} walk!")
    }
}
    
class Cat : Animal(){
    override fun walk() {
        super.walk()
        println("Yeay! ${javaClass.simpleName} walked!")
    }
}
*/