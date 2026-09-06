open class Car(
    var type: String,
    var model: String,
    var price: Double,
    var owner: String,
    var milesDriven: Double
) {

    fun getCarInformation() {
        println("Car Type      : $type")
        println("Car Model     : $model")
        println("Car Price     : ₹$price")
        println("Owner         : $owner")
        println("Miles Driven  : $milesDriven")
    }

    fun getOriginalPrice(): Double {
        return price
    }

    fun getCurrentPrice(): Double {
        val depreciation = milesDriven * 0.10
        return price - depreciation
    }
    
    fun displayCarInformation() {
        println("----- Car Information -----")
        getCarInformation()
        println("Original Price: ₹${getOriginalPrice()}")
        println("Current Price : ₹${getCurrentPrice()}")
    }
}

class Suzuki(
    type: String,
    model: String,
    price: Double,
    owner: String,
    milesDriven: Double
) : Car(type, model, price, owner, milesDriven)

fun main() {

    val car = Suzuki(
        "SUV",
        "BMW",
        10000.0,
        "Jiya",
        5000.0
    )

    car.displayCarInformation()
}
