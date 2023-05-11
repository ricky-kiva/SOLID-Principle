// Open means a system could be extended with new specification
// Closed means a system should not be modified when adding the new specification

// commonly, Open/Close principle applied using Interface or Abstract class
// when adding new function, the base function should not be changed

// Example of OCP (Open/Close Principle), given these classes:

/* Cinema Calculations:
class CinemaCalculations {
    fun calculateAdminFee(cinema: Cinema): Double {
        return if (cinema is StandardCinema) {
            cinema.price * 10 / 100
        }
        else if (cinema is DeluxeCinema) {
            cinema.price * 12 / 100
        }
        else if (cinema is PremiumCinema) {
            cinema.price * 20 / 100
        } 
        else 0.0
    }
}*/

/* The classes that will implements CinemaCalculations class:
open class Cinema(val price: Double)
    
class StandardCinema(price: Double) : Cinema(price)
    
class DeluxeCinema(price: Double) : Cinema(price)
    
class PremiumCinema(price: Double) : Cinema(price) 
*/

// It could be made more robust using Open/Close Principle:
/* 
abstract class Cinema(val price: Double) {
    abstract fun calculateAdminFee(): Double
}
    
class StandardCinema(price: Double) : Cinema(price) {
    override fun calculateAdminFee(): Double {
        return price * 10 / 100
    }
}
    
class DeluxeCinema(price: Double) : Cinema(price) {
    override fun calculateAdminFee(): Double {
        return price * 12 / 100
    }
}
    
class PremiumCinema(price: Double) : Cinema(price) {
    override fun calculateAdminFee(): Double {
        return price * 20 / 100
    }
}
*/