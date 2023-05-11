// Liskov's Substitution is a rule for inheritance hierarchy
// it requires that objects of a superclass should be able to be replaced with objects of a subclass without breaking the program's correctness
// In other words, a subclass should be able to substitute its superclass without changing the program's behavior

// to implement it, a SubClass need to apply all functions & properties of a SuperClass
// the SubClass also need to have the same behavior as it's SuperClass

// there are rules to be obeyed to get this objective:
// - Contravariant & Covariant
// --- Contravariant: a condition where parameter of a function within SubClass need to have the same type & amount as the function inside the SuperClass
// --- Covariant: a condition of the return value from the function within SubClass & SuperClass

// - Preconditions & Postconditions:
// --- Preconditions: an action that needs to be there before a process is executed (example: ensuring database is open)
// --- Postconditions: an action that needs to be there after a process is executed (example: to close database after done)

// - Invariant: a subclass need to have the right condition before and after the process, just like the SuperType

// - Constraint: is the restriction that is defined by SuperClass regarding the condition of the object (example: unable to change const)

// example of Liskov's Substitution usage. Say we have this early class:

/* abstract class Product {
    abstract fun getName(): String?
    abstract fun getExpiredDate(): Date?
    
    fun getProductInfo() {
        // some magic code
    }
}
    
class Vegetable : Product() {
    
    override fun getName(): String {
        return "Broccoli"
    }
    
    override fun getExpiredDate(): Date {
        return Date()
    }
}*/

/* Then we want to make another class that inherits Product. We make 'Smartphone' Class:
abstract class Product {
    abstract fun getName(): String?
    abstract fun getExpiredDate(): Date?
    
    fun getProductInfo() {
        // some magic code
    }
}
    
class Vegetable : Product() {
    
    override fun getName(): String {
        return "Broccoli"
    }
    
    override fun getExpiredDate(): Date {
        return Date()
    }
}
    
class Smartphone : Product() {
    
    override fun getName(): String {
        return "Samsung S10+ Limited Edition"
    }
    
    override fun getExpiredDate(): Date {
        return Date() // ??? We don't need this <--
    }
}*/

/* to get rid of 'expiration date' from 'smartphone' class, we need to reconstruct our hierarchy:
abstract class Product {
    abstract fun getName(): String
    
    fun getProductInfo(){
        // some magic code
    }
}
    
abstract class FoodProduct: Product(){
    abstract fun getExpiredDate(): Date
}
    
class Vegetable: FoodProduct(){
    override fun getExpiredDate(): Date {
        return Date()
    }
    
    override fun getName(): String {
        return  "Broccoli"
    }
}*/