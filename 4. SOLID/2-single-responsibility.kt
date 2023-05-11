// Single Responsibility Principle (SRP) used to manage the responsibility of entity inside a project, in the scope of module/class, to fulfill the needs of actor (user)

// implementation: separating classes that has different functionality

/* Example: There is Class Order that contains this methods:
class Order {
    fun calculateTotalSum() {}
    fun getItems() {}
    fun getItemCount() {}
    fun addItem(item: Item) {}
    fun deleteItem(item: Item) {}
    fun printOrder() {}
    fun showOrder() {}
    fun getDailyHistory() {}
    fun getMonthlyHistory() {}
}*/

/* by implementing SRP, we could Specialize the class:
class Order {
    fun calculateTotalSum() {}
    fun getItems() {}
    fun getItemCount() {}
    fun addItem(item: Item) {}
    fun deleteItem(item: Item) {}
    }

    class OrderHistory {
    fun getDailyHistory() {}
    fun getMonthlyHistory() {}
    }

    class OrderViewer {
    fun printOrder(order: Order) {}
    fun showOrder(order: Order) {}
}*/