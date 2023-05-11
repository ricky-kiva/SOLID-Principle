// Association: structured relation between 2 component
// it's depicted with line between 2 class
// object that is connected has it's own lifecycle and didn't have ownership between both object

// Cardinality is maximum relation between an entity set to another entity set
// Cardinality in Association:
// - one-to-one relationship: when a single object A share reference to a single object B
// - one-to-many relationship: when a single object A share reference to multiple object B
// --- example: class User can share reference to multiple class Order
// - many-to-many relationship: when multiple object A saare reference to multiple object B
// --- example: multiple class User can share reference to multiple class Product

/* example one-to-many in Kotlin:
class Seller(
    private val id: String,
    private val name: String
)
    
class User(
    private val id: String,
    private val name: String,
    private val sellers: List<Seller>
)
*/

// in Association between 2 object, there is 2 form of relation:

// - Agregation: both class could stand on their own, but will be irrelevant when one of them deleted
// - depicted by empty diamond in the owning class
// --- example: class Seller & class Shop still can stand on its own when one of them deleted, but class Shop will be irrelevant without class Seller
/* implementation in Kotlin:
class Shop(
    private val id: String,
    private val name: String
) {
    var seller: Seller
        set(value) {
            seller = value
        }
        get() {
            return seller
        }
    ...
}
    
class Seller(
    private val id: String,
    private val name: String
)
*/

// - Composition: one of the class couldn't stand on their own, will also be destroyed when other class is destroyed
// - depicted by filled diamond in the owning class
// --- example: class Address will also be destroyed when class User is destroyed
/* implementation in Kotlin:
fun main() {
    ...
    val user = User(id = "1234", name = "Khrisna", address = Address("123", "Bandung"))
}
    
class User(
    private val id: String,
    private val name: String,
    private val address: Address
)
    
class Address(
    private val id: String,
    private val location: String
)
*/
