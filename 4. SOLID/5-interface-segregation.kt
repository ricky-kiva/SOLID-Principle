// Interface Segregation Principle (ISP) aims to lessen the dependency of a class to interface class that is not needed
// ISP is all about segregation of responsibility

// lets have an example from Vehicle, Motorcycle, & Car

/* interface VehicleInterface {
    fun drive()
    fun stop()
    fun refuel()
    fun openDoors()
}
    
    
class Motorcycle : VehicleInterface {
    // Can be implemented
    override fun drive() {}
    override fun stop() {}
    override fun refuel() {}
    
    // Can not be implemented
    override fun openDoors() {}
}

class Car : VehicleInterface {
    override fun drive() {}
    override fun stop() {}
    override fun refuel() {}
    override fun openDoors() {}
}*/

/* we can tackle this by making another interface that represents door:
interface VehicleInterface {
    fun drive()
    fun stop()
    fun refuel()
}
    
interface DoorInterface {
    fun openDoors()
}

class Motorcycle : VehicleInterface {
    override fun drive() {}
    override fun stop() {}
    override fun refuel() {}
}

class Car : VehicleInterface, DoorInterface {
    override fun drive() {}
    override fun stop() {}
    override fun refuel() {}
    override fun openDoors() {}
}
*/