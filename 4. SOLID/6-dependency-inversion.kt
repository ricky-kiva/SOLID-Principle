// Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules, but both should depend on abstractions

// 2 rule statement of Dependency Inversion:
// - high-level module cannot be dependent with low-level module. both need to depends on abstraction
// - abstraction is not allowed to depends on details. details need to be dependent to abstraction

// low-level modules responsible to be a very detailed function
// high-level modules uses low-level classes to accomplish a bigger tasks

// high-level modules: a class that implements business rules that is flexible
// low-level modules: a class that has responsibilities to smaller detail operation (writing database, send message, etc)

/* example: Car (high-level) & engine (low-level)
class Car(private val engine: Engine) {
    fun start() {
        engine.start()
    }
}
    
class Engine {
    fun start() {}
}*/

// We want to change the 'Engine' inside 'Car' to 'DeiselEngine'. But we can't do it

/* we need to make an interface for Engine:
interface EngineInterface {
    fun start()
}

class Car(private val engine: EngineInterface) {
    fun start() {
        engine.start()
    }
}
*/

/* then we could make a number of type for all the Engines:
class PetrolEngine : EngineInterface {
    override fun start() {}
}
    
class HybridEngine: EngineInterface {
    override fun start() {}
}
    
class DieselEngine : EngineInterface {
    override fun start() {}
}*/

/* it allows us to be more flexible for dependencies:
fun main() {
    val petrolEngine = PetrolEngine()
    val petrolCar = Car(petrolEngine)
    val dieselEngine = DieselEngine()
    val dieselCar = Car(dieselEngine)
    val hybridEngine = HybridEngine()
    val hybridCar = Car(hybridEngine)
    
    petrolCar.start()
    dieselCar.start()
    hybridCar.start()
}
*/