// Generalization is process dividing characteristics of multiple class and combine it to a more generalized class (SuperClass)
// example: SubClass HealthProduct, ElectricProduct, ConsumableProduct could be generalized to Product
// Specialization is process making SubClass from available class (SuperClass)

// the most common class could be called SuperClass
// in diagram, SuperClass often placed on top, relatively to it's SubClass

// component in SuperClass that could be used in the SubClass is called Shared Element

/* example Generalization & Specialization in Kotlin:
abstract class Product(
    private var id: String,
    private var name: String,
    private var price: String
)
    
class ElectronicProduct(
    private var id: String,
    private var name: String,
    private var price: String,
    private var productionDate: String
) : Product(id, name, price)
    
class ConsumableProduct(
    private var id: String,
    private var name: String,
    private var price: String,
    private var expirationDate: String
) : Product(id, name, price)
*/