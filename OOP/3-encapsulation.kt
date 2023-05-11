// Encapsulation: a process when data handling placed in singular container as a class
// inside Encapsulation, data could be isolated and can't be accessed directly from outside

/* example in Kotlin:
class DataRepository {
    private val data = mutableListOf<Any>()
    
    fun setData(){
        val response = // tons of logical code to retrieve data
        data.clear()
        data.putAll(response.data)
    }
    
    fun getData() = data
}      
*/