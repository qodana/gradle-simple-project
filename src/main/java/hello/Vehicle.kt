package hello

import java.sql.DriverManager.println

open class Vehicle {
    open fun startEngine() {
        println("Vehicle engine started")
    }
}

class Car : Vehicle() {
    override fun startEngine() {
        println("Car engine started")
    }
}

fun getUsername(): String? {
    val username: String? = getUserInput() ?: null
    return username
}

fun getUserInput(): String? {
    return null
}
sdf

