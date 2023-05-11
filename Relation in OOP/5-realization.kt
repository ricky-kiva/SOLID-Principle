// 'Realization' / 'Implementation' is special abstraction between 2 class
// a class represents as interface that is going to be the specification, another class represents as the implementation of the realization
// Realization used to: complete, optimize, transform, a class, or being a template, synthesize model, framework composition, etc
// it depicted as dashed line with empty arrow to realized class (supplier)

// `Interface Realization` is a special realization between classifier & interface
// it signify that a classifier implements a contract that is defined by the interface
// Classifier class can implement 1 or multiple interface class
// Classifier whom implements interface supports feature that the interface class has

/* example in Kotlin:
interface ProductService {
    fun getProduct(id: String)
    fun calculateProductPrice()
}
    
class ProductServiceImpl() : ProductService{
    override fun getProduct(id: String) {
        // Implementation code
    }
    override fun calculateProductPrice() {
        // Implementation code
    }
}
*/

// `ProductServiceImpl` is Classifier Class. ProductService is the Interface Class