// Dependency relation: when 1 class is dependent to another class, but the other class is not
// it happends when a function in class A need class B as parameter, return value, or just simply using it

// Association relation always has Dependency relation
// Association could be Dependency when the dependency class is not an attribute of the dependent class

// it is depicted with dashed line and arrow pointing to the Dependency Class

/* implementation in Kotlin:
class ShopService {
    ...
    fun changeProductPrice(price: String, product: Product) {
        product.changePrice(price)
    }
}
    
class Product(
    private var id: String,
    private var name: String,
    private var price: String
) {
    ...
    fun changePrice(value: String) {
        this.price = value
    }
}
*/